package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class T700ProductCategoryAttributeValue extends BaseModel<String> {

	private String attributeId;
	private String note;
	private String min;
	private String productId;
	private String max;
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
	 	"note", "note",
	 	"min", "min",
	 	"productId", "product id",
	 	"max", "max",
	 	"uomId", "uom id",
	 	"value", "value"
	); 
	
	public String getAttributeId() {
		return attributeId;
	}

	public void setAttributeId(String attributeId) {
		this.attributeId = attributeId;
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
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getMax() {
		return max;
	}

	public void setMax(String max) {
		this.max = max;
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