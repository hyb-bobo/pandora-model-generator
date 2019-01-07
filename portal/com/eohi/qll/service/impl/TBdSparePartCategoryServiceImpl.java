package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdSparePartCategoryReader;
import com.eohi.qll.service.TBdSparePartCategoryService;

@Service
@DeleteFlag(flag = true)
public class TBdSparePartCategoryServiceImpl extends TBdSparePartCategoryService {
	
	@Autowired
	private TBdSparePartCategoryReader reader;

	@Override
	protected TBdSparePartCategoryReader reader() {
		return reader;
	}

}
