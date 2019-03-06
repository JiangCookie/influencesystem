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
     * 1 ����Ա  2  ��ͨ�û�
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

    /**
     * ��ȡ1 ����Ա  2  ��ͨ�û�
     *
     * @return role - 1 ����Ա  2  ��ͨ�û�
     */
    public Integer getRole() {
        return role;
    }

    /**
     * ����1 ����Ա  2  ��ͨ�û�
     *
     * @param role 1 ����Ա  2  ��ͨ�û�
     */
    public void setRole(Integer role) {
        this.role = role;
    }
}