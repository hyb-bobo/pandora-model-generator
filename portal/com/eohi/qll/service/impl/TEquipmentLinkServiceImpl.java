package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TEquipmentLinkReader;
import com.eohi.qll.service.TEquipmentLinkService;

@Service
@DeleteFlag(flag = true)
public class TEquipmentLinkServiceImpl extends TEquipmentLinkService {
	
	@Autowired
	private TEquipmentLinkReader reader;

	@Override
	protected TEquipmentLinkReader reader() {
		return reader;
	}

}
