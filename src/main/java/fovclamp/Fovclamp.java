package fovclamp;

import net.fabricmc.api.ClientModInitializer;

import fovclamp.Config;

public class Fovclamp implements ClientModInitializer {
	public static final Config CONFIG = Config.createAndLoad();

	@Override
	public void onInitializeClient() {
		return;
	}
}