package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.T700ProcessParameter;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface T700ProcessParameterReader extends BaseReader<String, T700ProcessParameter> {

}