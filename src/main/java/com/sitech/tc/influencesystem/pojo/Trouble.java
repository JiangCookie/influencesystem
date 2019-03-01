package com.sitech.tc.influencesystem.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "trouble")
public class Trouble {
    /**
     * ���ϵ�id
     */
    @Id
    @Column(name = "trouble_id")
    private Integer troubleId;

    /**
     * ���ϵ�����
     */
    @Column(name = "table_name")
    private String tableName;

    /**
     * ���ϴ���ʱ��
     */
    @Column(name = "create_time")
    private String createTime;

    /**
     * ���Ϸ�����֧
     */
    @Column(name = "branch_id")
    private Integer branchId;

    /**
     * ��������
     */
    private String descipton;

    /**
     * ���ι���Ӱ��ϵͳ
     */
    @Column(name = "sys_id")
    private Integer sysId;

    /**
     * ������
     */
    @Column(name = "submit_id")
    private Byte submitId;

    /**
     * �ύʱ�䣨ʱ�����
     */
    @Column(name = "submit_time")
    private Date submitTime;

    /**
     * ����״̬��0δ����1�����Ѵ���
     */
    @Column(name = "trouble_state")
    private Integer troubleState;

    /**
     * ��ȡ���ϵ�id
     *
     * @return trouble_id - ���ϵ�id
     */
    public Integer getTroubleId() {
        return troubleId;
    }

    /**
     * ���ù��ϵ�id
     *
     * @param troubleId ���ϵ�id
     */
    public void setTroubleId(Integer troubleId) {
        this.troubleId = troubleId;
    }

    /**
     * ��ȡ���ϵ�����
     *
     * @return table_name - ���ϵ�����
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * ���ù��ϵ�����
     *
     * @param tableName ���ϵ�����
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * ��ȡ���ϴ���ʱ��
     *
     * @return create_time - ���ϴ���ʱ��
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * ���ù��ϴ���ʱ��
     *
     * @param createTime ���ϴ���ʱ��
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * ��ȡ���Ϸ�����֧
     *
     * @return branch_id - ���Ϸ�����֧
     */
    public Integer getBranchId() {
        return branchId;
    }

    /**
     * ���ù��Ϸ�����֧
     *
     * @param branchId ���Ϸ�����֧
     */
    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    /**
     * ��ȡ��������
     *
     * @return descipton - ��������
     */
    public String getDescipton() {
        return descipton;
    }

    /**
     * ���ù�������
     *
     * @param descipton ��������
     */
    public void setDescipton(String descipton) {
        this.descipton = descipton == null ? null : descipton.trim();
    }

    /**
     * ��ȡ���ι���Ӱ��ϵͳ
     *
     * @return sys_id - ���ι���Ӱ��ϵͳ
     */
    public Integer getSysId() {
        return sysId;
    }

    /**
     * ���ñ��ι���Ӱ��ϵͳ
     *
     * @param sysId ���ι���Ӱ��ϵͳ
     */
    public void setSysId(Integer sysId) {
        this.sysId = sysId;
    }

    /**
     * ��ȡ������
     *
     * @return submit_id - ������
     */
    public Byte getSubmitId() {
        return submitId;
    }

    /**
     * ���ô�����
     *
     * @param submitId ������
     */
    public void setSubmitId(Byte submitId) {
        this.submitId = submitId;
    }

    /**
     * ��ȡ�ύʱ�䣨ʱ�����
     *
     * @return submit_time - �ύʱ�䣨ʱ�����
     */
    public Date getSubmitTime() {
        return submitTime;
    }

    /**
     * �����ύʱ�䣨ʱ�����
     *
     * @param submitTime �ύʱ�䣨ʱ�����
     */
    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * ��ȡ����״̬��0δ����1�����Ѵ���
     *
     * @return trouble_state - ����״̬��0δ����1�����Ѵ���
     */
    public Integer getTroubleState() {
        return troubleState;
    }

    /**
     * ���ù���״̬��0δ����1�����Ѵ���
     *
     * @param troubleState ����״̬��0δ����1�����Ѵ���
     */
    public void setTroubleState(Integer troubleState) {
        this.troubleState = troubleState;
    }
}