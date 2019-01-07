package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class TBdFactory extends BaseModel<String> {

	private String note;
	private String viceLeaderId;
	private String code;
	private String address;
	private Integer associatedObjId;
	private String languageId;
	private String telephone;
	private Integer type;
	private String leaderId;
	private String localName;
	private String companyId;
	private String factoryLocationId;
	private String contactPersonId;
	private String name;
	private Integer allowLogIn;
	private Integer status;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"note", "note",
	 	"viceLeaderId", "vice leader id",
	 	"code", "code",
	 	"address", "address",
	 	"associatedObjId", "associated obj id",
	 	"languageId", "language id",
	 	"telephone", "telephone",
	 	"type", "type",
	 	"leaderId", "leader id",
	 	"localName", "local name",
	 	"companyId", "company id",
	 	"factoryLocationId", "factory location id",
	 	"contactPersonId", "contact person id",
	 	"name", "name",
	 	"allowLogIn", "allow log in",
	 	"status", "status"
	); 
	
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
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Integer getAssociatedObjId() {
		return associatedObjId;
	}

	public void setAssociatedObjId(Integer associatedObjId) {
		this.associatedObjId = associatedObjId;
	}
	
	public String getLanguageId() {
		return languageId;
	}

	public void setLanguageId(String languageId) {
		this.languageId = languageId;
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
	
	public String getLeaderId() {
		return leaderId;
	}

	public void setLeaderId(String leaderId) {
		this.leaderId = leaderId;
	}
	
	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}
	
	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	
	public String getFactoryLocationId() {
		return factoryLocationId;
	}

	public void setFactoryLocationId(String factoryLocationId) {
		this.factoryLocationId = factoryLocationId;
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
	
	public Integer getAllowLogIn() {
		return allowLogIn;
	}

	public void setAllowLogIn(Integer allowLogIn) {
		this.allowLogIn = allowLogIn;
	}
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
}