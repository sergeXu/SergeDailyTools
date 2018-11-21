package function;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.AccountDTO;
import enums.FunctionEnum;
import util.PrintUtil;

/**
 * 账号信息记录
 * sergexu
 * 2018/11/21 9:42 PM
 */
public class AccoutHintFunction implements BasicFunction{
    private static List<AccountDTO> accountDTOList;
    @Override
    public void execute(String arg, Scanner scanner) {
        try {
            fillPasswordHintFunctionList();
            PrintUtil.print("账户信息提示列表");
            PrintUtil.print(accountDTOList.toString());
        }catch (Exception e){
            PrintUtil.print("发生异常：" + e.toString());
            PrintUtil.print(e.getStackTrace().toString());
        }finally {
            PrintUtil.print("-------------------");
        }
    }

    /**
     * 初始化数据列表
     */
    private List<AccountDTO> initAccoutHintFunctionList(){
        if(accountDTOList == null) {
            accountDTOList = new ArrayList<>(16);
        }
        return accountDTOList;
    }

    /**
     * 填充列表元素
     * @param accountDTO
     * @return
     */
    private boolean  addAccountDTONode(AccountDTO accountDTO){
        if(accountDTO == null){
            return false;
        }
        return accountDTOList.add(accountDTO);
    }

    /**
     * 填充列表元素
     */
    private void addPAccountDTO(AccountDTO accountDTO){
        boolean isAdd = addAccountDTONode(accountDTO);
        if(!isAdd){
            PrintUtil.printD("accountDTO 初始化失败"+ accountDTO.toString());
        }
    }

    /**
     * 初始化列表
     */
    private void fillPasswordHintFunctionList(){
        initAccoutHintFunctionList();
        addPAccountDTO(new AccountDTO("serge_xu@163.com","serge","xiphoid00","www.douban.com","豆瓣账号","15158899034"));
        addPAccountDTO(new AccountDTO("serge_xu@163.com","serge","xiphoid","www.imooc.com","慕课网","15158899034"));
        addPAccountDTO(new AccountDTO("moonxiphoid@163.com",null,"xiphoid",null,"崩坏3","13262280218"));
    }




}
