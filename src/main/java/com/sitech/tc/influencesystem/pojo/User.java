package com.sitech.tc.influencesystem.pojo;

import javax.persistence.*;

@Table(name = "user")
public class User {
    @Id
    @Column(name = "user_id")
    private Byte userId;

    /**
     * �û���
     */
    private String username;

    /**
     * ����
     */
    private String password;

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
     * ��ȡ�û���
     *
     * @return username - �û���
     */
    public String getUsername() {
        return username;
    }

    /**
     * �����û���
     *
     * @param username �û���
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * ��ȡ����
     *
     * @return password - ����
     */
    public String getPassword() {
        return password;
    }

    /**
     * ��������
     *
     * @param password ����
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}