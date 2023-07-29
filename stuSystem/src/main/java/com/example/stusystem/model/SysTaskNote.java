package com.example.stusystem.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SysTaskNote implements Serializable {
    @ApiModelProperty(value = "心得id")
    private Integer id;

    @ApiModelProperty(value = "心得时间")
    private Date time;

    @ApiModelProperty(value = "心得权限")
    private Integer notePower;

    @ApiModelProperty(value = "心得内容")
    private String notes;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getNotePower() {
        return notePower;
    }

    public void setNotePower(Integer notePower) {
        this.notePower = notePower;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", time=").append(time);
        sb.append(", notePower=").append(notePower);
        sb.append(", notes=").append(notes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}