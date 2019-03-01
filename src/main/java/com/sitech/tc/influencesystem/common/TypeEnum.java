package com.sitech.tc.influencesystem.common;

/**
 * @author JYH
 * 2019/3/1 8:35
 */
public enum TypeEnum {

    // 订单中心
    ORDERCENTER("1","订单中心"),

    // 账单中心
    BILLCENTER("2","账单中心"),

    // 开通中心
    OPENCENTER("3","开通中心"),

    // 结算中心
    ACCOUNTCENTER("4","结算中心");

    public final String type;
    public final String value;

    TypeEnum(String type, String value){
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

}