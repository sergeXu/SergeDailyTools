package function;

import java.util.Scanner;

import enums.FunctionEnum;
import util.PrintUtil;

/**
 * sergexu
 * 2018/11/21 7:03 PM
 */
public final class HelpFunction implements BasicFunction{
    @Override
    public void excute(String arg, Scanner scanner) {
        try {
            PrintUtil.print("可执行命令列表");
            PrintUtil.print(FunctionEnum.getAllFunctionDesc());
        }catch (Exception e){
            PrintUtil.print("发生异常：" + e.toString());
            PrintUtil.print(e.getStackTrace().toString());
        }finally {
            PrintUtil.print("-------------------");
        }
    }
}
