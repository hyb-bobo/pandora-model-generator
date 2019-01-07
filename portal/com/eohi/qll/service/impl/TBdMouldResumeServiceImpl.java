package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdMouldResumeReader;
import com.eohi.qll.service.TBdMouldResumeService;

@Service
@DeleteFlag(flag = true)
public class TBdMouldResumeServiceImpl extends TBdMouldResumeService {
	
	@Autowired
	private TBdMouldResumeReader reader;

	@Override
	protected TBdMouldResumeReader reader() {
		return reader;
	}

}
