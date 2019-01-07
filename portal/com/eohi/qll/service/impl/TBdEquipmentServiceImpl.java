package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdEquipmentReader;
import com.eohi.qll.service.TBdEquipmentService;

@Service
@DeleteFlag(flag = true)
public class TBdEquipmentServiceImpl extends TBdEquipmentService {
	
	@Autowired
	private TBdEquipmentReader reader;

	@Override
	protected TBdEquipmentReader reader() {
		return reader;
	}

}
