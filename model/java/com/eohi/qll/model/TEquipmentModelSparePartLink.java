package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class TEquipmentModelSparePartLink extends BaseModel<String> {

	private String note;
	private String sparePartId;
	private String equipmentManufacturerId;
	private String equipmentModelId;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"note", "note",
	 	"sparePartId", "spare part id",
	 	"equipmentManufacturerId", "equipment manufacturer id",
	 	"equipmentModelId", "equipment model id"
	); 
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public String getSparePartId() {
		return sparePartId;
	}

	public void setSparePartId(String sparePartId) {
		this.sparePartId = sparePartId;
	}
	
	public String getEquipmentManufacturerId() {
		return equipmentManufacturerId;
	}

	public void setEquipmentManufacturerId(String equipmentManufacturerId) {
		this.equipmentManufacturerId = equipmentManufacturerId;
	}
	
	public String getEquipmentModelId() {
		return equipmentModelId;
	}

	public void setEquipmentModelId(String equipmentModelId) {
		this.equipmentModelId = equipmentModelId;
	}
	
}