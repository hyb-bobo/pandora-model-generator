package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700ProductCategoryAttributeValueReader;
import com.eohi.qll.service.T700ProductCategoryAttributeValueService;

@Service
@DeleteFlag(flag = true)
public class T700ProductCategoryAttributeValueServiceImpl extends T700ProductCategoryAttributeValueService {
	
	@Autowired
	private T700ProductCategoryAttributeValueReader reader;

	@Override
	protected T700ProductCategoryAttributeValueReader reader() {
		return reader;
	}

}
