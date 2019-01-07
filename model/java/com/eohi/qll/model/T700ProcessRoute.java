package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class T700ProcessRoute extends BaseModel<String> {

	private String note;
	private String productId;
	private String postProcessId;
	private String factoryId;
	private String description;
	private Integer postProcessSerial;
	private String preProcessId;
	private Integer preProcessSerial;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"note", "note",
	 	"productId", "product id",
	 	"postProcessId", "post process id",
	 	"factoryId", "factory id",
	 	"description", "description",
	 	"postProcessSerial", "post process serial",
	 	"preProcessId", "pre process id",
	 	"preProcessSerial", "pre process serial"
	); 
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getPostProcessId() {
		return postProcessId;
	}

	public void setPostProcessId(String postProcessId) {
		this.postProcessId = postProcessId;
	}
	
	public String getFactoryId() {
		return factoryId;
	}

	public void setFactoryId(String factoryId) {
		this.factoryId = factoryId;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getPostProcessSerial() {
		return postProcessSerial;
	}

	public void setPostProcessSerial(Integer postProcessSerial) {
		this.postProcessSerial = postProcessSerial;
	}
	
	public String getPreProcessId() {
		return preProcessId;
	}

	public void setPreProcessId(String preProcessId) {
		this.preProcessId = preProcessId;
	}
	
	public Integer getPreProcessSerial() {
		return preProcessSerial;
	}

	public void setPreProcessSerial(Integer preProcessSerial) {
		this.preProcessSerial = preProcessSerial;
	}
	
}