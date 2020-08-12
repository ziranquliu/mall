package com.macro.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.config.DataSource;
import com.macro.mall.config.DataSourceEnum;
import com.macro.mall.mapper.DataDbMapper;
import com.macro.mall.mapper.UmsMenuMapper;
import com.macro.mall.model.DataDb;
import com.macro.mall.model.UmsMenuExample;
import com.macro.mall.service.DataDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 数据库Service实现类
 * Created by macro on 2018/6/1.
 */
@Service
public class DataDbServiceImpl implements DataDbService {
    @Autowired
    private DataDbMapper dataDbMapper;

    @Override
    @DataSource(DataSourceEnum.DB2)
    public List<DataDb> list(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return dataDbMapper.selectAll();
    }
}
