package dev.ryanhcode.sable.neoforge.platform;

import dev.ryanhcode.sable.platform.SableLoaderPlatform;
import net.neoforged.fml.loading.LoadingModList;
import org.jetbrains.annotations.Nullable;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SableLoaderPlatformImpl implements SableLoaderPlatform {
	@Override
	public String getModVersion(final String modId) {
		return LoadingModList.get().getModFileById(modId).versionString();
	}

	@Override
	@Nullable
	public Path getGameDirectory() {
		try {
			final Class<?> fmlPathsClass = Class.forName("net.neoforged.fml.loading.FMLPaths");
			final Object gameDirSupplier = fmlPathsClass.getField("GAMEDIR").get(null);
			final Object gameDir = gameDirSupplier.getClass().getMethod("get").invoke(gameDirSupplier);
			if (gameDir instanceof Path path) {
				return path;
			}
			if (gameDir != null) {
				return Paths.get(gameDir.toString());
			}
		} catch (final ReflectiveOperationException | SecurityException ignored) {
		}
		return null;
	}
}
