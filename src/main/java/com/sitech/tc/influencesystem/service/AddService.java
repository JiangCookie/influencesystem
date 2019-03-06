package com.sitech.tc.influencesystem.service;


import com.sitech.tc.influencesystem.common.ServerResponse;
import com.sitech.tc.influencesystem.pojo.Trouble;

import java.util.List;
import java.util.Map;

/**
 * @author JYH
 * 2019/2/27 10:02
 */
public interface AddService {



    /**
     * @Description: 添加故障
     * @param trouble
     * @return
     */
   ServerResponse add(Trouble trouble);

    /**
     * @Description: 获取故障列表
     * @return
     */
    Map<String,Object> getList(int page,int limit,int submitId);

    /**
     * @Description: 删除故障
     * @param troubleId
     * @return
     */
    ServerResponse delete(Integer troubleId);

    /**
     * @Description: 更改故障
     * @param trouble
     * @return
     */
    ServerResponse update(Trouble trouble);

    /**
     * @Description: 模糊查询
     * @param keyWord
     * @return
     */
    Map<String,Object> search(String keyWord,int page,int limit,int submitId);
}
