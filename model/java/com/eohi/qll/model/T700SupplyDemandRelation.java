package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class T700SupplyDemandRelation extends BaseModel<String> {

	private String supplierRank;
	private String demanderId;
	private String note;
	private String supplierId;
	private String productId;
	private Integer supplyStatus;
	private String centificateDate;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"supplierRank", "supplier rank",
	 	"demanderId", "demander id",
	 	"note", "note",
	 	"supplierId", "supplier id",
	 	"productId", "product id",
	 	"supplyStatus", "supply status",
	 	"centificateDate", "centificate date"
	); 
	
	public String getSupplierRank() {
		return supplierRank;
	}

	public void setSupplierRank(String supplierRank) {
		this.supplierRank = supplierRank;
	}
	
	public String getDemanderId() {
		return demanderId;
	}

	public void setDemanderId(String demanderId) {
		this.demanderId = demanderId;
	}
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public Integer getSupplyStatus() {
		return supplyStatus;
	}

	public void setSupplyStatus(Integer supplyStatus) {
		this.supplyStatus = supplyStatus;
	}
	
	public String getCentificateDate() {
		return centificateDate;
	}

	public void setCentificateDate(String centificateDate) {
		this.centificateDate = centificateDate;
	}
	
}