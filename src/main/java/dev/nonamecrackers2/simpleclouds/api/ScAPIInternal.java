package dev.nonamecrackers2.simpleclouds.api;

import javax.annotation.Nullable;

import org.apache.maven.artifact.versioning.ArtifactVersion;
import org.apache.maven.artifact.versioning.DefaultArtifactVersion;

public class ScAPIInternal
{
	protected static @Nullable SimpleCloudsAPI instance;
	protected static ArtifactVersion version = new DefaultArtifactVersion("1.1");
	
	public static void _setApi(SimpleCloudsAPI api)
	{
		if (instance != null)
			throw new IllegalStateException("API instance already set");
		instance = api;
	}
}
