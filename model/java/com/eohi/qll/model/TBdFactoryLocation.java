package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;

import java.math.BigDecimal;


@PKType(setType = String.class)
public class TBdFactoryLocation extends BaseModel<String> {

	private String note;
	private String parentLocationId;
	private String code;
	private Integer associatedObjId;
	private Integer isRoot;
	private Integer level;
	private String networkIp;
	private String factoryId;
	private String description;
	private BigDecimal logisticXCoordinate;
	private String entityId;
	private Integer type;
	private BigDecimal logisticYCoordinate;
	private String localName;
	private BigDecimal logisticZCoordinate;
	private String name;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"note", "note",
	 	"parentLocationId", "parent location id",
	 	"code", "code",
	 	"associatedObjId", "associated obj id",
	 	"isRoot", "is root",
	 	"level", "level",
	 	"networkIp", "network ip",
	 	"factoryId", "factory id",
	 	"description", "description",
	 	"logisticXCoordinate", "logistic x coordinate",
	 	"entityId", "entity id",
	 	"type", "type",
	 	"logisticYCoordinate", "logistic y coordinate",
	 	"localName", "local name",
	 	"logisticZCoordinate", "logistic z coordinate",
	 	"name", "name"
	); 
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public String getParentLocationId() {
		return parentLocationId;
	}

	public void setParentLocationId(String parentLocationId) {
		this.parentLocationId = parentLocationId;
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
	
	public Integer getIsRoot() {
		return isRoot;
	}

	public void setIsRoot(Integer isRoot) {
		this.isRoot = isRoot;
	}
	
	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}
	
	public String getNetworkIp() {
		return networkIp;
	}

	public void setNetworkIp(String networkIp) {
		this.networkIp = networkIp;
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
	
	public BigDecimal getLogisticXCoordinate() {
		return logisticXCoordinate;
	}

	public void setLogisticXCoordinate(BigDecimal logisticXCoordinate) {
		this.logisticXCoordinate = logisticXCoordinate;
	}
	
	public String getEntityId() {
		return entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	
	public BigDecimal getLogisticYCoordinate() {
		return logisticYCoordinate;
	}

	public void setLogisticYCoordinate(BigDecimal logisticYCoordinate) {
		this.logisticYCoordinate = logisticYCoordinate;
	}
	
	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}
	
	public BigDecimal getLogisticZCoordinate() {
		return logisticZCoordinate;
	}

	public void setLogisticZCoordinate(BigDecimal logisticZCoordinate) {
		this.logisticZCoordinate = logisticZCoordinate;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}