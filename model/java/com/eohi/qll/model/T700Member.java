package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class T700Member extends BaseModel<String> {

	private Integer approvalStatus;
	private String localName;
	private Integer isEohiCustomer;
	private Integer iotEnable;
	private String note;
	private String companyId;
	private Integer creditLevel;
	private Integer productionMode;
	private String name;
	private String description;
	private Integer type;
	private String approvedAt;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"approvalStatus", "approval status",
	 	"localName", "local name",
	 	"isEohiCustomer", "is eohi customer",
	 	"iotEnable", "iot enable",
	 	"note", "note",
	 	"companyId", "company id",
	 	"creditLevel", "credit level",
	 	"productionMode", "production mode",
	 	"name", "name",
	 	"description", "description",
	 	"type", "type",
	 	"approvedAt", "approved at"
	); 
	
	public Integer getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(Integer approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	
	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}
	
	public Integer getIsEohiCustomer() {
		return isEohiCustomer;
	}

	public void setIsEohiCustomer(Integer isEohiCustomer) {
		this.isEohiCustomer = isEohiCustomer;
	}
	
	public Integer getIotEnable() {
		return iotEnable;
	}

	public void setIotEnable(Integer iotEnable) {
		this.iotEnable = iotEnable;
	}
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	
	public Integer getCreditLevel() {
		return creditLevel;
	}

	public void setCreditLevel(Integer creditLevel) {
		this.creditLevel = creditLevel;
	}
	
	public Integer getProductionMode() {
		return productionMode;
	}

	public void setProductionMode(Integer productionMode) {
		this.productionMode = productionMode;
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
	
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	
	public String getApprovedAt() {
		return approvedAt;
	}

	public void setApprovedAt(String approvedAt) {
		this.approvedAt = approvedAt;
	}
	
}