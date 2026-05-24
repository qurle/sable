package dev.ryanhcode.sable.platform;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

import java.nio.file.Path;

@ApiStatus.Internal
public interface SableLoaderPlatform {
	SableLoaderPlatform INSTANCE = SablePlatformUtil.load(SableLoaderPlatform.class);
	
	String getModVersion(String modId);

	/**
	 * @return the absolute game directory for the current loader, or {@code null} if it is unavailable.
	 */
	@Nullable
	Path getGameDirectory();
}
