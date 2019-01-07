package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdSparePartModelReader;
import com.eohi.qll.service.TBdSparePartModelService;

@Service
@DeleteFlag(flag = true)
public class TBdSparePartModelServiceImpl extends TBdSparePartModelService {
	
	@Autowired
	private TBdSparePartModelReader reader;

	@Override
	protected TBdSparePartModelReader reader() {
		return reader;
	}

}
