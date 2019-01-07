package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class TBdProductionTeamMember extends BaseModel<String> {

	private String note;
	private String personId;
	private String productionTeamId;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"note", "note",
	 	"personId", "person id",
	 	"productionTeamId", "production team id"
	); 
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}
	
	public String getProductionTeamId() {
		return productionTeamId;
	}

	public void setProductionTeamId(String productionTeamId) {
		this.productionTeamId = productionTeamId;
	}
	
}