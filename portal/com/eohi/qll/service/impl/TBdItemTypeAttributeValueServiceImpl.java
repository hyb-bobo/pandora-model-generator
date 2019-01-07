package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdItemTypeAttributeValueReader;
import com.eohi.qll.service.TBdItemTypeAttributeValueService;

@Service
@DeleteFlag(flag = true)
public class TBdItemTypeAttributeValueServiceImpl extends TBdItemTypeAttributeValueService {
	
	@Autowired
	private TBdItemTypeAttributeValueReader reader;

	@Override
	protected TBdItemTypeAttributeValueReader reader() {
		return reader;
	}

}
