package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class T700WebsiteCopyright extends BaseModel<String> {

	private String note;
	private String companyId;
	private String websiteId;
	private String languageId;
	private String copyRightDeclare;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"note", "note",
	 	"companyId", "company id",
	 	"websiteId", "website id",
	 	"languageId", "language id",
	 	"copyRightDeclare", "copy right declare"
	); 
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	
	public String getWebsiteId() {
		return websiteId;
	}

	public void setWebsiteId(String websiteId) {
		this.websiteId = websiteId;
	}
	
	public String getLanguageId() {
		return languageId;
	}

	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}
	
	public String getCopyRightDeclare() {
		return copyRightDeclare;
	}

	public void setCopyRightDeclare(String copyRightDeclare) {
		this.copyRightDeclare = copyRightDeclare;
	}
	
}