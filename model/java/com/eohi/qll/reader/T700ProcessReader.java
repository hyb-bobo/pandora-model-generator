package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.T700Process;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface T700ProcessReader extends BaseReader<String, T700Process> {

}