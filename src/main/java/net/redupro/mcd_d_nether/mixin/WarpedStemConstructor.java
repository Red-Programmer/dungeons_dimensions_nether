package net.redupro.mcd_d_nether.mixin;

import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Slice;

import java.util.function.Function;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;


@Mixin(Blocks.class)
public class WarpedStemConstructor {
    @ModifyArg(method = "<clinit>", at = @At(value = "INVOKE:LAST", target = "Lnet/minecraft/world/level/block/Blocks;register(Ljava/lang/String;Ljava/util/function/Function;Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;)Lnet/minecraft/world/level/block/Block;"), slice=@Slice(to=@At(value = "FIELD", target = "Lnet/minecraft/world/level/block/Blocks;WARPED_STEM:Lnet/minecraft/world/level/block/Block;", opcode = Opcodes.PUTSTATIC)))
    private static Function<BlockBehaviour.Properties, Block> redirectBlockConstructor(Function<BlockBehaviour.Properties, Block> original) {
        return net.redupro.mcd_d_nether.block.custom.WarpedStem::new;
    }
}