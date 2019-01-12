package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;

import java.math.BigDecimal;


@PKType(setType = String.class)
public class T700Member extends BaseModel<String> {

	private Integer approvalStatus;
	private String note;
	private Integer productionMode;
	private BigDecimal markup;
	private String description;
	private BigDecimal discount;
	private Integer type;
	private String approvedAt;
	private String localName;
	private Integer isEohiCustomer;
	private String companyId;
	private Integer creditLevel;
	private String name;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"approvalStatus", "approval status",
	 	"note", "note",
	 	"productionMode", "production mode",
	 	"markup", "markup",
	 	"description", "description",
	 	"discount", "discount",
	 	"type", "type",
	 	"approvedAt", "approved at",
	 	"localName", "local name",
	 	"isEohiCustomer", "is eohi customer",
	 	"companyId", "company id",
	 	"creditLevel", "credit level",
	 	"name", "name"
	); 
	
	public Integer getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(Integer approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public Integer getProductionMode() {
		return productionMode;
	}

	public void setProductionMode(Integer productionMode) {
		this.productionMode = productionMode;
	}
	
	public BigDecimal getMarkup() {
		return markup;
	}

	public void setMarkup(BigDecimal markup) {
		this.markup = markup;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}