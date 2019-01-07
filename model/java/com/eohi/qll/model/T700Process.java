package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class T700Process extends BaseModel<String> {

	private String def3;
	private String def4;
	private String note;
	private String def1;
	private String code;
	private String def2;
	private String factoryId;
	private String description;
	private String ncProgramUrl;
	private Integer type;
	private String mouldId;
	private String name;
	private String manualUrl;
	private String def9;
	private String def7;
	private String def8;
	private String def5;
	private String def6;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"def3", "def3",
	 	"def4", "def4",
	 	"note", "note",
	 	"def1", "def1",
	 	"code", "code",
	 	"def2", "def2",
	 	"factoryId", "factory id",
	 	"description", "description",
	 	"ncProgramUrl", "nc program url",
	 	"type", "type",
	 	"mouldId", "mould id",
	 	"name", "name",
	 	"manualUrl", "manual url",
	 	"def9", "def9",
	 	"def7", "def7",
	 	"def8", "def8",
	 	"def5", "def5",
	 	"def6", "def6"
	); 
	
	public String getDef3() {
		return def3;
	}

	public void setDef3(String def3) {
		this.def3 = def3;
	}
	
	public String getDef4() {
		return def4;
	}

	public void setDef4(String def4) {
		this.def4 = def4;
	}
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public String getDef1() {
		return def1;
	}

	public void setDef1(String def1) {
		this.def1 = def1;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public String getDef2() {
		return def2;
	}

	public void setDef2(String def2) {
		this.def2 = def2;
	}
	
	public String getFactoryId() {
		return factoryId;
	}

	public void setFactoryId(String factoryId) {
		this.factoryId = factoryId;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getNcProgramUrl() {
		return ncProgramUrl;
	}

	public void setNcProgramUrl(String ncProgramUrl) {
		this.ncProgramUrl = ncProgramUrl;
	}
	
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	
	public String getMouldId() {
		return mouldId;
	}

	public void setMouldId(String mouldId) {
		this.mouldId = mouldId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getManualUrl() {
		return manualUrl;
	}

	public void setManualUrl(String manualUrl) {
		this.manualUrl = manualUrl;
	}
	
	public String getDef9() {
		return def9;
	}

	public void setDef9(String def9) {
		this.def9 = def9;
	}
	
	public String getDef7() {
		return def7;
	}

	public void setDef7(String def7) {
		this.def7 = def7;
	}
	
	public String getDef8() {
		return def8;
	}

	public void setDef8(String def8) {
		this.def8 = def8;
	}
	
	public String getDef5() {
		return def5;
	}

	public void setDef5(String def5) {
		this.def5 = def5;
	}
	
	public String getDef6() {
		return def6;
	}

	public void setDef6(String def6) {
		this.def6 = def6;
	}
	
}