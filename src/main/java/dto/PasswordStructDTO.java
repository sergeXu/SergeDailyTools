package dto;

import java.io.Serializable;

/**
 * sergexu
 * 2018/11/21 8:39 PM
 */
public class PasswordStructDTO implements Serializable{

    /**
     * 密码值
     */
    private String password;
    /**
     * 描述
     */
    private String desc;
    /**
     * 加密级别
     */
    private Integer level;
    /**
     * 使用场景
     */
    private String usingSence;
    /**
     * 加密密钥
     */
    private String encryptionKey;
    /**
     * 原始密码
     */
    private String oringePassword;

    //public PasswordStructDTO() {
    //}

    public PasswordStructDTO(String password, String desc, Integer level, String usingSence, String encryptionKey,
                             String oringePassword) {
        this.password = password;
        this.desc = desc;
        this.level = level;
        this.usingSence = usingSence;
        this.encryptionKey = encryptionKey;
        this.oringePassword = oringePassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getUsingSence() {
        return usingSence;
    }

    public void setUsingSence(String usingSence) {
        this.usingSence = usingSence;
    }

    public String getEncryptionKey() {
        return encryptionKey;
    }

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    public String getOringePassword() {
        return oringePassword;
    }

    public void setOringePassword(String oringePassword) {
        this.oringePassword = oringePassword;
    }

    @Override
    public String toString() {
        return "PasswordStructDTO{" +
            "password='" + password + '\'' +
            ", desc='" + desc + '\'' +
            ", level=" + level +
            ", usingSence='" + usingSence + '\'' +
            ", encryptionKey='" + encryptionKey + '\'' +
            ", oringePassword='" + oringePassword + '\'' +
            '}';
    }
}
