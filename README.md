# fovclamp

> A lightweight client-sided Minecraft 1.20.x fabric mod with the sole purpose of setting a limit on your fov multiplier particularly useful for controlling extreme fov changes caused by speed effects such as soul speed.

A fov multiplier is different from the fov setting seen in game. It is the fov effect applied over the top of your regular fov while moving quickly.

## Configuration

The mod's settings can be configured using [ModMenu](https://github.com/TerraformersMC/ModMenu) and [owolib](https://github.com/wisp-forest/owo-lib). The primary setting is the maximum multiplier which is a float throughout from 1 to 1.5:

-   1.5 is the default maximum fov multiplier in the vanilla game.
-   1 represents the fov multiplier seen while standing still based on your fov in the vanilla game settings.

## Requirements

> Fabric loader 0.15.7