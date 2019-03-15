package com.DS.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseProjectTree<M extends BaseProjectTree<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setPId(java.lang.Integer pId) {
		set("pId", pId);
	}
	
	public java.lang.Integer getPId() {
		return getInt("pId");
	}

	public void setCId(java.lang.Integer cId) {
		set("cId", cId);
	}
	
	public java.lang.Integer getCId() {
		return getInt("cId");
	}

	public void setUserId(java.lang.Integer userId) {
		set("userId", userId);
	}
	
	public java.lang.Integer getUserId() {
		return getInt("userId");
	}

	public void setProjectId(java.lang.Integer projectId) {
		set("projectId", projectId);
	}
	
	public java.lang.Integer getProjectId() {
		return getInt("projectId");
	}

	public void setTaskName(java.lang.String taskName) {
		set("taskName", taskName);
	}
	
	public java.lang.String getTaskName() {
		return getStr("taskName");
	}

	public void setChecked(java.lang.String checked) {
		set("checked", checked);
	}
	
	public java.lang.String getChecked() {
		return getStr("checked");
	}

	public void setOpen(java.lang.String open) {
		set("open", open);
	}
	
	public java.lang.String getOpen() {
		return getStr("open");
	}

	public void setStartDate(java.util.Date startDate) {
		set("startDate", startDate);
	}
	
	public java.util.Date getStartDate() {
		return get("startDate");
	}

	public void setEndDate(java.util.Date endDate) {
		set("endDate", endDate);
	}
	
	public java.util.Date getEndDate() {
		return get("endDate");
	}

	public void setDepiction(java.lang.String depiction) {
		set("depiction", depiction);
	}
	
	public java.lang.String getDepiction() {
		return getStr("depiction");
	}

}
