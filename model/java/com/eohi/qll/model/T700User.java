package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class T700User extends BaseModel<String> {

	private Integer userFlag;
	private String note;
	private String effectiveTime;
	private String description;
	private Integer isLock;
	private String localName;
	private String lastLoginTime;
	private String password;
	private String name;
	private String expiryTime;
	private String personId;
	private String memberId;
	private Integer status;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"userFlag", "user flag",
	 	"note", "note",
	 	"effectiveTime", "effective time",
	 	"description", "description",
	 	"isLock", "is lock",
	 	"localName", "local name",
	 	"lastLoginTime", "last login time",
	 	"password", "password",
	 	"name", "name",
	 	"expiryTime", "expiry time",
	 	"personId", "person id",
	 	"memberId", "member id",
	 	"status", "status"
	); 
	
	public Integer getUserFlag() {
		return userFlag;
	}

	public void setUserFlag(Integer userFlag) {
		this.userFlag = userFlag;
	}
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public String getEffectiveTime() {
		return effectiveTime;
	}

	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getIsLock() {
		return isLock;
	}

	public void setIsLock(Integer isLock) {
		this.isLock = isLock;
	}
	
	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}
	
	public String getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getExpiryTime() {
		return expiryTime;
	}

	public void setExpiryTime(String expiryTime) {
		this.expiryTime = expiryTime;
	}
	
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}
	
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
}