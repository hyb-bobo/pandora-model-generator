package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.TBdPerson;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface TBdPersonReader extends BaseReader<String, TBdPerson> {

}