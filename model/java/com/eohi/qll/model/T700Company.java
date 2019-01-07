package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;

import java.math.BigDecimal;


@PKType(setType = String.class)
public class T700Company extends BaseModel<String> {

	private String bankAccount;
	private String note;
	private String address;
	private BigDecimal latitude;
	private String description;
	private Integer scale;
	private String contactBy;
	private Integer industry;
	private String businessFormationDate;
	private String businessLicenseNo;
	private String taxCode;
	private String countryId;
	private String telNo;
	private String bankOfDeposit;
	private String legalName;
	private String tradeName;
	private String regionId;
	private String websiteUrl;
	private BigDecimal turnover;
	private BigDecimal longitude;
	private String juristicPerson;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"bankAccount", "bank account",
	 	"note", "note",
	 	"address", "address",
	 	"latitude", "latitude",
	 	"description", "description",
	 	"scale", "scale",
	 	"contactBy", "contact by",
	 	"industry", "industry",
	 	"businessFormationDate", "business formation date",
	 	"businessLicenseNo", "business license no",
	 	"taxCode", "tax code",
	 	"countryId", "country id",
	 	"telNo", "tel no",
	 	"bankOfDeposit", "bank of deposit",
	 	"legalName", "legal name",
	 	"tradeName", "trade name",
	 	"regionId", "region id",
	 	"websiteUrl", "website url",
	 	"turnover", "turnover",
	 	"longitude", "longitude",
	 	"juristicPerson", "juristic person"
	); 
	
	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getScale() {
		return scale;
	}

	public void setScale(Integer scale) {
		this.scale = scale;
	}
	
	public String getContactBy() {
		return contactBy;
	}

	public void setContactBy(String contactBy) {
		this.contactBy = contactBy;
	}
	
	public Integer getIndustry() {
		return industry;
	}

	public void setIndustry(Integer industry) {
		this.industry = industry;
	}
	
	public String getBusinessFormationDate() {
		return businessFormationDate;
	}

	public void setBusinessFormationDate(String businessFormationDate) {
		this.businessFormationDate = businessFormationDate;
	}
	
	public String getBusinessLicenseNo() {
		return businessLicenseNo;
	}

	public void setBusinessLicenseNo(String businessLicenseNo) {
		this.businessLicenseNo = businessLicenseNo;
	}
	
	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	
	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	
	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	
	public String getBankOfDeposit() {
		return bankOfDeposit;
	}

	public void setBankOfDeposit(String bankOfDeposit) {
		this.bankOfDeposit = bankOfDeposit;
	}
	
	public String getLegalName() {
		return legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}
	
	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	
	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
	
	public String getWebsiteUrl() {
		return websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}
	
	public BigDecimal getTurnover() {
		return turnover;
	}

	public void setTurnover(BigDecimal turnover) {
		this.turnover = turnover;
	}
	
	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}
	
	public String getJuristicPerson() {
		return juristicPerson;
	}

	public void setJuristicPerson(String juristicPerson) {
		this.juristicPerson = juristicPerson;
	}
	
}