package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class T700Factory extends BaseModel<String> {

	private String localName;
	private String note;
	private String code;
	private String address;
	private Integer isIotAvailable;
	private String name;
	private String description;
	private String onsitePersonId;
	private Integer type;
	private String memberId;

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
	 	"code", "code",
	 	"address", "address",
	 	"isIotAvailable", "is iot available",
	 	"name", "name",
	 	"description", "description",
	 	"onsitePersonId", "onsite person id",
	 	"type", "type",
	 	"memberId", "member id"
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
	
	public Integer getIsIotAvailable() {
		return isIotAvailable;
	}

	public void setIsIotAvailable(Integer isIotAvailable) {
		this.isIotAvailable = isIotAvailable;
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
	
	public String getOnsitePersonId() {
		return onsitePersonId;
	}

	public void setOnsitePersonId(String onsitePersonId) {
		this.onsitePersonId = onsitePersonId;
	}
	
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
}