package com.sitech.tc.influencesystem.pojo;

import javax.persistence.*;

@Table(name = "faultProcess_jyh")
public class FaultprocessJyh {
    @Id
    private Integer id;

    private String faultName;


    private String dateTime;

    private String branch;


    private String systemType;

    private String desc1;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return fault_name
     */
    public String getFaultName() {
        return faultName;
    }

    /**
     * @param faultName
     */
    public void setFaultName(String faultName) {
        this.faultName = faultName == null ? null : faultName.trim();
    }

    /**
     * @return date_time
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * @param dateTime
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime == null ? null : dateTime.trim();
    }

    /**
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    /**
     * @param branch
     */
    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }

    /**
     * @return system_type
     */
    public String getSystemType() {
        return systemType;
    }

    /**
     * @param systemType
     */
    public void setSystemType(String systemType) {
        this.systemType = systemType == null ? null : systemType.trim();
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return desc1;
    }

    /**
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc1 = desc == null ? null : desc.trim();
    }
}