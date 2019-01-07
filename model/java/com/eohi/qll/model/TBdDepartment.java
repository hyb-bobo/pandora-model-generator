package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class TBdDepartment extends BaseModel<String> {

	private String note;
	private String contactorId;
	private String viceLeaderId;
	private String code;
	private Integer associatedObjId;
	private String displayName;
	private String factoryId;
	private String abbreviation;
	private String leaderId;
	private String organizationId;
	private String assistantId;
	private String responsibility;
	private String name;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"note", "note",
	 	"contactorId", "contactor id",
	 	"viceLeaderId", "vice leader id",
	 	"code", "code",
	 	"associatedObjId", "associated obj id",
	 	"displayName", "display name",
	 	"factoryId", "factory id",
	 	"abbreviation", "abbreviation",
	 	"leaderId", "leader id",
	 	"organizationId", "organization id",
	 	"assistantId", "assistant id",
	 	"responsibility", "responsibility",
	 	"name", "name"
	); 
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public String getContactorId() {
		return contactorId;
	}

	public void setContactorId(String contactorId) {
		this.contactorId = contactorId;
	}
	
	public String getViceLeaderId() {
		return viceLeaderId;
	}

	public void setViceLeaderId(String viceLeaderId) {
		this.viceLeaderId = viceLeaderId;
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
	
	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	
	public String getLeaderId() {
		return leaderId;
	}

	public void setLeaderId(String leaderId) {
		this.leaderId = leaderId;
	}
	
	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}
	
	public String getAssistantId() {
		return assistantId;
	}

	public void setAssistantId(String assistantId) {
		this.assistantId = assistantId;
	}
	
	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}