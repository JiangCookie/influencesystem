package com.sitech.tc.influencesystem.service.impl;

import com.sitech.tc.influencesystem.common.ServerResponse;
import com.sitech.tc.influencesystem.mapper.FaultprocessJyhMapper;
import com.sitech.tc.influencesystem.pojo.FaultprocessJyh;
import com.sitech.tc.influencesystem.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @author JYH
 * 2019/2/27 10:05
 */
@Service
public class AddServiceImpl implements AddService {

    @Autowired
    private FaultprocessJyhMapper faultProcess_jiangyhMapper;


    @Override
    public ServerResponse add(FaultprocessJyh faultprocessJyh) {
        int count = faultProcess_jiangyhMapper.insert(faultprocessJyh);
        if(count > 0 ){
            return ServerResponse.createBySuccessMessage("添加故障成功");
        }
        return ServerResponse.createByErrorMessage("添加故障失败");
    }

    @Override
    public ServerResponse<List<FaultprocessJyh>> getList() {
        List<FaultprocessJyh> result = faultProcess_jiangyhMapper.selectAll();
        return ServerResponse.createBySuccess(result);
    }

    @Override
    public ServerResponse delete(String faultId) {
        int result = faultProcess_jiangyhMapper.deleteByPrimaryKey(faultId);
        if(result > 0 ){
            return ServerResponse.createBySuccessMessage("删除故障成功");
        }
        return ServerResponse.createByErrorMessage("删除故障失败");
    }

    @Override
    public ServerResponse update(FaultprocessJyh faultprocessJyh) {

        int  result = faultProcess_jiangyhMapper.updateByPrimaryKeySelective(faultprocessJyh);
        if(result > 0 ){
            return ServerResponse.createBySuccessMessage("更新故障成功");
        }
        return ServerResponse.createByErrorMessage("更新故障失败");
    }
}
