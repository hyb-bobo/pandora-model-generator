package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;

import java.math.BigDecimal;


@PKType(setType = String.class)
public class TBdBom extends BaseModel<String> {

	private String childItemId;
	private String note;
	private Integer parentItemQuantity;
	private Integer childItemQuantity;
	private Integer lineNo;
	private String parentItemId;
	private String factoryId;
	private BigDecimal lossRate;
	private String bomHeadId;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"childItemId", "child item id",
	 	"note", "note",
	 	"parentItemQuantity", "parent item quantity",
	 	"childItemQuantity", "child item quantity",
	 	"lineNo", "line no",
	 	"parentItemId", "parent item id",
	 	"factoryId", "factory id",
	 	"lossRate", "loss rate",
	 	"bomHeadId", "bom head id"
	); 
	
	public String getChildItemId() {
		return childItemId;
	}

	public void setChildItemId(String childItemId) {
		this.childItemId = childItemId;
	}
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public Integer getParentItemQuantity() {
		return parentItemQuantity;
	}

	public void setParentItemQuantity(Integer parentItemQuantity) {
		this.parentItemQuantity = parentItemQuantity;
	}
	
	public Integer getChildItemQuantity() {
		return childItemQuantity;
	}

	public void setChildItemQuantity(Integer childItemQuantity) {
		this.childItemQuantity = childItemQuantity;
	}
	
	public Integer getLineNo() {
		return lineNo;
	}

	public void setLineNo(Integer lineNo) {
		this.lineNo = lineNo;
	}
	
	public String getParentItemId() {
		return parentItemId;
	}

	public void setParentItemId(String parentItemId) {
		this.parentItemId = parentItemId;
	}
	
	public String getFactoryId() {
		return factoryId;
	}

	public void setFactoryId(String factoryId) {
		this.factoryId = factoryId;
	}
	
	public BigDecimal getLossRate() {
		return lossRate;
	}

	public void setLossRate(BigDecimal lossRate) {
		this.lossRate = lossRate;
	}
	
	public String getBomHeadId() {
		return bomHeadId;
	}

	public void setBomHeadId(String bomHeadId) {
		this.bomHeadId = bomHeadId;
	}
	
}