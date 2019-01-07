package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class T700ProcessParameter extends BaseModel<String> {

	private Integer sortNo;
	private Integer collectMethod;
	private String localName;
	private String note;
	private String code;
	private String processId;
	private String factoryId;
	private Integer valueType;
	private String name;
	private String description;
	private String uomId;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"sortNo", "sort no",
	 	"collectMethod", "collect method",
	 	"localName", "local name",
	 	"note", "note",
	 	"code", "code",
	 	"processId", "process id",
	 	"factoryId", "factory id",
	 	"valueType", "value type",
	 	"name", "name",
	 	"description", "description",
	 	"uomId", "uom id"
	); 
	
	public Integer getSortNo() {
		return sortNo;
	}

	public void setSortNo(Integer sortNo) {
		this.sortNo = sortNo;
	}
	
	public Integer getCollectMethod() {
		return collectMethod;
	}

	public void setCollectMethod(Integer collectMethod) {
		this.collectMethod = collectMethod;
	}
	
	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
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
	
	public String getProcessId() {
		return processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}
	
	public String getFactoryId() {
		return factoryId;
	}

	public void setFactoryId(String factoryId) {
		this.factoryId = factoryId;
	}
	
	public Integer getValueType() {
		return valueType;
	}

	public void setValueType(Integer valueType) {
		this.valueType = valueType;
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
	
	public String getUomId() {
		return uomId;
	}

	public void setUomId(String uomId) {
		this.uomId = uomId;
	}
	
}