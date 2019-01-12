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
	private String demandFactoryId;
	private String productId;
	private String supplyFactoryId;
	private Integer supplyStatus;
	private String stopSupplyAt;
	private String centificateDate;
	private String startSupplyAt;

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
	 	"demandFactoryId", "demand factory id",
	 	"productId", "product id",
	 	"supplyFactoryId", "supply factory id",
	 	"supplyStatus", "supply status",
	 	"stopSupplyAt", "stop supply at",
	 	"centificateDate", "centificate date",
	 	"startSupplyAt", "start supply at"
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
	
	public String getDemandFactoryId() {
		return demandFactoryId;
	}

	public void setDemandFactoryId(String demandFactoryId) {
		this.demandFactoryId = demandFactoryId;
	}
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getSupplyFactoryId() {
		return supplyFactoryId;
	}

	public void setSupplyFactoryId(String supplyFactoryId) {
		this.supplyFactoryId = supplyFactoryId;
	}
	
	public Integer getSupplyStatus() {
		return supplyStatus;
	}

	public void setSupplyStatus(Integer supplyStatus) {
		this.supplyStatus = supplyStatus;
	}
	
	public String getStopSupplyAt() {
		return stopSupplyAt;
	}

	public void setStopSupplyAt(String stopSupplyAt) {
		this.stopSupplyAt = stopSupplyAt;
	}
	
	public String getCentificateDate() {
		return centificateDate;
	}

	public void setCentificateDate(String centificateDate) {
		this.centificateDate = centificateDate;
	}
	
	public String getStartSupplyAt() {
		return startSupplyAt;
	}

	public void setStartSupplyAt(String startSupplyAt) {
		this.startSupplyAt = startSupplyAt;
	}
	
}