package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.T700Region;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface T700RegionReader extends BaseReader<String, T700Region> {

}