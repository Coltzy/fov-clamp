package fovclamp;

public class Util {
    public static float clamp(float value, float min, float max) {
        return Math.max(min, Math.min(max, value));
    }
}
