package com.gillianbc.spring;

import com.gillianbc.spring.AppConfig;
import com.gillianbc.spring.DataModelService;
import com.gillianbc.spring.MachineLearningService;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class MachineLearningTest {

	//DI
    @Autowired
    @Qualifier("mach")
    DataModelService dms;
    
    

    @Test
    public void test_ml_always_return_true() {

        //assert correct type/impl
        assertThat(dms, instanceOf(MachineLearningService.class));

        //assert true
        assertThat(dms.isValid(""), is(true));
        
    }
    
    @Test
    public void checkBanana() {
    	assertEquals("banana",dms.getFruit());
    }
}