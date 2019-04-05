package com.czxy.user.domain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class User implements Serializable {
    private String id; //唯一标识
    private String loginName; //登录名
    private String loginPwd; //登录密码
    private String userName; //用户名（昵称）
    private String sex; //性别
    private String education; //学历
    private String birthday; //生日
    private String telephone; //电话
    private String[] interest; //兴趣爱好
    private String remark; //备注
    private String utype; //权限： 管理员/普通用户

    public User() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", loginName='" + loginName + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", education='" + education + '\'' +
                ", birthday='" + birthday + '\'' +
                ", telephone='" + telephone + '\'' +
                ", interest=" + Arrays.toString(interest) +
                ", remark='" + remark + '\'' +
                ", utype='" + utype + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String[] getInterest() {
        return interest;
    }

    public void setInterest(String[] interest) {
        this.interest = interest;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUtype() {
        return utype;
    }

    public void setUtype(String utype) {
        this.utype = utype;
    }

    public User(String id, String loginName, String loginPwd, String userName, String sex, String education, String birthday, String telephone, String[] interest, String remark, String utype) {
        this.id = id;
        this.loginName = loginName;
        this.loginPwd = loginPwd;
        this.userName = userName;
        this.sex = sex;
        this.education = education;
        this.birthday = birthday;
        this.telephone = telephone;
        this.interest = interest;
        this.remark = remark;
        this.utype = utype;
    }
}
