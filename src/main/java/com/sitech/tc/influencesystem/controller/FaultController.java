package com.sitech.tc.influencesystem.controller;

import com.sitech.tc.influencesystem.common.ServerResponse;
import com.sitech.tc.influencesystem.common.TypeEnum;
import com.sitech.tc.influencesystem.pojo.Trouble;
import com.sitech.tc.influencesystem.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Description 故障控制类
 * @author JYH
 * 2019/2/27 9:56
 */
@RestController
@RequestMapping("/fault/")
public class FaultController {


    @Autowired
    private AddService addService;

    /**
     * @Description 添加故障
     * @param trouble
     * @return
     */
    @PostMapping("add.do")
    public ServerResponse add(Trouble trouble){
        if( trouble != null){
           return addService.add(trouble);
        }
        return ServerResponse.createByErrorMessage("添加失败，没有数据");
    }

    /**
     * @Description 删除故障
     * @param faultId
     * @return
     */
    @PostMapping("delete.do")
    public ServerResponse delete(Integer faultId){
        if( faultId != null){
            return addService.delete(faultId);
        }
        return ServerResponse.createByErrorMessage("添加失败，没有数据");
    }


    /**
     * @Description 更新故障状态
     * @param trouble
     * @return
     */
    @PostMapping("update.do")
    public ServerResponse update(Trouble trouble){
        if( trouble != null){
            return addService.update(trouble);
        }
        return ServerResponse.createByErrorMessage("更新失败，没有数据");
    }


    /**
     * @Description 查询故障列表
     * @return
     */
    @GetMapping("list.do")
    public Map<String,Object> selete(){
        return addService.getList();
    }



}
