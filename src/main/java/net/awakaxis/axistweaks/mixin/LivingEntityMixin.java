package net.awakaxis.axistweaks.mixin;

import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {
    @ModifyConstant(method="isBlocking", constant=@Constant(intValue = 5))
    private int bypassShieldBlockTimer(int value) {
        return 0;
    }
}
