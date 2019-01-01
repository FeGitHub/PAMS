package com.DS.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseQrtzBlobTriggers<M extends BaseQrtzBlobTriggers<M>> extends Model<M> implements IBean {

	public void setSchedName(java.lang.String schedName) {
		set("SCHED_NAME", schedName);
	}
	
	public java.lang.String getSchedName() {
		return getStr("SCHED_NAME");
	}

	public void setTriggerName(java.lang.String triggerName) {
		set("TRIGGER_NAME", triggerName);
	}
	
	public java.lang.String getTriggerName() {
		return getStr("TRIGGER_NAME");
	}

	public void setTriggerGroup(java.lang.String triggerGroup) {
		set("TRIGGER_GROUP", triggerGroup);
	}
	
	public java.lang.String getTriggerGroup() {
		return getStr("TRIGGER_GROUP");
	}

	public void setBlobData(byte[] blobData) {
		set("BLOB_DATA", blobData);
	}
	
	public byte[] getBlobData() {
		return get("BLOB_DATA");
	}

}
