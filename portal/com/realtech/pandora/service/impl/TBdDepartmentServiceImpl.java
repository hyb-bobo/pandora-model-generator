package com.realtech.pandora.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.realtech.pandora.reader.TBdDepartmentReader;
import com.realtech.pandora.service.TBdDepartmentService;

@Service
@DeleteFlag(flag = true)
public class TBdDepartmentServiceImpl extends TBdDepartmentService {
	
	@Autowired
	private TBdDepartmentReader reader;

	@Override
	protected TBdDepartmentReader reader() {
		return reader;
	}

}
