package com.DS.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseQrtzLocks<M extends BaseQrtzLocks<M>> extends Model<M> implements IBean {

	public void setSchedName(java.lang.String schedName) {
		set("SCHED_NAME", schedName);
	}
	
	public java.lang.String getSchedName() {
		return getStr("SCHED_NAME");
	}

	public void setLockName(java.lang.String lockName) {
		set("LOCK_NAME", lockName);
	}
	
	public java.lang.String getLockName() {
		return getStr("LOCK_NAME");
	}

}
