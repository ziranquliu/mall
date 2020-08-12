package com.macro.mall.service;

import com.macro.mall.model.DataApi;

import java.util.List;

public interface DataApiService {

    /**
     * 分页查询后台数据库
     */
    List<DataApi> list(Integer pageSize, Integer pageNum);
}
