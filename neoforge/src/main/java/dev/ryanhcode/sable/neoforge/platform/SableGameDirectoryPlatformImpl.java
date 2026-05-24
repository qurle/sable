package dev.ryanhcode.sable.neoforge.platform;

import dev.ryanhcode.sable.platform.SableGameDirectoryPlatform;
import net.neoforged.fml.loading.FMLPaths;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

import java.nio.file.Path;

@ApiStatus.Internal
public class SableGameDirectoryPlatformImpl implements SableGameDirectoryPlatform {

	@Override
	@Nullable
	public Path getGameDirectory() {
		return FMLPaths.GAMEDIR.get();
	}
}
