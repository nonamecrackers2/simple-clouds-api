package dev.nonamecrackers2.simpleclouds.api.common.cloud;

import dev.nonamecrackers2.simpleclouds.api.common.cloud.weather.WeatherType;
import net.minecraft.resources.ResourceLocation;

public interface ScAPICloudType
{
	ResourceLocation id();
	
	WeatherType weatherType();
	
	float storminess();
	
	float stormStart();
	
	float stormFadeDistance();
	
	float transparencyFade();
}
