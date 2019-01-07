package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class T700Website extends BaseModel<String> {

	private String note;
	private Integer operateStatus;
	private String dns3;
	private String dns2;
	private String dns1;
	private Integer cloudVendor;
	private String defaultLanguageId;
	private String publicIp;
	private String companyId;
	private String maintainBy;
	private String validPeriodTo;
	private String barcodeUrl;
	private String validPeriodFrom;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"note", "note",
	 	"operateStatus", "operate status",
	 	"dns3", "DNS3",
	 	"dns2", "DNS2",
	 	"dns1", "DNS1",
	 	"cloudVendor", "cloud vendor",
	 	"defaultLanguageId", "default language id",
	 	"publicIp", "public ip",
	 	"companyId", "company id",
	 	"maintainBy", "maintain by",
	 	"validPeriodTo", "valid period to",
	 	"barcodeUrl", "barcode url",
	 	"validPeriodFrom", "valid period from"
	); 
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public Integer getOperateStatus() {
		return operateStatus;
	}

	public void setOperateStatus(Integer operateStatus) {
		this.operateStatus = operateStatus;
	}
	
	public String getDns3() {
		return dns3;
	}

	public void setDns3(String dns3) {
		this.dns3 = dns3;
	}
	
	public String getDns2() {
		return dns2;
	}

	public void setDns2(String dns2) {
		this.dns2 = dns2;
	}
	
	public String getDns1() {
		return dns1;
	}

	public void setDns1(String dns1) {
		this.dns1 = dns1;
	}
	
	public Integer getCloudVendor() {
		return cloudVendor;
	}

	public void setCloudVendor(Integer cloudVendor) {
		this.cloudVendor = cloudVendor;
	}
	
	public String getDefaultLanguageId() {
		return defaultLanguageId;
	}

	public void setDefaultLanguageId(String defaultLanguageId) {
		this.defaultLanguageId = defaultLanguageId;
	}
	
	public String getPublicIp() {
		return publicIp;
	}

	public void setPublicIp(String publicIp) {
		this.publicIp = publicIp;
	}
	
	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	
	public String getMaintainBy() {
		return maintainBy;
	}

	public void setMaintainBy(String maintainBy) {
		this.maintainBy = maintainBy;
	}
	
	public String getValidPeriodTo() {
		return validPeriodTo;
	}

	public void setValidPeriodTo(String validPeriodTo) {
		this.validPeriodTo = validPeriodTo;
	}
	
	public String getBarcodeUrl() {
		return barcodeUrl;
	}

	public void setBarcodeUrl(String barcodeUrl) {
		this.barcodeUrl = barcodeUrl;
	}
	
	public String getValidPeriodFrom() {
		return validPeriodFrom;
	}

	public void setValidPeriodFrom(String validPeriodFrom) {
		this.validPeriodFrom = validPeriodFrom;
	}
	
}