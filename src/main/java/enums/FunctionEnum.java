package enums;

/**
 * sergexu
 * 2018/11/21 5:25 PM
 */
public enum FunctionEnum {

    HELP("h","help","获取指令列表"),
    EXIT("exit","exit","结束应用"),
    PASSWORD("pw","password","密码提示输出"),
    NUMBER_TO_BIT("ntb","numberToBit","数字2进制编码");


    private String abbr;
    private String title;
    private String desc;

    FunctionEnum(String abbr, String title, String desc) {
        this.abbr = abbr;
        this.title = title;
        this.desc = desc;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public FunctionEnum getTilleByAbbr(String abbr){
        for(FunctionEnum functionEnum : FunctionEnum.values()){
            if(functionEnum.getAbbr().equals(abbr)){
                return functionEnum;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "FunctionEnum{" +
            "abbr='" + abbr + '\'' +
            ", title='" + title + '\'' +
            ", desc='" + desc + '\'' +
            '}';
    }

    public static String getAllFunctionDesc(){
        //循环使用StringBuilder减少开销
        StringBuilder stringBuilder  = new StringBuilder();
        for(FunctionEnum functionEnum : FunctionEnum.values()){
            stringBuilder.append(functionEnum.getTitle());
            stringBuilder.append("(");
            stringBuilder.append(functionEnum.getAbbr());
            stringBuilder.append(")");
            stringBuilder.append("[");
            stringBuilder.append(functionEnum.getDesc());
            stringBuilder.append("]");
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
