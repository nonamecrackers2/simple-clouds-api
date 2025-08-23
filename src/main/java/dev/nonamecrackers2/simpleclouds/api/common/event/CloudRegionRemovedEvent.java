package dev.nonamecrackers2.simpleclouds.api.common.event;

import javax.annotation.Nullable;

import dev.nonamecrackers2.simpleclouds.api.common.cloud.region.ScAPICloudRegion;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.Event;

public class CloudRegionRemovedEvent extends Event
{
	private final @Nullable Level level;
	private final ScAPICloudRegion region;
	private final CloudRegionRemovedEvent.Reason reason;
	
	public CloudRegionRemovedEvent(@Nullable Level level, ScAPICloudRegion region, CloudRegionRemovedEvent.Reason reason)
	{
		this.level = level;
		this.region = region;
		this.reason = reason;
	}
	
	public @Nullable Level getLevel()
	{
		return this.level;
	}
	
	public ScAPICloudRegion getCloudRegion()
	{
		return this.region;
	}
	
	public CloudRegionRemovedEvent.Reason getReason()
	{
		return this.reason;
	}
	
	public static enum Reason
	{
		NATURALLY,
		NO_LONGER_VISIBLE,
		MANUALLY,
		CLOUD_TYPE_NO_LONGER_EXISTS;
	}
}
