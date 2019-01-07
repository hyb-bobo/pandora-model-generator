package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdEquipmentResumeReader;
import com.eohi.qll.service.TBdEquipmentResumeService;

@Service
@DeleteFlag(flag = true)
public class TBdEquipmentResumeServiceImpl extends TBdEquipmentResumeService {
	
	@Autowired
	private TBdEquipmentResumeReader reader;

	@Override
	protected TBdEquipmentResumeReader reader() {
		return reader;
	}

}
