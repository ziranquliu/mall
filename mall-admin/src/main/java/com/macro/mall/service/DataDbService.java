package com.macro.mall.service;

import com.macro.mall.model.DataDb;
import com.macro.mall.model.UmsMenu;

import java.util.List;

public interface DataDbService {

    /**
     * 分页查询后台数据库
     */
    List<DataDb> list(Integer pageSize, Integer pageNum);
}
