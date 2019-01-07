package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.TBdFactory;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface TBdFactoryReader extends BaseReader<String, TBdFactory> {

}