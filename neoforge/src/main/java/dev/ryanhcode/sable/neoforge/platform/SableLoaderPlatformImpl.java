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

package dev.ryanhcode.sable.neoforge.platform;

import dev.ryanhcode.sable.platform.SableLoaderPlatform;
import net.neoforged.fml.loading.FMLPaths;
import net.neoforged.fml.loading.LoadingModList;
import org.jetbrains.annotations.Nullable;

import java.nio.file.Path;

public class SableLoaderPlatformImpl implements SableLoaderPlatform {
	@Override
	public String getModVersion(final String modId) {
		return LoadingModList.get().getModFileById(modId).versionString();
	}

	@Override
	@Nullable
	public Path getGameDirectory() {
		return FMLPaths.GAMEDIR.get();
	}
}

