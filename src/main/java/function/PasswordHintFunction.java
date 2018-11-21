package function;

import java.util.Scanner;

import enums.FunctionEnum;
import util.PrintUtil;

/**
 * sergexu
 * 2018/11/21 7:56 PM
 */
public class PasswordHintFunction {
    public static void excute(String arg, Scanner scanner) {
        try {
            PrintUtil.print("密码提示列表");

        }catch (Exception e){
            PrintUtil.print("发生异常：" + e.toString());
            PrintUtil.print(e.getStackTrace().toString());
        }finally {
            PrintUtil.print("-------------------");
        }
    }
}
