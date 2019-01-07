package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdProductionTeamReader;
import com.eohi.qll.service.TBdProductionTeamService;

@Service
@DeleteFlag(flag = true)
public class TBdProductionTeamServiceImpl extends TBdProductionTeamService {
	
	@Autowired
	private TBdProductionTeamReader reader;

	@Override
	protected TBdProductionTeamReader reader() {
		return reader;
	}

}
