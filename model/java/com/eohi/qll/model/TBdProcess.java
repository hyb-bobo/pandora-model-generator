package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class TBdProcess extends BaseModel<String> {

	private String note;
	private String mouldId;
	private String code;
	private String factoryId;
	private String name;
	private String ncProgramUrl;
	private String descrition;
	private String manualUrl;
	private Integer type;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"note", "note",
	 	"mouldId", "mould id",
	 	"code", "code",
	 	"factoryId", "factory id",
	 	"name", "name",
	 	"ncProgramUrl", "nc program url",
	 	"descrition", "descrition",
	 	"manualUrl", "manual url",
	 	"type", "type"
	); 
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public String getMouldId() {
		return mouldId;
	}

	public void setMouldId(String mouldId) {
		this.mouldId = mouldId;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public String getFactoryId() {
		return factoryId;
	}

	public void setFactoryId(String factoryId) {
		this.factoryId = factoryId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getNcProgramUrl() {
		return ncProgramUrl;
	}

	public void setNcProgramUrl(String ncProgramUrl) {
		this.ncProgramUrl = ncProgramUrl;
	}
	
	public String getDescrition() {
		return descrition;
	}

	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}
	
	public String getManualUrl() {
		return manualUrl;
	}

	public void setManualUrl(String manualUrl) {
		this.manualUrl = manualUrl;
	}
	
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	
}