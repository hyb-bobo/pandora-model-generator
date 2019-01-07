package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class T700Function extends BaseModel<String> {

	private Integer sortNo;
	private String note;
	private String code;
	private Integer isValidCheck;
	private String parentFuncId;
	private String name;
	private String description;
	private Integer isHide;

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
	 	"code", "code",
	 	"isValidCheck", "is valid check",
	 	"parentFuncId", "parent func id",
	 	"name", "name",
	 	"description", "description",
	 	"isHide", "is hide"
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
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public Integer getIsValidCheck() {
		return isValidCheck;
	}

	public void setIsValidCheck(Integer isValidCheck) {
		this.isValidCheck = isValidCheck;
	}
	
	public String getParentFuncId() {
		return parentFuncId;
	}

	public void setParentFuncId(String parentFuncId) {
		this.parentFuncId = parentFuncId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getIsHide() {
		return isHide;
	}

	public void setIsHide(Integer isHide) {
		this.isHide = isHide;
	}
	
}