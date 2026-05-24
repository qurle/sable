package dev.ryanhcode.sable.fabric.platform;

import dev.ryanhcode.sable.platform.SableGameDirectoryPlatform;
import net.fabricmc.loader.api.FabricLoader;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

import java.nio.file.Path;

@ApiStatus.Internal
public class SableGameDirectoryPlatformImpl implements SableGameDirectoryPlatform {

	@Override
	@Nullable
	public Path getGameDirectory() {
		return FabricLoader.getInstance().getGameDir();
	}
}
