package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.T700Attachment;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface T700AttachmentReader extends BaseReader<String, T700Attachment> {

}