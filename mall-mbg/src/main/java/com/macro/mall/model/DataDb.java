package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

@Data
public class DataDb implements Serializable {
    private String id;

    @ApiModelProperty(value = "连接名称")
    private String connName;

    @ApiModelProperty(value = "连接信息")
    private String connStr;

    @ApiModelProperty(value = "是否启用")
    private Boolean isEnabled;

    @ApiModelProperty(value = "查询类型")
    private String queryType;

    @ApiModelProperty(value = "创建时间")
    private Date createdOn;

    @ApiModelProperty(value = "修改时间")
    private Date modifiedOn;

    @ApiModelProperty(value = "时间戳")
    private Byte[] dateTimeStamp;

    @ApiModelProperty(value = "版本号")
    private Integer version;

    @ApiModelProperty(value = "接口数量")
    private Integer apiNumbers;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", connName=").append(connName);
        sb.append(", connStr=").append(connStr);
        sb.append(", isEnabled=").append(isEnabled);
        sb.append(", queryType=").append(queryType);
        sb.append(", createdOn=").append(createdOn);
        sb.append(", modifiedOn=").append(modifiedOn);
        sb.append(", dateTimeStamp=").append(Arrays.toString(dateTimeStamp));
        sb.append(", version=").append(version);
        sb.append(", apiNumbers=").append(apiNumbers);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
