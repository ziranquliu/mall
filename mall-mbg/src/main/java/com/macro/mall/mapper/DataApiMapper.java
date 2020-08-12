package com.macro.mall.mapper;

import com.macro.mall.model.DataApi;

import java.util.List;

/**
 * @author ruifeng.chang
 */
public interface DataApiMapper {
    List<DataApi> selectAll();

    DataApi  selectOneByKey(String id);

    int updateEnabled(DataApi dataApi);
}
