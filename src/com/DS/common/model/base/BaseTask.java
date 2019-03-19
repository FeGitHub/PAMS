package com.DS.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseTask<M extends BaseTask<M>> extends Model<M> implements IBean {

	public void setTaskId(java.lang.Integer taskId) {
		set("taskId", taskId);
	}
	
	public java.lang.Integer getTaskId() {
		return getInt("taskId");
	}

	public void setTaskName(java.lang.String taskName) {
		set("taskName", taskName);
	}
	
	public java.lang.String getTaskName() {
		return getStr("taskName");
	}

	public void setAddTime(java.util.Date addTime) {
		set("addTime", addTime);
	}
	
	public java.util.Date getAddTime() {
		return get("addTime");
	}

	public void setGoal(java.lang.Integer goal) {
		set("goal", goal);
	}
	
	public java.lang.Integer getGoal() {
		return getInt("goal");
	}

	public void setDeadline(java.util.Date deadline) {
		set("deadline", deadline);
	}
	
	public java.util.Date getDeadline() {
		return get("deadline");
	}

	public void setDescription(java.lang.String description) {
		set("description", description);
	}
	
	public java.lang.String getDescription() {
		return getStr("description");
	}

	public void setUserId(java.lang.Integer userId) {
		set("userId", userId);
	}
	
	public java.lang.Integer getUserId() {
		return getInt("userId");
	}

	public void setStart(java.util.Date start) {
		set("start", start);
	}
	
	public java.util.Date getStart() {
		return get("start");
	}

	public void setEnd(java.util.Date end) {
		set("end", end);
	}
	
	public java.util.Date getEnd() {
		return get("end");
	}

}