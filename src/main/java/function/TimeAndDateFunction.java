package function;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import util.PrintUtil;

/**
 * sergexu
 * 2018/11/21 11:07 PM
 */
public class TimeAndDateFunction implements BasicFunction {
    @Override
    public void execute(String arg, Scanner scanner) {
            try {
                Date date = new Date();
                PrintUtil.print("今天日期");
                PrintUtil.print(DateFormat.getDateInstance().format(date));
                PrintUtil.print("现在时间");
                //使用2种格式进行输出
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy年MM月dd日 E HH时mm分ss秒");
                PrintUtil.print(simpleDateFormat.format(date));
                PrintUtil.print(simpleDateFormat2.format(date));
                PrintUtil.print("时间戳："+String.valueOf(date.getTime()));
                //Calendar calendar = Calendar.getInstance();
            }catch (Exception e){
                PrintUtil.print("发生异常：" + e.toString());
                PrintUtil.print(e.getStackTrace().toString());
            }finally {
                PrintUtil.print("-------------------");
            }
        }
}
