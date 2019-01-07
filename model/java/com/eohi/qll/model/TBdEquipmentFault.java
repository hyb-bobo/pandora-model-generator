package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class TBdEquipmentFault extends BaseModel<String> {

	private Integer sortNo;
	private String note;
	private String equipmentTypeId;
	private String modeId;
	private String factoryId;
	private String manufactureId;
	private String faultDesc;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"sortNo", "sort no",
	 	"note", "note",
	 	"equipmentTypeId", "equipment type id",
	 	"modeId", "mode id",
	 	"factoryId", "factory id",
	 	"manufactureId", "manufacture id",
	 	"faultDesc", "fault desc"
	); 
	
	public Integer getSortNo() {
		return sortNo;
	}

	public void setSortNo(Integer sortNo) {
		this.sortNo = sortNo;
	}
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public String getEquipmentTypeId() {
		return equipmentTypeId;
	}

	public void setEquipmentTypeId(String equipmentTypeId) {
		this.equipmentTypeId = equipmentTypeId;
	}
	
	public String getModeId() {
		return modeId;
	}

	public void setModeId(String modeId) {
		this.modeId = modeId;
	}
	
	public String getFactoryId() {
		return factoryId;
	}

	public void setFactoryId(String factoryId) {
		this.factoryId = factoryId;
	}
	
	public String getManufactureId() {
		return manufactureId;
	}

	public void setManufactureId(String manufactureId) {
		this.manufactureId = manufactureId;
	}
	
	public String getFaultDesc() {
		return faultDesc;
	}

	public void setFaultDesc(String faultDesc) {
		this.faultDesc = faultDesc;
	}
	
}