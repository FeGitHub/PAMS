package com.DS.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseRemind<M extends BaseRemind<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setSubject(java.lang.String subject) {
		set("subject", subject);
	}
	
	public java.lang.String getSubject() {
		return getStr("subject");
	}

	public void setContent(java.lang.String content) {
		set("content", content);
	}
	
	public java.lang.String getContent() {
		return getStr("content");
	}

	public void setRemindTime(java.util.Date remindTime) {
		set("remindTime", remindTime);
	}
	
	public java.util.Date getRemindTime() {
		return get("remindTime");
	}

	public void setMail(java.lang.String mail) {
		set("mail", mail);
	}
	
	public java.lang.String getMail() {
		return getStr("mail");
	}

	public void setAddTime(java.util.Date addTime) {
		set("addTime", addTime);
	}
	
	public java.util.Date getAddTime() {
		return get("addTime");
	}

	public void setUserId(java.lang.Integer userId) {
		set("userId", userId);
	}
	
	public java.lang.Integer getUserId() {
		return getInt("userId");
	}

	public void setUserName(java.lang.String userName) {
		set("userName", userName);
	}
	
	public java.lang.String getUserName() {
		return getStr("userName");
	}

}
