package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdEquipmentManufacturerReader;
import com.eohi.qll.service.TBdEquipmentManufacturerService;

@Service
@DeleteFlag(flag = true)
public class TBdEquipmentManufacturerServiceImpl extends TBdEquipmentManufacturerService {
	
	@Autowired
	private TBdEquipmentManufacturerReader reader;

	@Override
	protected TBdEquipmentManufacturerReader reader() {
		return reader;
	}

}
