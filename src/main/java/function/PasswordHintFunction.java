package function;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.PasswordStructDTO;
import util.PrintUtil;

/**
 * sergexu
 * 2018/11/21 7:56 PM
 */
public final class PasswordHintFunction {
    private static List<PasswordStructDTO> passwordStructDTOList ;

    public void excute(String arg, Scanner scanner) {
        try {
            fillPasswordHintFunctionList();
            PrintUtil.print("密码提示列表");
            PrintUtil.print(passwordStructDTOList.toString());
        }catch (Exception e){
            PrintUtil.print("发生异常：" + e.toString());
            PrintUtil.print(e.getStackTrace().toString());
        }finally {
            PrintUtil.print("-------------------");
        }
    }

    public static void main(String[] args) {
        (new PasswordHintFunction()).excute(null,new Scanner(System.in));
    }

    /**
     * 初始化数据列表
     */
    private List<PasswordStructDTO> initPasswordHintFunctionList(){
        if(passwordStructDTOList == null) {
            passwordStructDTOList = new ArrayList<>(16);
        }
        return passwordStructDTOList;
    }

    /**
     * 填充列表元素
     * @param passwordStructDTO
     * @return
     */
    private boolean  addPasswordStructDTONode(PasswordStructDTO passwordStructDTO){
        if(passwordStructDTO == null){
            return false;
        }
        return passwordStructDTOList.add(passwordStructDTO);
    }

    /**
     * 填充列表元素
     */
    private void addPasswordStructDTO(PasswordStructDTO passwordStructDTO){
        boolean isAdd = addPasswordStructDTONode(passwordStructDTO);
        if(!isAdd){
            PrintUtil.printD("passwordStructDTO 初始化失败"+ passwordStructDTO.toString());
        }
    }

    /**
     * 初始化列表
     */
    private void fillPasswordHintFunctionList(){
        initPasswordHintFunctionList();
        addPasswordStructDTO(new PasswordStructDTO("xiphoid","精简密码",4,"game/webPage","",""));
        addPasswordStructDTO(new PasswordStructDTO("xiphoid00","精简密码",4,"computer","",""));
        addPasswordStructDTO(new PasswordStructDTO("Xiphoid00","大小写密码",4,"login","",""));
    }


}
