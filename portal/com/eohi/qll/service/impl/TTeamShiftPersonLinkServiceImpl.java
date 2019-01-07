package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TTeamShiftPersonLinkReader;
import com.eohi.qll.service.TTeamShiftPersonLinkService;

@Service
@DeleteFlag(flag = true)
public class TTeamShiftPersonLinkServiceImpl extends TTeamShiftPersonLinkService {
	
	@Autowired
	private TTeamShiftPersonLinkReader reader;

	@Override
	protected TTeamShiftPersonLinkReader reader() {
		return reader;
	}

}
