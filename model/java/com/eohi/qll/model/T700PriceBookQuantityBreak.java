package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;

import java.math.BigDecimal;


@PKType(setType = String.class)
public class T700PriceBookQuantityBreak extends BaseModel<String> {

	private String priceBookId;
	private BigDecimal unitLogisticCharge;
	private String note;
	private Integer quantityTo;
	private BigDecimal purchaseUnitPrice;
	private Integer quantityFrom;
	private BigDecimal salesUnitPrice;
	private Integer sequenceNo;
	private BigDecimal unitStorageCharge;
	private BigDecimal unitCost;
	private BigDecimal grossMargin;
	private String currencyId;
	private String salesUomId;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"priceBookId", "price book id",
	 	"unitLogisticCharge", "unit logistic charge",
	 	"note", "note",
	 	"quantityTo", "quantity to",
	 	"purchaseUnitPrice", "purchase unit price",
	 	"quantityFrom", "quantity from",
	 	"salesUnitPrice", "sales unit price",
	 	"sequenceNo", "sequence no",
	 	"unitStorageCharge", "unit storage charge",
	 	"unitCost", "unit cost",
	 	"grossMargin", "gross margin",
	 	"currencyId", "currency id",
	 	"salesUomId", "sales uom id"
	); 
	
	public String getPriceBookId() {
		return priceBookId;
	}

	public void setPriceBookId(String priceBookId) {
		this.priceBookId = priceBookId;
	}
	
	public BigDecimal getUnitLogisticCharge() {
		return unitLogisticCharge;
	}

	public void setUnitLogisticCharge(BigDecimal unitLogisticCharge) {
		this.unitLogisticCharge = unitLogisticCharge;
	}
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public Integer getQuantityTo() {
		return quantityTo;
	}

	public void setQuantityTo(Integer quantityTo) {
		this.quantityTo = quantityTo;
	}
	
	public BigDecimal getPurchaseUnitPrice() {
		return purchaseUnitPrice;
	}

	public void setPurchaseUnitPrice(BigDecimal purchaseUnitPrice) {
		this.purchaseUnitPrice = purchaseUnitPrice;
	}
	
	public Integer getQuantityFrom() {
		return quantityFrom;
	}

	public void setQuantityFrom(Integer quantityFrom) {
		this.quantityFrom = quantityFrom;
	}
	
	public BigDecimal getSalesUnitPrice() {
		return salesUnitPrice;
	}

	public void setSalesUnitPrice(BigDecimal salesUnitPrice) {
		this.salesUnitPrice = salesUnitPrice;
	}
	
	public Integer getSequenceNo() {
		return sequenceNo;
	}

	public void setSequenceNo(Integer sequenceNo) {
		this.sequenceNo = sequenceNo;
	}
	
	public BigDecimal getUnitStorageCharge() {
		return unitStorageCharge;
	}

	public void setUnitStorageCharge(BigDecimal unitStorageCharge) {
		this.unitStorageCharge = unitStorageCharge;
	}
	
	public BigDecimal getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(BigDecimal unitCost) {
		this.unitCost = unitCost;
	}
	
	public BigDecimal getGrossMargin() {
		return grossMargin;
	}

	public void setGrossMargin(BigDecimal grossMargin) {
		this.grossMargin = grossMargin;
	}
	
	public String getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}
	
	public String getSalesUomId() {
		return salesUomId;
	}

	public void setSalesUomId(String salesUomId) {
		this.salesUomId = salesUomId;
	}
	
}