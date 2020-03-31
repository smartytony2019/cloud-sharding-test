package com.xinbo.cloud.sharding.test.controller;

import cn.hutool.core.util.IdUtil;
import com.xinbo.cloud.common.constant.WorkerIdConfig;
import com.xinbo.cloud.common.domain.common.TbOrder;
import com.xinbo.cloud.common.dto.ActionResult;
import com.xinbo.cloud.common.dto.PageDto;
import com.xinbo.cloud.common.dto.ResultFactory;
import com.xinbo.cloud.common.service.common.TbOrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TbOrderController {


    @Autowired
    @Qualifier("tbOrderServiceImpl")
    private TbOrderService tbOrderService;

    @GetMapping("insert1")
    @ApiOperation("插入数据")
    public String insert1() {
        TbOrder tbOrder = new TbOrder();
        tbOrder.setId(IdUtil.createSnowflake(WorkerIdConfig.SPORT, 1).nextId());
        tbOrder.setOrderId(1L);
        tbOrder.setUserId(IdUtil.createSnowflake(WorkerIdConfig.USER, 1).nextId());
        tbOrder.setDatanode(1L);
        int result = tbOrderService.insert(tbOrder);
        return result > 0 ? "success": "error";
    }

    @GetMapping("insert2")
    @ApiOperation("插入数据")
    public String insert2() {
        TbOrder tbOrder = new TbOrder();
        tbOrder.setId(IdUtil.createSnowflake(WorkerIdConfig.SPORT, 1).nextId());
        tbOrder.setOrderId(2L);
        tbOrder.setUserId(IdUtil.createSnowflake(WorkerIdConfig.USER, 1).nextId());
        tbOrder.setDatanode(2L);
        int result = tbOrderService.insert(tbOrder);
        return result > 0 ? "success": "error";
    }



    @GetMapping("insert3")
    @ApiOperation("插入数据")
    public String insert3() {
        TbOrder tbOrder = new TbOrder();
        tbOrder.setId(IdUtil.createSnowflake(WorkerIdConfig.SPORT, 1).nextId());
        tbOrder.setOrderId(3L);
        tbOrder.setUserId(IdUtil.createSnowflake(WorkerIdConfig.USER, 1).nextId());
        tbOrder.setDatanode(3L);
        int result = tbOrderService.insert(tbOrder);
        return result > 0 ? "success": "error";
    }



    @GetMapping("insert4")
    @ApiOperation("插入数据")
    public String insert4() {
        TbOrder tbOrder = new TbOrder();
        tbOrder.setId(IdUtil.createSnowflake(WorkerIdConfig.SPORT, 1).nextId());
        tbOrder.setOrderId(4L);
        tbOrder.setUserId(IdUtil.createSnowflake(WorkerIdConfig.USER, 1).nextId());
        tbOrder.setDatanode(4L);
        int result = tbOrderService.insert(tbOrder);
        return result > 0 ? "success": "error";
    }



    @GetMapping("insert5")
    @ApiOperation("插入数据")
    public String insert5() {
        TbOrder tbOrder = new TbOrder();
        tbOrder.setId(IdUtil.createSnowflake(WorkerIdConfig.SPORT, 1).nextId());
        tbOrder.setOrderId(5L);
        tbOrder.setUserId(IdUtil.createSnowflake(WorkerIdConfig.USER, 1).nextId());
        tbOrder.setDatanode(5L);
        int result = tbOrderService.insert(tbOrder);
        return result > 0 ? "success": "error";
    }



    @GetMapping("insert6")
    @ApiOperation("插入数据")
    public String insert6() {
        TbOrder tbOrder = new TbOrder();
        tbOrder.setId(IdUtil.createSnowflake(WorkerIdConfig.SPORT, 1).nextId());
        tbOrder.setOrderId(6L);
        tbOrder.setUserId(IdUtil.createSnowflake(WorkerIdConfig.USER, 1).nextId());
        tbOrder.setDatanode(6L);
        int result = tbOrderService.insert(tbOrder);
        return result > 0 ? "success": "error";
    }



    @GetMapping("insert7")
    @ApiOperation("插入数据")
    public String insert7() {
        TbOrder tbOrder = new TbOrder();
        tbOrder.setId(IdUtil.createSnowflake(WorkerIdConfig.SPORT, 1).nextId());
        tbOrder.setOrderId(7L);
        tbOrder.setUserId(IdUtil.createSnowflake(WorkerIdConfig.USER, 1).nextId());
        tbOrder.setDatanode(7L);
        int result = tbOrderService.insert(tbOrder);
        return result > 0 ? "success": "error";
    }

    @GetMapping("insert8")
    @ApiOperation("插入数据")
    public String insert8() {
        TbOrder tbOrder = new TbOrder();
        tbOrder.setId(IdUtil.createSnowflake(WorkerIdConfig.SPORT, 1).nextId());
        tbOrder.setOrderId(8L);
        tbOrder.setUserId(IdUtil.createSnowflake(WorkerIdConfig.USER, 1).nextId());
        tbOrder.setDatanode(8L);
        int result = tbOrderService.insert(tbOrder);
        return result > 0 ? "success": "error";
    }

    @GetMapping("insert9")
    @ApiOperation("插入数据")
    public String insert9() {
        TbOrder tbOrder = new TbOrder();
        tbOrder.setId(IdUtil.createSnowflake(WorkerIdConfig.SPORT, 1).nextId());
        tbOrder.setOrderId(9L);
        tbOrder.setUserId(IdUtil.createSnowflake(WorkerIdConfig.USER, 1).nextId());
        tbOrder.setDatanode(9L);
        int result = tbOrderService.insert(tbOrder);
        return result > 0 ? "success": "error";
    }


    @GetMapping("test4")
    @ApiOperation("获取所有")
    public ActionResult test4() {
        List<TbOrder> tbOrders = tbOrderService.getAll();
        tbOrders.forEach(tbOrder -> {
            System.out.println(tbOrder);
        });
        return ResultFactory.success(tbOrders);
    }


    @GetMapping("test5")
    @ApiOperation("获取单条记录")
    public ActionResult test5() {
        TbOrder tbOrder = tbOrderService.getSingle();
        return ResultFactory.success(tbOrder);
    }


    @GetMapping("test6")
    @ApiOperation("获取集合")
    public ActionResult test6() {
        List<TbOrder> list = tbOrderService.getList();
        return ResultFactory.success(list);
    }




    @GetMapping("test7")
    @ApiOperation("分页测试")
    public ActionResult test7() {
        PageDto<TbOrder> page = tbOrderService.page();
        return ResultFactory.success(page);
    }
}
