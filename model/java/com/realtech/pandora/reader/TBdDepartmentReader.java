package com.realtech.pandora.reader;

import org.springframework.stereotype.Repository;

import com.realtech.pandora.model.TBdDepartment;
import com.realtech.pandora.reader.base.BaseReader;

@Repository
public interface TBdDepartmentReader extends BaseReader<String, TBdDepartment> {

}