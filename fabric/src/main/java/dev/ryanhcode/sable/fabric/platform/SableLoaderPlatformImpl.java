package dev.ryanhcode.sable.fabric.platform;

import dev.ryanhcode.sable.platform.SableLoaderPlatform;
import net.fabricmc.loader.api.FabricLoader;
import org.jetbrains.annotations.Nullable;

import java.nio.file.Path;

public class SableLoaderPlatformImpl implements SableLoaderPlatform {
	@Override
	public String getModVersion(final String modId) {
		return FabricLoader.getInstance()
				.getModContainer(modId)
				.orElseThrow()
				.getMetadata()
				.getVersion()
				.getFriendlyString();
	}

	@Override
	@Nullable
	public Path getGameDirectory() {
		return FabricLoader.getInstance().getGameDir();
	}
}
