package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.T700Person;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface T700PersonReader extends BaseReader<String, T700Person> {

}