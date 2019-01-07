package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdEquipmentTypeReader;
import com.eohi.qll.service.TBdEquipmentTypeService;

@Service
@DeleteFlag(flag = true)
public class TBdEquipmentTypeServiceImpl extends TBdEquipmentTypeService {
	
	@Autowired
	private TBdEquipmentTypeReader reader;

	@Override
	protected TBdEquipmentTypeReader reader() {
		return reader;
	}

}
