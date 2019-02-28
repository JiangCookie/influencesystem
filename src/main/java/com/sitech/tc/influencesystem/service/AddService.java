package com.sitech.tc.influencesystem.service;


import com.sitech.tc.influencesystem.common.ServerResponse;
import com.sitech.tc.influencesystem.pojo.FaultprocessJyh;

import java.util.List;

/**
 * @author JYH
 * 2019/2/27 10:02
 */
public interface AddService {



    /**
     * @Description: 添加故障
     * @param faultprocessJyh
     * @return
     */
   ServerResponse add(FaultprocessJyh faultprocessJyh);

    /**
     * @Description: 获取故障列表
     * @return
     */
    ServerResponse<List<FaultprocessJyh>> getList();

    /**
     * @Description: 删除故障
     * @param faultId
     * @return
     */
    ServerResponse delete(String faultId);

    /**
     * @Description: 更改故障
     * @param faultprocessJyh
     * @return
     */
    ServerResponse update(FaultprocessJyh faultprocessJyh);


}
