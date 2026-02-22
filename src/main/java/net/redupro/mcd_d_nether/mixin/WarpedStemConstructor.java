package net.redupro.mcd_d_nether.mixin;

import net.minecraft.world.level.material.MapColor;
import net.redupro.mcd_d_nether.block.custom.WarpedStem;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Slice;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;


@Mixin(Blocks.class)
public class WarpedStemConstructor {
    @ModifyArg(method = "<clinit>", at = @At(value = "INVOKE:LAST", target = "Lnet/minecraft/world/level/block/Blocks;register(Ljava/lang/String;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/world/level/block/Block;"), slice=@Slice(to=@At(value = "FIELD", target = "Lnet/minecraft/world/level/block/Blocks;WARPED_STEM:Lnet/minecraft/world/level/block/Block;", opcode = Opcodes.PUTSTATIC)))
    private static Block redirectBlockConstructor(Block original) {
        return new WarpedStem(
                BlockBehaviour.Properties.of()
                        .mapColor(MapColor.WARPED_STEM)
        );
    }
}