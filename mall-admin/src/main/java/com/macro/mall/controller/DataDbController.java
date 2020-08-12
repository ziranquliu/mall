package com.macro.mall.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.model.DataDb;
import com.macro.mall.service.DataDbService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 后台数据库管理Controller
 */
@Controller
@Api(tags = "DataDbController", description = "后台数据库管理")
@RequestMapping("/db")
public class DataDbController {
    @Autowired
    private DataDbService dataDbService;

    @ApiOperation("分页查询后台数据库")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DataDb>> list(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                 @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<DataDb> dataList = dataDbService.list(pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(dataList));
    }

    @ApiOperation("启用禁用")
    @RequestMapping(value = "/updateEnabled/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateEnabled(@PathVariable String id, @RequestParam("enabled") Boolean enabled) {
        int count = dataDbService.updateEnabled(id, enabled);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }
}
