package function;

import java.util.Scanner;

import util.PrintUtil;

/**
 * sergexu
 * 2018/11/21 5:50 PM
 * 用于将十进制数字转换为2进制的功能
 */
public class NumberToBineryFunction extends BasicFunction{

    public static void excute(String arg, Scanner scanner) {
        PrintUtil.print("请输入目标数字，输入非数字退出");
        try {
            while (true) {
                Long longNum = scanner.nextLong();
                PrintUtil.print(Long.toBinaryString(longNum));
                PrintUtil.print("请输入数字：");
            }
        }catch (Exception e){
            PrintUtil.print("发生异常：" + e.toString());
            PrintUtil.print(e.getStackTrace().toString());
        }finally {
            PrintUtil.print("-------------------------");
        }
    }
}
