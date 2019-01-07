package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class TBdWorkshop extends BaseModel<String> {

	private String localName;
	private String note;
	private String viceLeaderId;
	private String code;
	private String factoryLocationId;
	private Integer associatedObjId;
	private String contactPersonId;
	private String name;
	private String telephone;
	private Integer type;
	private Integer status;
	private String leaderId;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"localName", "local name",
	 	"note", "note",
	 	"viceLeaderId", "vice leader id",
	 	"code", "code",
	 	"factoryLocationId", "factory location id",
	 	"associatedObjId", "associated obj id",
	 	"contactPersonId", "contact person id",
	 	"name", "name",
	 	"telephone", "telephone",
	 	"type", "type",
	 	"status", "status",
	 	"leaderId", "leader id"
	); 
	
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
	
	public String getFactoryLocationId() {
		return factoryLocationId;
	}

	public void setFactoryLocationId(String factoryLocationId) {
		this.factoryLocationId = factoryLocationId;
	}
	
	public Integer getAssociatedObjId() {
		return associatedObjId;
	}

	public void setAssociatedObjId(Integer associatedObjId) {
		this.associatedObjId = associatedObjId;
	}
	
	public String getContactPersonId() {
		return contactPersonId;
	}

	public void setContactPersonId(String contactPersonId) {
		this.contactPersonId = contactPersonId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getLeaderId() {
		return leaderId;
	}

	public void setLeaderId(String leaderId) {
		this.leaderId = leaderId;
	}
	
}