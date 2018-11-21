package dto;

import java.io.Serializable;

/**
 * sergexu
 * 2018/11/21 9:49 PM
 */
public class AccountDTO implements Serializable {
    /**
     * 账号信息
     */
    private String accountCode;
    /**
     * 账户名称
     */
    private String accountName;
    /**
     * 密码
     */
    private String password;
    /**
     * 链接
     */
    private String linkString;
    /**
     * 描述
     */
    private String desc;
    /**
     * 关联手机号
     */
    private String mobileNumber;

    public AccountDTO(String accountCode, String accountName, String password, String linkString, String desc,
                      String mobileNumber) {
        this.accountCode = accountCode;
        this.accountName = accountName;
        this.password = password;
        this.linkString = linkString;
        this.desc = desc;
        this.mobileNumber = mobileNumber;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLinkString() {
        return linkString;
    }

    public void setLinkString(String linkString) {
        this.linkString = linkString;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "AccountDTO{" +
            "accountCode='" + accountCode + '\'' +
            ", accountName='" + accountName + '\'' +
            ", password='" + password + '\'' +
            ", linkString='" + linkString + '\'' +
            ", desc='" + desc + '\'' +
            ", mobileNumber='" + mobileNumber + '\'' +
            '}';
    }
}
