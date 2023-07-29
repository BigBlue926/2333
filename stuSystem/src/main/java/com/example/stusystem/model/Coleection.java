package com.example.stusystem.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Coleection implements Serializable {
    @ApiModelProperty(value = "教材id")
    private Integer materialId;

    @ApiModelProperty(value = "课件id")
    private Integer couserwareId;

    @ApiModelProperty(value = "用户id")
    private Integer userId;

    private static final long serialVersionUID = 1L;

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public Integer getCouserwareId() {
        return couserwareId;
    }

    public void setCouserwareId(Integer couserwareId) {
        this.couserwareId = couserwareId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", materialId=").append(materialId);
        sb.append(", couserwareId=").append(couserwareId);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}