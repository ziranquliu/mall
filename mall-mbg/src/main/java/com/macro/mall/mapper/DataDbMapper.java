package com.macro.mall.mapper;

import com.macro.mall.model.DataApi;
import com.macro.mall.model.DataDb;

import java.util.List;

public interface DataDbMapper {
    List<DataDb> selectAll();

    DataDb selectOneByKey(String id);

    int updateEnabled(DataDb dataDb);
}
