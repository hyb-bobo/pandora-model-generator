package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdSparePartReader;
import com.eohi.qll.service.TBdSparePartService;

@Service
@DeleteFlag(flag = true)
public class TBdSparePartServiceImpl extends TBdSparePartService {
	
	@Autowired
	private TBdSparePartReader reader;

	@Override
	protected TBdSparePartReader reader() {
		return reader;
	}

}
