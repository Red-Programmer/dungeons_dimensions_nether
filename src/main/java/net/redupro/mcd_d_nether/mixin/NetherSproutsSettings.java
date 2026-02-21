package net.redupro.mcd_d_nether.mixin;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Slice;

@SuppressWarnings("UnresolvedMixinReference")
@Mixin(Blocks.class)
public class NetherSproutsSettings {
    @ModifyArg(method = "<clinit>", at = @At(value = "INVOKE:LAST", target = "Lnet/minecraft/world/level/block/Blocks;register(Ljava/lang/String;Ljava/util/function/Function;Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;)Lnet/minecraft/world/level/block/Block;"), slice=@Slice(to=@At(value = "FIELD", target = "Lnet/minecraft/world/level/block/Blocks;NETHER_SPROUTS:Lnet/minecraft/world/level/block/Block;", opcode = Opcodes.PUTSTATIC)))
    private static BlockBehaviour.Properties redirectBlockConstructor(BlockBehaviour.Properties original) {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_CYAN)
                .replaceable()
                .noCollision()
                .instabreak()
                .sound(SoundType.NETHER_SPROUTS)
                .offsetType(BlockBehaviour.OffsetType.XYZ)
                .pushReaction(PushReaction.DESTROY);
    }
}