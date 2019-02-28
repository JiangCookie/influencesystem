package com.sitech.tc.influencesystem.mapper;

import com.sitech.tc.influencesystem.pojo.FaultprocessJyh;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author JYH
 * 2019/2/27 10:02
 */

public interface FaultprocessJyhMapper extends Mapper<FaultprocessJyh> {

    /**
     * 保存用户，返回主键
     */
    int insertAdd(FaultprocessJyh faultprocessJyh);
}