package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class TBdProcessRoute extends BaseModel<String> {

	private String def3;
	private String def4;
	private String note;
	private String def1;
	private String def2;
	private String postProcessId;
	private String factoryId;
	private String materialId;
	private String factoryLocationId;
	private String descrition;
	private String def9;
	private Integer postProcessSerial;
	private String def7;
	private String preProcessId;
	private String def8;
	private String def5;
	private Integer preProcessSerial;
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
	 	"def2", "def2",
	 	"postProcessId", "post process id",
	 	"factoryId", "factory id",
	 	"materialId", "material id",
	 	"factoryLocationId", "factory location id",
	 	"descrition", "descrition",
	 	"def9", "def9",
	 	"postProcessSerial", "post process serial",
	 	"def7", "def7",
	 	"preProcessId", "pre process id",
	 	"def8", "def8",
	 	"def5", "def5",
	 	"preProcessSerial", "pre process serial",
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
	
	public String getDef2() {
		return def2;
	}

	public void setDef2(String def2) {
		this.def2 = def2;
	}
	
	public String getPostProcessId() {
		return postProcessId;
	}

	public void setPostProcessId(String postProcessId) {
		this.postProcessId = postProcessId;
	}
	
	public String getFactoryId() {
		return factoryId;
	}

	public void setFactoryId(String factoryId) {
		this.factoryId = factoryId;
	}
	
	public String getMaterialId() {
		return materialId;
	}

	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}
	
	public String getFactoryLocationId() {
		return factoryLocationId;
	}

	public void setFactoryLocationId(String factoryLocationId) {
		this.factoryLocationId = factoryLocationId;
	}
	
	public String getDescrition() {
		return descrition;
	}

	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}
	
	public String getDef9() {
		return def9;
	}

	public void setDef9(String def9) {
		this.def9 = def9;
	}
	
	public Integer getPostProcessSerial() {
		return postProcessSerial;
	}

	public void setPostProcessSerial(Integer postProcessSerial) {
		this.postProcessSerial = postProcessSerial;
	}
	
	public String getDef7() {
		return def7;
	}

	public void setDef7(String def7) {
		this.def7 = def7;
	}
	
	public String getPreProcessId() {
		return preProcessId;
	}

	public void setPreProcessId(String preProcessId) {
		this.preProcessId = preProcessId;
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
	
	public Integer getPreProcessSerial() {
		return preProcessSerial;
	}

	public void setPreProcessSerial(Integer preProcessSerial) {
		this.preProcessSerial = preProcessSerial;
	}
	
	public String getDef6() {
		return def6;
	}

	public void setDef6(String def6) {
		this.def6 = def6;
	}
	
}