package com.example.stusystem.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SysNoteMaterialsCon implements Serializable {
    @ApiModelProperty(value = "笔记ID")
    private Integer materialsNoteId;

    @ApiModelProperty(value = "课件id")
    private Integer materialsId;

    private static final long serialVersionUID = 1L;

    public Integer getMaterialsNoteId() {
        return materialsNoteId;
    }

    public void setMaterialsNoteId(Integer materialsNoteId) {
        this.materialsNoteId = materialsNoteId;
    }

    public Integer getMaterialsId() {
        return materialsId;
    }

    public void setMaterialsId(Integer materialsId) {
        this.materialsId = materialsId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", materialsNoteId=").append(materialsNoteId);
        sb.append(", materialsId=").append(materialsId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}