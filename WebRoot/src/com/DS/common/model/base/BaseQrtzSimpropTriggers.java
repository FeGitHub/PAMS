package com.DS.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseQrtzSimpropTriggers<M extends BaseQrtzSimpropTriggers<M>> extends Model<M> implements IBean {

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

	public void setStrProp1(java.lang.String strProp1) {
		set("STR_PROP_1", strProp1);
	}
	
	public java.lang.String getStrProp1() {
		return getStr("STR_PROP_1");
	}

	public void setStrProp2(java.lang.String strProp2) {
		set("STR_PROP_2", strProp2);
	}
	
	public java.lang.String getStrProp2() {
		return getStr("STR_PROP_2");
	}

	public void setStrProp3(java.lang.String strProp3) {
		set("STR_PROP_3", strProp3);
	}
	
	public java.lang.String getStrProp3() {
		return getStr("STR_PROP_3");
	}

	public void setIntProp1(java.lang.Integer intProp1) {
		set("INT_PROP_1", intProp1);
	}
	
	public java.lang.Integer getIntProp1() {
		return getInt("INT_PROP_1");
	}

	public void setIntProp2(java.lang.Integer intProp2) {
		set("INT_PROP_2", intProp2);
	}
	
	public java.lang.Integer getIntProp2() {
		return getInt("INT_PROP_2");
	}

	public void setLongProp1(java.lang.Long longProp1) {
		set("LONG_PROP_1", longProp1);
	}
	
	public java.lang.Long getLongProp1() {
		return getLong("LONG_PROP_1");
	}

	public void setLongProp2(java.lang.Long longProp2) {
		set("LONG_PROP_2", longProp2);
	}
	
	public java.lang.Long getLongProp2() {
		return getLong("LONG_PROP_2");
	}

	public void setDecProp1(java.math.BigDecimal decProp1) {
		set("DEC_PROP_1", decProp1);
	}
	
	public java.math.BigDecimal getDecProp1() {
		return get("DEC_PROP_1");
	}

	public void setDecProp2(java.math.BigDecimal decProp2) {
		set("DEC_PROP_2", decProp2);
	}
	
	public java.math.BigDecimal getDecProp2() {
		return get("DEC_PROP_2");
	}

	public void setBoolProp1(java.lang.String boolProp1) {
		set("BOOL_PROP_1", boolProp1);
	}
	
	public java.lang.String getBoolProp1() {
		return getStr("BOOL_PROP_1");
	}

	public void setBoolProp2(java.lang.String boolProp2) {
		set("BOOL_PROP_2", boolProp2);
	}
	
	public java.lang.String getBoolProp2() {
		return getStr("BOOL_PROP_2");
	}

}
