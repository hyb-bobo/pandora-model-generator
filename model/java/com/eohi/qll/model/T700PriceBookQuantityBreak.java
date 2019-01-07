package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;

import java.math.BigDecimal;


@PKType(setType = String.class)
public class T700PriceBookQuantityBreak extends BaseModel<String> {

	private String priceBookId;
	private String note;
	private Integer sequenceNo;
	private BigDecimal markup;
	private Integer quantityTo;
	private BigDecimal salesPrice;
	private BigDecimal discount;
	private BigDecimal netPrice;
	private Integer quantityFrom;
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
	 	"note", "note",
	 	"sequenceNo", "sequence no",
	 	"markup", "markup",
	 	"quantityTo", "quantity to",
	 	"salesPrice", "sales price",
	 	"discount", "discount",
	 	"netPrice", "net price",
	 	"quantityFrom", "quantity from",
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
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public Integer getSequenceNo() {
		return sequenceNo;
	}

	public void setSequenceNo(Integer sequenceNo) {
		this.sequenceNo = sequenceNo;
	}
	
	public BigDecimal getMarkup() {
		return markup;
	}

	public void setMarkup(BigDecimal markup) {
		this.markup = markup;
	}
	
	public Integer getQuantityTo() {
		return quantityTo;
	}

	public void setQuantityTo(Integer quantityTo) {
		this.quantityTo = quantityTo;
	}
	
	public BigDecimal getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}
	
	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	
	public BigDecimal getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(BigDecimal netPrice) {
		this.netPrice = netPrice;
	}
	
	public Integer getQuantityFrom() {
		return quantityFrom;
	}

	public void setQuantityFrom(Integer quantityFrom) {
		this.quantityFrom = quantityFrom;
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