package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TBdProductionTeamMemberReader;
import com.eohi.qll.service.TBdProductionTeamMemberService;

@Service
@DeleteFlag(flag = true)
public class TBdProductionTeamMemberServiceImpl extends TBdProductionTeamMemberService {
	
	@Autowired
	private TBdProductionTeamMemberReader reader;

	@Override
	protected TBdProductionTeamMemberReader reader() {
		return reader;
	}

}
