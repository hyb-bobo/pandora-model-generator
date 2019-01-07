package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700ProductCategoryReader;
import com.eohi.qll.service.T700ProductCategoryService;

@Service
@DeleteFlag(flag = true)
public class T700ProductCategoryServiceImpl extends T700ProductCategoryService {
	
	@Autowired
	private T700ProductCategoryReader reader;

	@Override
	protected T700ProductCategoryReader reader() {
		return reader;
	}

}
