package net.redupro.mcd_d_nether.mixin;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.redupro.mcd_d_nether.block.custom.WartBlock;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Objects;
import java.util.function.Function;

@Mixin(Blocks.class)
public abstract class NetherSproutsSettings {
    @Shadow
    private static Block register(String string, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties properties) {
        return null;
    }

    @ModifyArg(method = "<clinit>", at = @At(value = "INVOKE:LAST", target = "Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;offsetType(Lnet/minecraft/world/level/block/state/BlockBehaviour$OffsetType;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;"), slice=@Slice(to=@At(value = "FIELD", target = "Lnet/minecraft/world/level/block/Blocks;NETHER_SPROUTS:Lnet/minecraft/world/level/block/Block;", opcode = Opcodes.PUTSTATIC)))
    private static BlockBehaviour.OffsetType editOffsetType(BlockBehaviour.OffsetType offsetType) {
        return BlockBehaviour.OffsetType.XYZ;
    }

    @Inject(method = "register(Ljava/lang/String;Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;)Lnet/minecraft/world/level/block/Block;", at = @At("HEAD"), cancellable = true)
    private static void editBlockBehavior(String string, BlockBehaviour.Properties properties, CallbackInfoReturnable<Block> cir) {
        if(Objects.equals(string, "warped_wart_block")) {
            cir.setReturnValue(register(string, WartBlock::new, properties));
        }
    }
}