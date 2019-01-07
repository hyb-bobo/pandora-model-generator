package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdDepartmentReader;
import com.eohi.qll.service.TBdDepartmentService;

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
