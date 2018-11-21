import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import enums.FunctionEnum;
import function.HelpFunction;
import function.NumberToBineryFunction;
import function.PasswordHintFunction;
import util.ConfigUtil;
import util.PrintUtil;

import static util.PrintUtil.print;
import static util.PrintUtil.printD;

/**
 * sergexu
 * 2018/11/21 4:40 PM
 */
public class MainEntry {

    private static Scanner scanner;

    public static void main(String[] args) {
        init();
        String input = null;
        do {
            try {
                input = scanner.nextLine();
                if (input != null) {
                    input = input.trim();
                }
                printD("input: " + input);
                ////功能模块
                if (FunctionEnum.EXIT.getAbbr().equals(input) || FunctionEnum.EXIT.getTitle().equals(input)) {
                    funcRunDecs(FunctionEnum.EXIT);
                } else if (FunctionEnum.NUMBER_TO_BIT.getAbbr().equals(input) || FunctionEnum.NUMBER_TO_BIT.getTitle()
                    .equals(input)) {
                    funcRunDecs(FunctionEnum.NUMBER_TO_BIT);
                    NumberToBineryFunction.excute(null, scanner);
                } else if (FunctionEnum.HELP.getAbbr().equals(input) || FunctionEnum.HELP.getTitle().equals(input)) {
                    funcRunDecs(FunctionEnum.HELP);
                    HelpFunction.excute(null, scanner);
                } else if (FunctionEnum.PASSWORD.getAbbr().equals(input) || FunctionEnum.PASSWORD.getTitle().equals(
                    input)) {
                    funcRunDecs(FunctionEnum.PASSWORD);
                    (new PasswordHintFunction()).excute(null, scanner);
                } else {
                    print("功能: " + input + "  未找到，请重新输入指令");
                }
                print("**** 指令输入：****");
            } catch (RuntimeException e) {
                if (e instanceof InputMismatchException) {
                    print("输入数据格式错误，程序已停止 ");
                } else {
                    print("系统异常，程序已停止 ");
                }
                printD("Error " + "    " + e.toString());
                printD(Arrays.toString(e.getStackTrace()));

            }
        } while (!(FunctionEnum.EXIT.getTitle().equals(input)));
        close();
    }

    public static void init() {
        print("WelCome to SergeTools: ");
        print("(input 'exit' to stop)");
        scanner = new Scanner(System.in);
    }

    public static void close() {
        scanner.close();
        print("程序已关闭");
    }

    private static void funcRunDecs(FunctionEnum functionEnum) {
        print("功能: " + functionEnum.getDesc() + "  执行中");
    }
}
