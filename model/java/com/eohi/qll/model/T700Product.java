package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;

import java.math.BigDecimal;


@PKType(setType = String.class)
public class T700Product extends BaseModel<String> {

	private Integer approvalStatus;
	private String def3;
	private String def4;
	private String note;
	private String def1;
	private String def2;
	private String factoryId;
	private String description;
	private String capacityUomId;
	private String onShelvesAt;
	private String offShelvesAt;
	private String localName;
	private String itemId;
	private String productCategoryId;
	private String name;
	private BigDecimal averageCapacity;
	private String model;
	private String def9;
	private String def7;
	private String def8;
	private String def5;
	private String memberId;
	private String def6;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"approvalStatus", "approval status",
	 	"def3", "def3",
	 	"def4", "def4",
	 	"note", "note",
	 	"def1", "def1",
	 	"def2", "def2",
	 	"factoryId", "factory id",
	 	"description", "description",
	 	"capacityUomId", "capacity uom id",
	 	"onShelvesAt", "on shelves at",
	 	"offShelvesAt", "off shelves at",
	 	"localName", "local name",
	 	"itemId", "item id",
	 	"productCategoryId", "product category id",
	 	"name", "name",
	 	"averageCapacity", "average capacity",
	 	"model", "model",
	 	"def9", "def9",
	 	"def7", "def7",
	 	"def8", "def8",
	 	"def5", "def5",
	 	"memberId", "member id",
	 	"def6", "def6"
	); 
	
	public Integer getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(Integer approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	
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
	
	public String getCapacityUomId() {
		return capacityUomId;
	}

	public void setCapacityUomId(String capacityUomId) {
		this.capacityUomId = capacityUomId;
	}
	
	public String getOnShelvesAt() {
		return onShelvesAt;
	}

	public void setOnShelvesAt(String onShelvesAt) {
		this.onShelvesAt = onShelvesAt;
	}
	
	public String getOffShelvesAt() {
		return offShelvesAt;
	}

	public void setOffShelvesAt(String offShelvesAt) {
		this.offShelvesAt = offShelvesAt;
	}
	
	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}
	
	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
	public String getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(String productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public BigDecimal getAverageCapacity() {
		return averageCapacity;
	}

	public void setAverageCapacity(BigDecimal averageCapacity) {
		this.averageCapacity = averageCapacity;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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
	
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	public String getDef6() {
		return def6;
	}

	public void setDef6(String def6) {
		this.def6 = def6;
	}
	
}