package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TEquipmentModelSparePartLinkReader;
import com.eohi.qll.service.TEquipmentModelSparePartLinkService;

@Service
@DeleteFlag(flag = true)
public class TEquipmentModelSparePartLinkServiceImpl extends TEquipmentModelSparePartLinkService {
	
	@Autowired
	private TEquipmentModelSparePartLinkReader reader;

	@Override
	protected TEquipmentModelSparePartLinkReader reader() {
		return reader;
	}

}
