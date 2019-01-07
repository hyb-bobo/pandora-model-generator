package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.TBdProcess;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface TBdProcessReader extends BaseReader<String, TBdProcess> {

}