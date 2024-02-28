package fovclamp.mixin;

import fovclamp.Fovclamp;
import fovclamp.Util;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.client.network.AbstractClientPlayerEntity;

@Mixin(AbstractClientPlayerEntity.class)
public class FovMultiplierMixin {
	@Inject(method = "getFovMultiplier", at = @At("RETURN"), cancellable = true)
	private void onGetFovMultiplier(CallbackInfoReturnable<Float> info) {
		float fov = info.getReturnValue();

		if (!Fovclamp.CONFIG.enabled()){
			return;
		}

		float clamp = Util.clamp(
				fov,
				0,
				Fovclamp.CONFIG.max()
			);

		info.setReturnValue(clamp);
	}
}