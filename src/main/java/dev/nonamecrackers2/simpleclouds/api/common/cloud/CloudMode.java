package dev.nonamecrackers2.simpleclouds.api.common.cloud;

import net.minecraft.util.StringRepresentable;

public enum CloudMode implements StringRepresentable
{
	DEFAULT("default"),
	SINGLE("single"),
	AMBIENT("ambient");

	private final String name;
	
	private CloudMode(String name)
	{
		this.name = name;
	}
	
	@Override
	public String getSerializedName()
	{
		return this.name;
	}
}
