package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class T700Currency extends BaseModel<String> {

	private String symbol;
	private String note;
	private String fullName;
	private Integer isInternationalSettlement;
	private String shortName;
	private String countryId;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"symbol", "symbol",
	 	"note", "note",
	 	"fullName", "full name",
	 	"isInternationalSettlement", "is international settlement",
	 	"shortName", "short name",
	 	"countryId", "country id"
	); 
	
	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public Integer getIsInternationalSettlement() {
		return isInternationalSettlement;
	}

	public void setIsInternationalSettlement(Integer isInternationalSettlement) {
		this.isInternationalSettlement = isInternationalSettlement;
	}
	
	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	
}