package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class TBdBomHead extends BaseModel<String> {

	private String note;
	private String factoryId;
	private String description;
	private String rootMaterialId;
	private Integer bomVersion;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"note", "note",
	 	"factoryId", "factory id",
	 	"description", "description",
	 	"rootMaterialId", "root material id",
	 	"bomVersion", "bom version"
	); 
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
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
	
	public String getRootMaterialId() {
		return rootMaterialId;
	}

	public void setRootMaterialId(String rootMaterialId) {
		this.rootMaterialId = rootMaterialId;
	}
	
	public Integer getBomVersion() {
		return bomVersion;
	}

	public void setBomVersion(Integer bomVersion) {
		this.bomVersion = bomVersion;
	}
	
}