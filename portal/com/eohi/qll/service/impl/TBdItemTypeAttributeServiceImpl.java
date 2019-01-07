package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdItemTypeAttributeReader;
import com.eohi.qll.service.TBdItemTypeAttributeService;

@Service
@DeleteFlag(flag = true)
public class TBdItemTypeAttributeServiceImpl extends TBdItemTypeAttributeService {
	
	@Autowired
	private TBdItemTypeAttributeReader reader;

	@Override
	protected TBdItemTypeAttributeReader reader() {
		return reader;
	}

}
