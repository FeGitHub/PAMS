package com.DS.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseQrtzCalendars<M extends BaseQrtzCalendars<M>> extends Model<M> implements IBean {

	public void setSchedName(java.lang.String schedName) {
		set("SCHED_NAME", schedName);
	}
	
	public java.lang.String getSchedName() {
		return getStr("SCHED_NAME");
	}

	public void setCalendarName(java.lang.String calendarName) {
		set("CALENDAR_NAME", calendarName);
	}
	
	public java.lang.String getCalendarName() {
		return getStr("CALENDAR_NAME");
	}

	public void setCALENDAR(byte[] CALENDAR) {
		set("CALENDAR", CALENDAR);
	}
	
	public byte[] getCALENDAR() {
		return get("CALENDAR");
	}

}
