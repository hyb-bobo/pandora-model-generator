package ${basePackage}.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ${basePackage}.reader.${className}Reader;
import ${basePackage}.service.${className}Service;

@Service
${deleteFlagStr}
public class ${className}ServiceImpl extends ${className}Service {
	
	@Autowired
	private ${className}Reader reader;

	@Override
	protected ${className}Reader reader() {
		return reader;
	}

}
