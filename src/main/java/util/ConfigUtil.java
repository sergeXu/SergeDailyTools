package util;

/**
 * sergexu
 * 2018/11/21 7:13 PM
 */
public class ConfigUtil {
    public static boolean debugMode = false;

    public static boolean isDebugMode() {
        return debugMode;
    }

    public static void setDebugMode(boolean debugMode) {
        ConfigUtil.debugMode = debugMode;
    }
}
