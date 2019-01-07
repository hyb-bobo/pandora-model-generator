package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;

import java.math.BigDecimal;


@PKType(setType = String.class)
public class T700PriceBook extends BaseModel<String> {

	private Integer approvalStatus;
	private String note;
	private Integer priceMethod;
	private String supplyDemandRelationId;
	private String expireDate;
	private BigDecimal purchasePrice;
	private String effectiveDate;

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
	 	"priceMethod", "price method",
	 	"supplyDemandRelationId", "supply demand relation id",
	 	"expireDate", "expire date",
	 	"purchasePrice", "purchase price",
	 	"effectiveDate", "effective date"
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
	
	public Integer getPriceMethod() {
		return priceMethod;
	}

	public void setPriceMethod(Integer priceMethod) {
		this.priceMethod = priceMethod;
	}
	
	public String getSupplyDemandRelationId() {
		return supplyDemandRelationId;
	}

	public void setSupplyDemandRelationId(String supplyDemandRelationId) {
		this.supplyDemandRelationId = supplyDemandRelationId;
	}
	
	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	
	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	
	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	
}