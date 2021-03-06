package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.T700Position;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface T700PositionReader extends BaseReader<String, T700Position> {

}