package com.sitech.tc.influencesystem.controller;

import com.sitech.tc.influencesystem.common.ServerResponse;
import com.sitech.tc.influencesystem.service.AddService;
import com.sitech.tc.influencesystem.pojo.FaultprocessJyh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
     * @param fault
     * @return
     */
    @PostMapping("add.do")
    public ServerResponse add(FaultprocessJyh fault){
        if( fault != null){
           return addService.add(fault);
        }
        return ServerResponse.createByErrorMessage("添加失败，没有数据");
    }

    /**
     * @Description 删除故障
     * @param faultId
     * @return
     */
    @PostMapping("delete.do")
    public ServerResponse delete(String faultId){
        if( faultId != null){
            return addService.delete(faultId);
        }
        return ServerResponse.createByErrorMessage("添加失败，没有数据");
    }


    /**
     * @Description 更新故障状态
     * @param faultprocessJyh
     * @return
     */
    @PostMapping("update.do")
    public ServerResponse update(FaultprocessJyh faultprocessJyh){
        if( faultprocessJyh != null){
            return addService.update(faultprocessJyh);
        }
        return ServerResponse.createByErrorMessage("更新失败，没有数据");
    }

    /**
     * @Description 更新故障状态
     * @param faultprocessJyh
     * @return
     */
    /**
     * @Description 查询故障列表
     * @return
     */
    @GetMapping("update.do")
    public ServerResponse selete(){
        return addService.getList();
    }
}
