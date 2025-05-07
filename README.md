# Simple Clouds API

A fairly basic API for the [Simple Clouds](https://github.com/nonamecrackers2/simple-clouds) mod.

This API is designed to allow mod developers to interact with Simple Clouds without requiring it as a dependency, which can be useful in situations where a mod wants to add an optional compatibility feature without always having Simple Clouds as a dependency in their mod development environment.

> [!NOTE]
> Documentation is currently limited

## Usage

To use the API, include the following in your ``build.gradle`` file:

```gradle
maven {
	name "nonamecrackers2Maven"
	url "https://maven.nonamecrackers2.dev/releases"
}

dependencies {
	implementation fg.deobf("nonamecrackers2:simplecloudsapi-forge:${api_version}")
}
```

Add the Simple Clouds mod as a dependency when needed to test features that use the API

> [!IMPORTANT]
> Do not shadow or jar-in-jar the API. It is included inside of the Simple Clouds mod. **Your mod should be designed to only use the API when Simple Clouds is detected and loaded.**
