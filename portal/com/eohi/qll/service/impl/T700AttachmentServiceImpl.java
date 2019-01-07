package com.eohi.qll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eohi.qll.reader.T700AttachmentReader;
import com.eohi.qll.service.T700AttachmentService;

@Service
@DeleteFlag(flag = true)
public class T700AttachmentServiceImpl extends T700AttachmentService {
	
	@Autowired
	private T700AttachmentReader reader;

	@Override
	protected T700AttachmentReader reader() {
		return reader;
	}

}
