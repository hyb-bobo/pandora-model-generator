package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdItemTypeReader;
import com.eohi.qll.service.TBdItemTypeService;

@Service
@DeleteFlag(flag = true)
public class TBdItemTypeServiceImpl extends TBdItemTypeService {
	
	@Autowired
	private TBdItemTypeReader reader;

	@Override
	protected TBdItemTypeReader reader() {
		return reader;
	}

}
