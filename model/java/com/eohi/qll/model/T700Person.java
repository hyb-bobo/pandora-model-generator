package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class T700Person extends BaseModel<String> {

	private String note;
	private Integer skillsetLevel;
	private String code;
	private String rfidCardNo;
	private Integer sex;
	private String mobile;
	private String nickleName;
	private String photoUrl;
	private String weixin;
	private String positionId;
	private String name;
	private Integer age;
	private String email;
	private String homeAddress;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"note", "note",
	 	"skillsetLevel", "skillset level",
	 	"code", "code",
	 	"rfidCardNo", "rfid card no",
	 	"sex", "sex",
	 	"mobile", "mobile",
	 	"nickleName", "nickle name",
	 	"photoUrl", "photo url",
	 	"weixin", "weixin",
	 	"positionId", "position id",
	 	"name", "name",
	 	"age", "age",
	 	"email", "email",
	 	"homeAddress", "home address"
	); 
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public Integer getSkillsetLevel() {
		return skillsetLevel;
	}

	public void setSkillsetLevel(Integer skillsetLevel) {
		this.skillsetLevel = skillsetLevel;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public String getRfidCardNo() {
		return rfidCardNo;
	}

	public void setRfidCardNo(String rfidCardNo) {
		this.rfidCardNo = rfidCardNo;
	}
	
	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}
	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getNickleName() {
		return nickleName;
	}

	public void setNickleName(String nickleName) {
		this.nickleName = nickleName;
	}
	
	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	
	public String getWeixin() {
		return weixin;
	}

	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}
	
	public String getPositionId() {
		return positionId;
	}

	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	
}