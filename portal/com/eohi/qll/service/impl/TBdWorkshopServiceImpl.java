package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdWorkshopReader;
import com.eohi.qll.service.TBdWorkshopService;

@Service
@DeleteFlag(flag = true)
public class TBdWorkshopServiceImpl extends TBdWorkshopService {
	
	@Autowired
	private TBdWorkshopReader reader;

	@Override
	protected TBdWorkshopReader reader() {
		return reader;
	}

}
