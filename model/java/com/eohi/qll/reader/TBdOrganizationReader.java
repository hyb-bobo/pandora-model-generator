package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.TBdOrganization;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface TBdOrganizationReader extends BaseReader<String, TBdOrganization> {

}