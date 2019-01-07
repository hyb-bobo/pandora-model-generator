package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.TBdProcessParameter;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface TBdProcessParameterReader extends BaseReader<String, TBdProcessParameter> {

}