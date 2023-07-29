package com.example.stusystem.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SysUserTaskCon implements Serializable {
    @ApiModelProperty(value = "用户ID")
    private Integer stuUserId;

    @ApiModelProperty(value = "任务ID")
    private Integer studyTaskId;

    @ApiModelProperty(value = "是否参与任务")
    private String isPart;

    @ApiModelProperty(value = "是否完成任务")
    private String isFinish;

    @ApiModelProperty(value = "学习进度")
    private Float rate;

    @ApiModelProperty(value = "上次登录ip")
    private String learnIp;

    @ApiModelProperty(value = "已学时长")
    private Date haveLearnTime;

    @ApiModelProperty(value = "心得id")
    private Integer taskNoteId;

    private static final long serialVersionUID = 1L;

    public Integer getStuUserId() {
        return stuUserId;
    }

    public void setStuUserId(Integer stuUserId) {
        this.stuUserId = stuUserId;
    }

    public Integer getStudyTaskId() {
        return studyTaskId;
    }

    public void setStudyTaskId(Integer studyTaskId) {
        this.studyTaskId = studyTaskId;
    }

    public String getIsPart() {
        return isPart;
    }

    public void setIsPart(String isPart) {
        this.isPart = isPart == null ? null : isPart.trim();
    }

    public String getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(String isFinish) {
        this.isFinish = isFinish == null ? null : isFinish.trim();
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public String getLearnIp() {
        return learnIp;
    }

    public void setLearnIp(String learnIp) {
        this.learnIp = learnIp == null ? null : learnIp.trim();
    }

    public Date getHaveLearnTime() {
        return haveLearnTime;
    }

    public void setHaveLearnTime(Date haveLearnTime) {
        this.haveLearnTime = haveLearnTime;
    }

    public Integer getTaskNoteId() {
        return taskNoteId;
    }

    public void setTaskNoteId(Integer taskNoteId) {
        this.taskNoteId = taskNoteId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stuUserId=").append(stuUserId);
        sb.append(", studyTaskId=").append(studyTaskId);
        sb.append(", isPart=").append(isPart);
        sb.append(", isFinish=").append(isFinish);
        sb.append(", rate=").append(rate);
        sb.append(", learnIp=").append(learnIp);
        sb.append(", haveLearnTime=").append(haveLearnTime);
        sb.append(", taskNoteId=").append(taskNoteId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}