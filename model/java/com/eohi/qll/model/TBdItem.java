package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class TBdItem extends BaseModel<String> {

	private String def3;
	private String def4;
	private String note;
	private String memCode;
	private String def1;
	private String code;
	private String defaultUomId;
	private String def2;
	private Integer productionMode;
	private String factoryId;
	private Integer version;
	private String spec;
	private String drawingNo;
	private String name;
	private String def9;
	private String itemTypeId;
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
	 	"memCode", "mem code",
	 	"def1", "def1",
	 	"code", "code",
	 	"defaultUomId", "default uom id",
	 	"def2", "def2",
	 	"productionMode", "production mode",
	 	"factoryId", "factory id",
	 	"version", "version",
	 	"spec", "spec",
	 	"drawingNo", "drawing no",
	 	"name", "name",
	 	"def9", "def9",
	 	"itemTypeId", "item type id",
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
	
	public String getMemCode() {
		return memCode;
	}

	public void setMemCode(String memCode) {
		this.memCode = memCode;
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
	
	public String getDefaultUomId() {
		return defaultUomId;
	}

	public void setDefaultUomId(String defaultUomId) {
		this.defaultUomId = defaultUomId;
	}
	
	public String getDef2() {
		return def2;
	}

	public void setDef2(String def2) {
		this.def2 = def2;
	}
	
	public Integer getProductionMode() {
		return productionMode;
	}

	public void setProductionMode(Integer productionMode) {
		this.productionMode = productionMode;
	}
	
	public String getFactoryId() {
		return factoryId;
	}

	public void setFactoryId(String factoryId) {
		this.factoryId = factoryId;
	}
	
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}
	
	public String getDrawingNo() {
		return drawingNo;
	}

	public void setDrawingNo(String drawingNo) {
		this.drawingNo = drawingNo;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDef9() {
		return def9;
	}

	public void setDef9(String def9) {
		this.def9 = def9;
	}
	
	public String getItemTypeId() {
		return itemTypeId;
	}

	public void setItemTypeId(String itemTypeId) {
		this.itemTypeId = itemTypeId;
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