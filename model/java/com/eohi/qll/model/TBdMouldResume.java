package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;



@PKType(setType = String.class)
public class TBdMouldResume extends BaseModel<String> {

	private String transferFromDeptId;
	private String transferToDeptId;
	private String note;
	private String associatedBillId;
	private Integer transferDirection;
	private String eventDescription;
	private String associatedDoId;
	private Integer eventType;
	private String processor;
	private String transactionWith;
	private String eventDate;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"transferFromDeptId", "transfer from dept id",
	 	"transferToDeptId", "transfer to dept id",
	 	"note", "note",
	 	"associatedBillId", "associated bill id",
	 	"transferDirection", "transfer direction",
	 	"eventDescription", "event description",
	 	"associatedDoId", "associated do id",
	 	"eventType", "event type",
	 	"processor", "processor",
	 	"transactionWith", "transaction with",
	 	"eventDate", "event date"
	); 
	
	public String getTransferFromDeptId() {
		return transferFromDeptId;
	}

	public void setTransferFromDeptId(String transferFromDeptId) {
		this.transferFromDeptId = transferFromDeptId;
	}
	
	public String getTransferToDeptId() {
		return transferToDeptId;
	}

	public void setTransferToDeptId(String transferToDeptId) {
		this.transferToDeptId = transferToDeptId;
	}
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public String getAssociatedBillId() {
		return associatedBillId;
	}

	public void setAssociatedBillId(String associatedBillId) {
		this.associatedBillId = associatedBillId;
	}
	
	public Integer getTransferDirection() {
		return transferDirection;
	}

	public void setTransferDirection(Integer transferDirection) {
		this.transferDirection = transferDirection;
	}
	
	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	
	public String getAssociatedDoId() {
		return associatedDoId;
	}

	public void setAssociatedDoId(String associatedDoId) {
		this.associatedDoId = associatedDoId;
	}
	
	public Integer getEventType() {
		return eventType;
	}

	public void setEventType(Integer eventType) {
		this.eventType = eventType;
	}
	
	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	public String getTransactionWith() {
		return transactionWith;
	}

	public void setTransactionWith(String transactionWith) {
		this.transactionWith = transactionWith;
	}
	
	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}
	
}