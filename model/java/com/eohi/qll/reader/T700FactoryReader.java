package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.T700Factory;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface T700FactoryReader extends BaseReader<String, T700Factory> {

}