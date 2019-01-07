package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.T700Function;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface T700FunctionReader extends BaseReader<String, T700Function> {

}