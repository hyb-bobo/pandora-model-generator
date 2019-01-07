package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class TBdItemTypeAttributeValue extends BaseModel<String> {

	private String attributeId;
	private String itemId;
	private String note;
	private String min;
	private String max;
	private String factoryId;
	private String uomId;
	private String value;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"attributeId", "attribute id",
	 	"itemId", "item id",
	 	"note", "note",
	 	"min", "min",
	 	"max", "max",
	 	"factoryId", "factory id",
	 	"uomId", "uom id",
	 	"value", "value"
	); 
	
	public String getAttributeId() {
		return attributeId;
	}

	public void setAttributeId(String attributeId) {
		this.attributeId = attributeId;
	}
	
	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public String getMin() {
		return min;
	}

	public void setMin(String min) {
		this.min = min;
	}
	
	public String getMax() {
		return max;
	}

	public void setMax(String max) {
		this.max = max;
	}
	
	public String getFactoryId() {
		return factoryId;
	}

	public void setFactoryId(String factoryId) {
		this.factoryId = factoryId;
	}
	
	public String getUomId() {
		return uomId;
	}

	public void setUomId(String uomId) {
		this.uomId = uomId;
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}