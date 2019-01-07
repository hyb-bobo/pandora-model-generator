package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700SupplyDemandRelationReader;
import com.eohi.qll.service.T700SupplyDemandRelationService;

@Service
@DeleteFlag(flag = true)
public class T700SupplyDemandRelationServiceImpl extends T700SupplyDemandRelationService {
	
	@Autowired
	private T700SupplyDemandRelationReader reader;

	@Override
	protected T700SupplyDemandRelationReader reader() {
		return reader;
	}

}
