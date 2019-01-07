package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;

import java.math.BigDecimal;


@PKType(setType = String.class)
public class TBdCustomer extends BaseModel<String> {

	private String zipCode;
	private String note;
	private String code;
	private String formAt;
	private Integer scale;
	private Integer industry;
	private Integer source;
	private Integer type;
	private Integer isListedCompany;
	private String countryId;
	private String legalName;
	private BigDecimal annualRevenueLastYear;
	private String tradeName;
	private String websiteUrl;
	private BigDecimal registeredCapital;
	private String headquarterPictureUrl;
	private String previousVendor;
	private String taxCertificatePictureUrl;
	private String address;
	private Integer level;
	private String businessLicensePictureUrl;
	private String factoryId;
	private String businessLicenseNo;
	private String taxCode;
	private String stockCode;
	private Integer businessType;
	private Integer status;
	private String juristicPerson;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"zipCode", "zip code",
	 	"note", "note",
	 	"code", "code",
	 	"formAt", "form at",
	 	"scale", "scale",
	 	"industry", "industry",
	 	"source", "source",
	 	"type", "type",
	 	"isListedCompany", "is listed company",
	 	"countryId", "country id",
	 	"legalName", "legal name",
	 	"annualRevenueLastYear", "annual revenue last year",
	 	"tradeName", "trade name",
	 	"websiteUrl", "website url",
	 	"registeredCapital", "registered capital",
	 	"headquarterPictureUrl", "headquarter picture url",
	 	"previousVendor", "previous vendor",
	 	"taxCertificatePictureUrl", "tax certificate picture url",
	 	"address", "address",
	 	"level", "level",
	 	"businessLicensePictureUrl", "business license picture url",
	 	"factoryId", "factory id",
	 	"businessLicenseNo", "business license no",
	 	"taxCode", "tax code",
	 	"stockCode", "stock code",
	 	"businessType", "business type",
	 	"status", "status",
	 	"juristicPerson", "juristic person"
	); 
	
	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
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
	
	public String getFormAt() {
		return formAt;
	}

	public void setFormAt(String formAt) {
		this.formAt = formAt;
	}
	
	public Integer getScale() {
		return scale;
	}

	public void setScale(Integer scale) {
		this.scale = scale;
	}
	
	public Integer getIndustry() {
		return industry;
	}

	public void setIndustry(Integer industry) {
		this.industry = industry;
	}
	
	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}
	
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	
	public Integer getIsListedCompany() {
		return isListedCompany;
	}

	public void setIsListedCompany(Integer isListedCompany) {
		this.isListedCompany = isListedCompany;
	}
	
	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	
	public String getLegalName() {
		return legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}
	
	public BigDecimal getAnnualRevenueLastYear() {
		return annualRevenueLastYear;
	}

	public void setAnnualRevenueLastYear(BigDecimal annualRevenueLastYear) {
		this.annualRevenueLastYear = annualRevenueLastYear;
	}
	
	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	
	public String getWebsiteUrl() {
		return websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}
	
	public BigDecimal getRegisteredCapital() {
		return registeredCapital;
	}

	public void setRegisteredCapital(BigDecimal registeredCapital) {
		this.registeredCapital = registeredCapital;
	}
	
	public String getHeadquarterPictureUrl() {
		return headquarterPictureUrl;
	}

	public void setHeadquarterPictureUrl(String headquarterPictureUrl) {
		this.headquarterPictureUrl = headquarterPictureUrl;
	}
	
	public String getPreviousVendor() {
		return previousVendor;
	}

	public void setPreviousVendor(String previousVendor) {
		this.previousVendor = previousVendor;
	}
	
	public String getTaxCertificatePictureUrl() {
		return taxCertificatePictureUrl;
	}

	public void setTaxCertificatePictureUrl(String taxCertificatePictureUrl) {
		this.taxCertificatePictureUrl = taxCertificatePictureUrl;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}
	
	public String getBusinessLicensePictureUrl() {
		return businessLicensePictureUrl;
	}

	public void setBusinessLicensePictureUrl(String businessLicensePictureUrl) {
		this.businessLicensePictureUrl = businessLicensePictureUrl;
	}
	
	public String getFactoryId() {
		return factoryId;
	}

	public void setFactoryId(String factoryId) {
		this.factoryId = factoryId;
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
	
	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	
	public Integer getBusinessType() {
		return businessType;
	}

	public void setBusinessType(Integer businessType) {
		this.businessType = businessType;
	}
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getJuristicPerson() {
		return juristicPerson;
	}

	public void setJuristicPerson(String juristicPerson) {
		this.juristicPerson = juristicPerson;
	}
	
}