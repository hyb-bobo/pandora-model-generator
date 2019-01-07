package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class TBdCompany extends BaseModel<String> {

	private String note;
	private String website;
	private String code;
	private Integer associatedObjId;
	private String contactPerson;
	private String defaultLanguageId;
	private String taxCode;
	private String organizationId;
	private String localName;
	private String registeredAddress;
	private Integer defaultTimeZone;
	private String phone;
	private String name;
	private String email;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"note", "note",
	 	"website", "website",
	 	"code", "code",
	 	"associatedObjId", "associated obj id",
	 	"contactPerson", "contact person",
	 	"defaultLanguageId", "default language id",
	 	"taxCode", "tax code",
	 	"organizationId", "organization id",
	 	"localName", "local name",
	 	"registeredAddress", "registered address",
	 	"defaultTimeZone", "default time zone",
	 	"phone", "phone",
	 	"name", "name",
	 	"email", "email"
	); 
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
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
	
	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	
	public String getDefaultLanguageId() {
		return defaultLanguageId;
	}

	public void setDefaultLanguageId(String defaultLanguageId) {
		this.defaultLanguageId = defaultLanguageId;
	}
	
	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	
	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}
	
	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}
	
	public String getRegisteredAddress() {
		return registeredAddress;
	}

	public void setRegisteredAddress(String registeredAddress) {
		this.registeredAddress = registeredAddress;
	}
	
	public Integer getDefaultTimeZone() {
		return defaultTimeZone;
	}

	public void setDefaultTimeZone(Integer defaultTimeZone) {
		this.defaultTimeZone = defaultTimeZone;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}