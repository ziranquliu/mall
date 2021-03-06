package com.macro.mall.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.model.DataApi;
import com.macro.mall.service.DataApiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 后台接口管理Controller
 */
@Controller
@Api(tags = "DataApiController", description = "后台接口管理")
@RequestMapping("/api")
public class DataApiController {
    @Autowired
    private DataApiService dataApiService;

    @ApiOperation("分页查询后台接口")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DataApi>> list(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                 @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<DataApi> dataList = dataApiService.list(pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(dataList));
    }

    @ApiOperation("启用禁用")
    @RequestMapping(value = "/updateEnabled/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateEnabled(@PathVariable String id, @RequestParam("enabled") Boolean enabled) {
        int count = dataApiService.updateEnabled(id, enabled);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }
}
