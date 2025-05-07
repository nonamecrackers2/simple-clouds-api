package dev.nonamecrackers2.simpleclouds.api.common.cloud.spawning;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

import dev.nonamecrackers2.simpleclouds.api.common.cloud.region.ScAPICloudRegion;
import dev.nonamecrackers2.simpleclouds.api.common.world.ScAPISpawnRegion;

public interface ScAPICloudGenerator
{
	List<? extends ScAPICloudRegion> getClouds();
	
	List<? extends ScAPISpawnRegion> getSpawnRegions();
	
	List<? extends ScAPICloudRegion> api_getCloudsInRegion(ScAPISpawnRegion region);
	
	List<? extends ScAPISpawnRegion> api_getRegionsThatOccupyCloud(ScAPICloudRegion cloud);
	
	int getTotalCloudRegions();
	
	void api_setClouds(Collection<? extends ScAPICloudRegion> clouds);
	
	boolean removeAllClouds();
	
	boolean api_removeClouds(Predicate<? extends ScAPICloudRegion> predicate);
	
	boolean addCloudToTop(ScAPICloudRegion region);
	
	boolean addCloudToBottom(ScAPICloudRegion region);
	
	boolean addCloudUsingWeight(ScAPICloudRegion region);
	
	static enum ApiOrder
	{
		TOP,
		BOTTOM,
		USE_WEIGHT;
	}
}
