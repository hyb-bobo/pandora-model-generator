package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.T700User;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface T700UserReader extends BaseReader<String, T700User> {

}