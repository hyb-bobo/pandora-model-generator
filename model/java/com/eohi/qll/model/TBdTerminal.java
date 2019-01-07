package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class TBdTerminal extends BaseModel<String> {

	private String note;
	private String code;
	private Integer associatedObjId;
	private String ipAddress;
	private Integer type;
	private String pictureGroupId;
	private String manufacturer;
	private String localName;
	private String protocolId;
	private String factoryLocationId;
	private Integer port;
	private String name;
	private String manufactureDate;
	private String model;
	private String startToUseDate;
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
	 	"associatedObjId", "associated obj id",
	 	"ipAddress", "ip address",
	 	"type", "type",
	 	"pictureGroupId", "picture group id",
	 	"manufacturer", "manufacturer",
	 	"localName", "local name",
	 	"protocolId", "protocol id",
	 	"factoryLocationId", "factory location id",
	 	"port", "port",
	 	"name", "name",
	 	"manufactureDate", "manufacture date",
	 	"model", "model",
	 	"startToUseDate", "start to use date",
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
	
	public Integer getAssociatedObjId() {
		return associatedObjId;
	}

	public void setAssociatedObjId(Integer associatedObjId) {
		this.associatedObjId = associatedObjId;
	}
	
	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	
	public String getPictureGroupId() {
		return pictureGroupId;
	}

	public void setPictureGroupId(String pictureGroupId) {
		this.pictureGroupId = pictureGroupId;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}
	
	public String getProtocolId() {
		return protocolId;
	}

	public void setProtocolId(String protocolId) {
		this.protocolId = protocolId;
	}
	
	public String getFactoryLocationId() {
		return factoryLocationId;
	}

	public void setFactoryLocationId(String factoryLocationId) {
		this.factoryLocationId = factoryLocationId;
	}
	
	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
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
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public String getStartToUseDate() {
		return startToUseDate;
	}

	public void setStartToUseDate(String startToUseDate) {
		this.startToUseDate = startToUseDate;
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