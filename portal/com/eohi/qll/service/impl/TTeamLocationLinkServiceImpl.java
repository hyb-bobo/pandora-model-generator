package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.TTeamLocationLinkReader;
import com.eohi.qll.service.TTeamLocationLinkService;

@Service
@DeleteFlag(flag = true)
public class TTeamLocationLinkServiceImpl extends TTeamLocationLinkService {
	
	@Autowired
	private TTeamLocationLinkReader reader;

	@Override
	protected TTeamLocationLinkReader reader() {
		return reader;
	}

}
