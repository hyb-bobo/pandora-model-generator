package com.eohi.qll.model;

import com.eohi.qll.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import com.eohi.qll.myAnnotation.SkipJsonToString;
import com.eohi.qll.tag.Enum;

import java.math.BigDecimal;


@PKType(setType = String.class)
public class TBdShift extends BaseModel<String> {

	private String note;
	private BigDecimal initiateTime;
	private String code;
	private String initiateEndAt;
	private BigDecimal totalTime;
	private String factoryId;
	private BigDecimal workTime;
	private String breakEndAt;
	private BigDecimal breakTime;
	private String breakStartAt;
	private String name;
	private String initiateStartAt;
	private String beginTime;
	private String endTime;

	@SkipJsonToString
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(
	 	"note", "note",
	 	"initiateTime", "initiate time",
	 	"code", "code",
	 	"initiateEndAt", "initiate end at",
	 	"totalTime", "total time",
	 	"factoryId", "factory id",
	 	"workTime", "work time",
	 	"breakEndAt", "break end at",
	 	"breakTime", "break time",
	 	"breakStartAt", "break start at",
	 	"name", "name",
	 	"initiateStartAt", "initiate start at",
	 	"beginTime", "begin time",
	 	"endTime", "end time"
	); 
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public BigDecimal getInitiateTime() {
		return initiateTime;
	}

	public void setInitiateTime(BigDecimal initiateTime) {
		this.initiateTime = initiateTime;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public String getInitiateEndAt() {
		return initiateEndAt;
	}

	public void setInitiateEndAt(String initiateEndAt) {
		this.initiateEndAt = initiateEndAt;
	}
	
	public BigDecimal getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(BigDecimal totalTime) {
		this.totalTime = totalTime;
	}
	
	public String getFactoryId() {
		return factoryId;
	}

	public void setFactoryId(String factoryId) {
		this.factoryId = factoryId;
	}
	
	public BigDecimal getWorkTime() {
		return workTime;
	}

	public void setWorkTime(BigDecimal workTime) {
		this.workTime = workTime;
	}
	
	public String getBreakEndAt() {
		return breakEndAt;
	}

	public void setBreakEndAt(String breakEndAt) {
		this.breakEndAt = breakEndAt;
	}
	
	public BigDecimal getBreakTime() {
		return breakTime;
	}

	public void setBreakTime(BigDecimal breakTime) {
		this.breakTime = breakTime;
	}
	
	public String getBreakStartAt() {
		return breakStartAt;
	}

	public void setBreakStartAt(String breakStartAt) {
		this.breakStartAt = breakStartAt;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getInitiateStartAt() {
		return initiateStartAt;
	}

	public void setInitiateStartAt(String initiateStartAt) {
		this.initiateStartAt = initiateStartAt;
	}
	
	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	
	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
}