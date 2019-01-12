package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class T700PriceBook extends BaseModel<String> {

	private Integer approvalStatus;
	private String approver;
	private String note;
	private Integer priceMethod;
	private String supplyDemandRelationId;
	private String submittor;
	private String submitAt;
	private String approveAt;
	private String expireDate;
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
	 	"approver", "approver",
	 	"note", "note",
	 	"priceMethod", "price method",
	 	"supplyDemandRelationId", "supply demand relation id",
	 	"submittor", "submittor",
	 	"submitAt", "submit at",
	 	"approveAt", "approve at",
	 	"expireDate", "expire date",
	 	"effectiveDate", "effective date"
	); 
	
	public Integer getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(Integer approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	
	public String getApprover() {
		return approver;
	}

	public void setApprover(String approver) {
		this.approver = approver;
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
	
	public String getSubmittor() {
		return submittor;
	}

	public void setSubmittor(String submittor) {
		this.submittor = submittor;
	}
	
	public String getSubmitAt() {
		return submitAt;
	}

	public void setSubmitAt(String submitAt) {
		this.submitAt = submitAt;
	}
	
	public String getApproveAt() {
		return approveAt;
	}

	public void setApproveAt(String approveAt) {
		this.approveAt = approveAt;
	}
	
	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	
	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	
}