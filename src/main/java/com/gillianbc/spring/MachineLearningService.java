package com.gillianbc.spring;

import org.springframework.stereotype.Service;

@Service("mach")
public class MachineLearningService implements DataModelService {

    public boolean isValid(String input) {
        return true;
    }

}