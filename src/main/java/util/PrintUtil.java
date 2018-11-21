package util;

/**
 * sergexu
 * 2018/11/21 4:41 PM
 */
public class PrintUtil {

    /**
     * 封装输出方法
     * @param string
     */
    public static void print(String string){
        print(string,ConfigUtil.debugMode);
    }

    public static void print(String string,boolean debugMode){
        if(debugMode) {
            System.out.println(string);
        }
    }
}
