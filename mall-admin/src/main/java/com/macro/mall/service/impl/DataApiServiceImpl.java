package com.macro.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.config.DataSource;
import com.macro.mall.config.DataSourceEnum;
import com.macro.mall.mapper.DataApiMapper;
import com.macro.mall.model.DataApi;
import com.macro.mall.service.DataApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 接口Service实现类
 * Created by macro on 2018/6/1.
 */
@Service
public class DataApiServiceImpl implements DataApiService {
    @Autowired
    private DataApiMapper dataApiMapper;

    @Override
    @DataSource(DataSourceEnum.DB2)
    public List<DataApi> list(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return dataApiMapper.selectAll();
    }
}
