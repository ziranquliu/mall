package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

@Data
public class DataApi implements Serializable {
    private String id;

    @ApiModelProperty(value = "接口名称")
    private String interfaceName;

    @ApiModelProperty(value = "接口内容")
    private String interfaceContent;

    @ApiModelProperty(value = "链接数据库")
    private String connId;

    @ApiModelProperty(value = "链接数据库名称")
    private String connName;

    @ApiModelProperty(value = "是否启用")
    private Boolean isEnabled;

    @ApiModelProperty(value = "创建时间")
    private Date createdOn;

    @ApiModelProperty(value = "修改时间")
    private Date modifiedOn;

    @ApiModelProperty(value = "时间戳")
    private Byte[] dateTimeStamp;

    @ApiModelProperty(value = "版本号")
    private Integer version;

    @ApiModelProperty(value = "支持方法")
    private Integer httpMethod;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", interfaceName=").append(interfaceName);
        sb.append(", interfaceContent=").append(interfaceContent);
        sb.append(", connId=").append(connId);
        sb.append(", createdOn=").append(createdOn);
        sb.append(", modifiedOn=").append(modifiedOn);
        sb.append(", dateTimeStamp=").append(Arrays.toString(dateTimeStamp));
        sb.append(", version=").append(version);
        sb.append(", httpMethod=").append(httpMethod);
        sb.append(", isEnabled=").append(isEnabled);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
