package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class TBdPosition extends BaseModel<String> {

	private String qualification;
	private String note;
	private String code;
	private Integer associatedObjId;
	private String responsibility;
	private String displayName;
	private String factoryId;
	private String departmentId;
	private String name;
	private String abbreviation;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"qualification", "qualification",
	 	"note", "note",
	 	"code", "code",
	 	"associatedObjId", "associated obj id",
	 	"responsibility", "responsibility",
	 	"displayName", "display name",
	 	"factoryId", "factory id",
	 	"departmentId", "department id",
	 	"name", "name",
	 	"abbreviation", "abbreviation"
	); 
	
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public Integer getAssociatedObjId() {
		return associatedObjId;
	}

	public void setAssociatedObjId(Integer associatedObjId) {
		this.associatedObjId = associatedObjId;
	}
	
	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
	
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	public String getFactoryId() {
		return factoryId;
	}

	public void setFactoryId(String factoryId) {
		this.factoryId = factoryId;
	}
	
	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	
}