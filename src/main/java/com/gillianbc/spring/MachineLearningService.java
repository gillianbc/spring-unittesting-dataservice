package com.gillianbc.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("mach")
public class MachineLearningService implements DataModelService {

	@Autowired
	@Qualifier("yellowfruit")
	private String fruit;
	
	
    public boolean isValid(String input) {
        return true;
    }


	public String getFruit() {
		return fruit;
	}
    

}