package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700ProductCategoryAttributeReader;
import com.eohi.qll.service.T700ProductCategoryAttributeService;

@Service
@DeleteFlag(flag = true)
public class T700ProductCategoryAttributeServiceImpl extends T700ProductCategoryAttributeService {
	
	@Autowired
	private T700ProductCategoryAttributeReader reader;

	@Override
	protected T700ProductCategoryAttributeReader reader() {
		return reader;
	}

}
