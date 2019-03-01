package com.sitech.tc.influencesystem.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "trouble")
public class Trouble {
    /**
     * 故障单id
     */
    @Id
    @Column(name = "trouble_id")
    private Integer troubleId;

    /**
     * 故障单名称
     */
    @Column(name = "table_name")
    private String tableName;

    /**
     * 故障创建时间
     */
    @Column(name = "create_time")
    private String createTime;

    /**
     * 故障发生分支
     */
    @Column(name = "branch_id")
    private Integer branchId;

    /**
     * 故障描述
     */
    private String descipton;

    /**
     * 本次故障影响系统
     */
    @Column(name = "sys_id")
    private Integer sysId;

    /**
     * 创建人
     */
    @Column(name = "submit_id")
    private Byte submitId;

    /**
     * 提交时间（时间戳）
     */
    @Column(name = "submit_time")
    private Date submitTime;

    /**
     * 故障状态（0未处理，1代表已处理）
     */
    @Column(name = "trouble_state")
    private Integer troubleState;

    /**
     * 获取故障单id
     *
     * @return trouble_id - 故障单id
     */
    public Integer getTroubleId() {
        return troubleId;
    }

    /**
     * 设置故障单id
     *
     * @param troubleId 故障单id
     */
    public void setTroubleId(Integer troubleId) {
        this.troubleId = troubleId;
    }

    /**
     * 获取故障单名称
     *
     * @return table_name - 故障单名称
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 设置故障单名称
     *
     * @param tableName 故障单名称
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * 获取故障创建时间
     *
     * @return create_time - 故障创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置故障创建时间
     *
     * @param createTime 故障创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * 获取故障发生分支
     *
     * @return branch_id - 故障发生分支
     */
    public Integer getBranchId() {
        return branchId;
    }

    /**
     * 设置故障发生分支
     *
     * @param branchId 故障发生分支
     */
    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    /**
     * 获取故障描述
     *
     * @return descipton - 故障描述
     */
    public String getDescipton() {
        return descipton;
    }

    /**
     * 设置故障描述
     *
     * @param descipton 故障描述
     */
    public void setDescipton(String descipton) {
        this.descipton = descipton == null ? null : descipton.trim();
    }

    /**
     * 获取本次故障影响系统
     *
     * @return sys_id - 本次故障影响系统
     */
    public Integer getSysId() {
        return sysId;
    }

    /**
     * 设置本次故障影响系统
     *
     * @param sysId 本次故障影响系统
     */
    public void setSysId(Integer sysId) {
        this.sysId = sysId;
    }

    /**
     * 获取创建人
     *
     * @return submit_id - 创建人
     */
    public Byte getSubmitId() {
        return submitId;
    }

    /**
     * 设置创建人
     *
     * @param submitId 创建人
     */
    public void setSubmitId(Byte submitId) {
        this.submitId = submitId;
    }

    /**
     * 获取提交时间（时间戳）
     *
     * @return submit_time - 提交时间（时间戳）
     */
    public Date getSubmitTime() {
        return submitTime;
    }

    /**
     * 设置提交时间（时间戳）
     *
     * @param submitTime 提交时间（时间戳）
     */
    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * 获取故障状态（0未处理，1代表已处理）
     *
     * @return trouble_state - 故障状态（0未处理，1代表已处理）
     */
    public Integer getTroubleState() {
        return troubleState;
    }

    /**
     * 设置故障状态（0未处理，1代表已处理）
     *
     * @param troubleState 故障状态（0未处理，1代表已处理）
     */
    public void setTroubleState(Integer troubleState) {
        this.troubleState = troubleState;
    }
}