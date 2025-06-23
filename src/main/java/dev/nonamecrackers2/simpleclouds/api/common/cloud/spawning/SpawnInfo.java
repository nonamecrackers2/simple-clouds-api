package dev.nonamecrackers2.simpleclouds.api.common.cloud.spawning;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;

public interface SpawnInfo
{
	ResourceLocation cloudType();
	
	int orderWeight();
	
	boolean movesToPlayer();
	
	float determineSpeed(RandomSource random);
	
	int determineRadius(RandomSource random);
	
	int determineExistTicks(RandomSource random);
	
	int determineGrowTicks(RandomSource random);
	
	float determineStretchFactor(RandomSource random);
}
