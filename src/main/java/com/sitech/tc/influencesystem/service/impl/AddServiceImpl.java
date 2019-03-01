package com.sitech.tc.influencesystem.service.impl;

import com.github.pagehelper.PageHelper;
import com.sitech.tc.influencesystem.common.ServerResponse;
import com.sitech.tc.influencesystem.common.TypeEnum;
import com.sitech.tc.influencesystem.mapper.TroubleMapper;
import com.sitech.tc.influencesystem.pojo.Trouble;
import com.sitech.tc.influencesystem.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author JYH
 * 2019/2/27 10:05
 */
@Service
public class AddServiceImpl implements AddService {

    @Autowired
    private TroubleMapper troubleMapper;


    @Override
    public ServerResponse add(Trouble trouble) {
        trouble.setTroubleState(0);
        int count = troubleMapper.insert(trouble);
        if(count > 0 ){
            return ServerResponse.createBySuccessMessage("添加故障成功");
        }
        return ServerResponse.createByErrorMessage("添加故障失败");
    }

    @Override
    public Map<String,Object> getList() {
        List<Trouble> result = troubleMapper.selectAll();
//        for(int i=0;i<result.size();i++){
//            Integer type = result.get(i).getTroubleState();
//           result.get(i).setTroubleState(String.valueOf(type));
//        }
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("code",0);
        resultMap.put("data",result);
        resultMap.put("msg","");
        resultMap.put("count",1000);

        return resultMap;
    }

    @Override
    public ServerResponse delete(Integer troubleId) {
        Trouble trouble = new Trouble();
        trouble.setTroubleId(troubleId);
        trouble.setTroubleState(1);

        int result = troubleMapper.updateByPrimaryKeySelective(trouble);
        if(result > 0 ){
            return ServerResponse.createBySuccessMessage("删除故障成功");
        }
        return ServerResponse.createByErrorMessage("删除故障失败");
    }

    @Override
    public ServerResponse update(Trouble trouble) {
        trouble.setTroubleState(1);
        int  result = troubleMapper.updateByPrimaryKeySelective(trouble);
        if(result > 0 ){
            return ServerResponse.createBySuccessMessage("更新故障成功");
        }
        return ServerResponse.createByErrorMessage("更新故障失败");
    }

    /**
     * 枚举固定值
     * @param type
     * @return
     */
    public String change(String type) {
        String value = null;
        switch (type) {
            case "1":
                value = TypeEnum.ORDERCENTER.value;
                break;
            case "2":
                value = TypeEnum.BILLCENTER.value;
                break;
            case "3":
                value = TypeEnum.OPENCENTER.value;
                break;
            default:
                value = TypeEnum.ACCOUNTCENTER.value;
                break;
        }

        return value;
    }
}
