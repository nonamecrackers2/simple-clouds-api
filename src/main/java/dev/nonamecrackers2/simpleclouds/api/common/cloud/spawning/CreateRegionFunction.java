package dev.nonamecrackers2.simpleclouds.api.common.cloud.spawning;

import java.util.Optional;

import javax.annotation.Nonnull;

import dev.nonamecrackers2.simpleclouds.api.common.cloud.region.ScAPICloudRegion;
import net.minecraft.util.RandomSource;

@FunctionalInterface
public interface CreateRegionFunction
{
	Optional<? extends ScAPICloudRegion> create(@Nonnull SpawnInfo info, float playerX, float playerZ, float x, float z, RandomSource random, boolean growTime);
}
