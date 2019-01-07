package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class TBdBomHead extends BaseModel<String> {

	private String note;
	private String factoryId;
	private String rootMaterialId;
	private String desc;
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
	 	"rootMaterialId", "root material id",
	 	"desc", "desc",
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
	
	public String getRootMaterialId() {
		return rootMaterialId;
	}

	public void setRootMaterialId(String rootMaterialId) {
		this.rootMaterialId = rootMaterialId;
	}
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public Integer getBomVersion() {
		return bomVersion;
	}

	public void setBomVersion(Integer bomVersion) {
		this.bomVersion = bomVersion;
	}
	
}