package com.gillianbc.spring;

import com.gillianbc.spring.AppConfig;
import com.gillianbc.spring.DataModelService;
import com.gillianbc.spring.MachineLearningService;
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
public class CalculationServiceTest {

	//DI
    @Autowired
    @Qualifier("calc")
    DataModelService dms;

    @Test
    public void test_ml_always_return_true() {

        //assert correct type/impl
        assertThat(dms, instanceOf(CalculationService.class));

        //assert true
        assertThat(dms.isValid(""), is(true));

    }
}