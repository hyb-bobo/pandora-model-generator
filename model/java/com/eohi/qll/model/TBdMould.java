package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;

import java.math.BigDecimal;


@PKType(setType = String.class)
public class TBdMould extends BaseModel<String> {

	private String acceptanceDate;
	private String sizeUomId;
	private String note;
	private String code;
	private String qrCodePictureUrl;
	private String modelId;
	private String manufacturerEquipmentCode;
	private BigDecimal lifetime;
	private String description;
	private String acceptanceApplicationFormId;
	private BigDecimal purchasePrice;
	private BigDecimal residualValue;
	private String factoryLocationId;
	private String photoResUserObjId;
	private String poNo;
	private String weightUnitId;
	private String manufactureDate;
	private BigDecimal depreciationRate;
	private Integer associatedObjId;
	private String factoryId;
	private String manufacturerId;
	private String installationDate;
	private BigDecimal weight;
	private Integer classification;
	private String localName;
	private BigDecimal size;
	private String poName;
	private String mouldResumeId;
	private String name;
	private String usedFor;
	private String typeId;
	private String startToUseDate;
	private String config;
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
	 	"acceptanceDate", "acceptance date",
	 	"sizeUomId", "size uom id",
	 	"note", "note",
	 	"code", "code",
	 	"qrCodePictureUrl", "qr code picture url",
	 	"modelId", "model id",
	 	"manufacturerEquipmentCode", "manufacturer equipment code",
	 	"lifetime", "lifetime",
	 	"description", "description",
	 	"acceptanceApplicationFormId", "acceptance application form id",
	 	"purchasePrice", "purchase price",
	 	"residualValue", "residual value",
	 	"factoryLocationId", "factory location id",
	 	"photoResUserObjId", "photo res user obj id",
	 	"poNo", "po no",
	 	"weightUnitId", "weight unit id",
	 	"manufactureDate", "manufacture date",
	 	"depreciationRate", "depreciation rate",
	 	"associatedObjId", "associated obj id",
	 	"factoryId", "factory id",
	 	"manufacturerId", "manufacturer id",
	 	"installationDate", "installation date",
	 	"weight", "weight",
	 	"classification", "classification",
	 	"localName", "local name",
	 	"size", "size",
	 	"poName", "po name",
	 	"mouldResumeId", "mould resume id",
	 	"name", "name",
	 	"usedFor", "used for",
	 	"typeId", "type id",
	 	"startToUseDate", "start to use date",
	 	"config", "config",
	 	"status", "status",
	 	"endToUseDate", "end to use date"
	); 
	
	public String getAcceptanceDate() {
		return acceptanceDate;
	}

	public void setAcceptanceDate(String acceptanceDate) {
		this.acceptanceDate = acceptanceDate;
	}
	
	public String getSizeUomId() {
		return sizeUomId;
	}

	public void setSizeUomId(String sizeUomId) {
		this.sizeUomId = sizeUomId;
	}
	
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
	
	public String getQrCodePictureUrl() {
		return qrCodePictureUrl;
	}

	public void setQrCodePictureUrl(String qrCodePictureUrl) {
		this.qrCodePictureUrl = qrCodePictureUrl;
	}
	
	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
	
	public String getManufacturerEquipmentCode() {
		return manufacturerEquipmentCode;
	}

	public void setManufacturerEquipmentCode(String manufacturerEquipmentCode) {
		this.manufacturerEquipmentCode = manufacturerEquipmentCode;
	}
	
	public BigDecimal getLifetime() {
		return lifetime;
	}

	public void setLifetime(BigDecimal lifetime) {
		this.lifetime = lifetime;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getAcceptanceApplicationFormId() {
		return acceptanceApplicationFormId;
	}

	public void setAcceptanceApplicationFormId(String acceptanceApplicationFormId) {
		this.acceptanceApplicationFormId = acceptanceApplicationFormId;
	}
	
	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	
	public BigDecimal getResidualValue() {
		return residualValue;
	}

	public void setResidualValue(BigDecimal residualValue) {
		this.residualValue = residualValue;
	}
	
	public String getFactoryLocationId() {
		return factoryLocationId;
	}

	public void setFactoryLocationId(String factoryLocationId) {
		this.factoryLocationId = factoryLocationId;
	}
	
	public String getPhotoResUserObjId() {
		return photoResUserObjId;
	}

	public void setPhotoResUserObjId(String photoResUserObjId) {
		this.photoResUserObjId = photoResUserObjId;
	}
	
	public String getPoNo() {
		return poNo;
	}

	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}
	
	public String getWeightUnitId() {
		return weightUnitId;
	}

	public void setWeightUnitId(String weightUnitId) {
		this.weightUnitId = weightUnitId;
	}
	
	public String getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	public BigDecimal getDepreciationRate() {
		return depreciationRate;
	}

	public void setDepreciationRate(BigDecimal depreciationRate) {
		this.depreciationRate = depreciationRate;
	}
	
	public Integer getAssociatedObjId() {
		return associatedObjId;
	}

	public void setAssociatedObjId(Integer associatedObjId) {
		this.associatedObjId = associatedObjId;
	}
	
	public String getFactoryId() {
		return factoryId;
	}

	public void setFactoryId(String factoryId) {
		this.factoryId = factoryId;
	}
	
	public String getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(String manufacturerId) {
		this.manufacturerId = manufacturerId;
	}
	
	public String getInstallationDate() {
		return installationDate;
	}

	public void setInstallationDate(String installationDate) {
		this.installationDate = installationDate;
	}
	
	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
	
	public Integer getClassification() {
		return classification;
	}

	public void setClassification(Integer classification) {
		this.classification = classification;
	}
	
	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}
	
	public BigDecimal getSize() {
		return size;
	}

	public void setSize(BigDecimal size) {
		this.size = size;
	}
	
	public String getPoName() {
		return poName;
	}

	public void setPoName(String poName) {
		this.poName = poName;
	}
	
	public String getMouldResumeId() {
		return mouldResumeId;
	}

	public void setMouldResumeId(String mouldResumeId) {
		this.mouldResumeId = mouldResumeId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getUsedFor() {
		return usedFor;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}
	
	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	
	public String getStartToUseDate() {
		return startToUseDate;
	}

	public void setStartToUseDate(String startToUseDate) {
		this.startToUseDate = startToUseDate;
	}
	
	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
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