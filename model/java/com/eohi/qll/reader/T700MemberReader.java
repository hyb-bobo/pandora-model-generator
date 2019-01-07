package com.eohi.qll.reader;

import org.springframework.stereotype.Repository;

import com.eohi.qll.model.T700Member;
import com.eohi.qll.reader.base.BaseReader;

@Repository
public interface T700MemberReader extends BaseReader<String, T700Member> {

}