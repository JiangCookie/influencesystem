package com.sitech.tc.influencesystem.pojo;

import javax.persistence.*;

@Table(name = "user")
public class User {
    @Id
    @Column(name = "user_id")
    private Byte userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 1 管理员  2  普通用户
     */
    private Integer role;

    /**
     * @return user_id
     */
    public Byte getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Byte userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取1 管理员  2  普通用户
     *
     * @return role - 1 管理员  2  普通用户
     */
    public Integer getRole() {
        return role;
    }

    /**
     * 设置1 管理员  2  普通用户
     *
     * @param role 1 管理员  2  普通用户
     */
    public void setRole(Integer role) {
        this.role = role;
    }
}