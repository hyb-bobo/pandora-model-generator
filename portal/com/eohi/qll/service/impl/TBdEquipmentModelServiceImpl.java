package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdEquipmentModelReader;
import com.eohi.qll.service.TBdEquipmentModelService;

@Service
@DeleteFlag(flag = true)
public class TBdEquipmentModelServiceImpl extends TBdEquipmentModelService {
	
	@Autowired
	private TBdEquipmentModelReader reader;

	@Override
	protected TBdEquipmentModelReader reader() {
		return reader;
	}

}
