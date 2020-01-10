package com.gillianbc.spring;

import org.springframework.stereotype.Service;

@Service("calc")
public class CalculationService implements DataModelService {

    public boolean isValid(String input) {
        return true;
    }

}