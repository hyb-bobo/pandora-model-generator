package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdEquipmentFaultReader;
import com.eohi.qll.service.TBdEquipmentFaultService;

@Service
@DeleteFlag(flag = true)
public class TBdEquipmentFaultServiceImpl extends TBdEquipmentFaultService {
	
	@Autowired
	private TBdEquipmentFaultReader reader;

	@Override
	protected TBdEquipmentFaultReader reader() {
		return reader;
	}

}
