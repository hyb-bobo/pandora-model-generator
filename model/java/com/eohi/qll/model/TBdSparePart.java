package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;

import java.math.BigDecimal;


@PKType(setType = String.class)
public class TBdSparePart extends BaseModel<String> {

	private String note;
	private String code;
	private String supplierId;
	private Integer associatedObjId;
	private String modelId;
	private String factoryId;
	private String description;
	private BigDecimal weight;
	private String uomId;
	private Integer type;
	private Integer transportationType;
	private Integer useType;
	private String spec;
	private String localName;
	private String photoResUserObjId;
	private String name;
	private String manufactureDate;
	private String startToUseDate;
	private String categoryId;
	private Integer status;
	private String endToUseDate;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"note", "note",
	 	"code", "code",
	 	"supplierId", "supplier id",
	 	"associatedObjId", "associated obj id",
	 	"modelId", "model id",
	 	"factoryId", "factory id",
	 	"description", "description",
	 	"weight", "weight",
	 	"uomId", "uom id",
	 	"type", "type",
	 	"transportationType", "transportation type",
	 	"useType", "use type",
	 	"spec", "spec",
	 	"localName", "local name",
	 	"photoResUserObjId", "photo res user obj id",
	 	"name", "name",
	 	"manufactureDate", "manufacture date",
	 	"startToUseDate", "start to use date",
	 	"categoryId", "category id",
	 	"status", "status",
	 	"endToUseDate", "end to use date"
	); 
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	
	public Integer getAssociatedObjId() {
		return associatedObjId;
	}

	public void setAssociatedObjId(Integer associatedObjId) {
		this.associatedObjId = associatedObjId;
	}
	
	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
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
	
	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
	
	public String getUomId() {
		return uomId;
	}

	public void setUomId(String uomId) {
		this.uomId = uomId;
	}
	
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	
	public Integer getTransportationType() {
		return transportationType;
	}

	public void setTransportationType(Integer transportationType) {
		this.transportationType = transportationType;
	}
	
	public Integer getUseType() {
		return useType;
	}

	public void setUseType(Integer useType) {
		this.useType = useType;
	}
	
	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}
	
	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}
	
	public String getPhotoResUserObjId() {
		return photoResUserObjId;
	}

	public void setPhotoResUserObjId(String photoResUserObjId) {
		this.photoResUserObjId = photoResUserObjId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	public String getStartToUseDate() {
		return startToUseDate;
	}

	public void setStartToUseDate(String startToUseDate) {
		this.startToUseDate = startToUseDate;
	}
	
	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getEndToUseDate() {
		return endToUseDate;
	}

	public void setEndToUseDate(String endToUseDate) {
		this.endToUseDate = endToUseDate;
	}
	
}