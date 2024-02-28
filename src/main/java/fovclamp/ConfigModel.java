package fovclamp;

import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.RangeConstraint;
import io.wispforest.owo.config.annotation.Modmenu;

@Modmenu(modId = "fovclamp")
@Config(name = "fov", wrapperName = "Config")
public class ConfigModel {
    @RangeConstraint(min = 0f, max = 1.5f)
    public float max = 1.5f;
    public boolean enabled = true;
}
