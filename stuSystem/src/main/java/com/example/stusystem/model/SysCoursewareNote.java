package com.example.stusystem.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SysCoursewareNote implements Serializable {
    @ApiModelProperty(value = "笔记id")
    private Integer id;

    @ApiModelProperty(value = "笔记权限id")
    private Integer notesPowerId;

    @ApiModelProperty(value = "笔记时间")
    private Date time;

    @ApiModelProperty(value = "笔记内容")
    private String notes;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNotesPowerId() {
        return notesPowerId;
    }

    public void setNotesPowerId(Integer notesPowerId) {
        this.notesPowerId = notesPowerId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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
        sb.append(", notesPowerId=").append(notesPowerId);
        sb.append(", time=").append(time);
        sb.append(", notes=").append(notes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}