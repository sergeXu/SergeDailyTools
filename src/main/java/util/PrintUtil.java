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
        print(string,true);
    }

    /**
     * debug 模式输出方法
     * @param string
     */
    public static void printD(String string){
        print(string,ConfigUtil.isDebugMode());
    }

    public static void print(String string,boolean isPrint){
        if(isPrint) {
            System.out.println(string);
        }
    }
}
