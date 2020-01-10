# Basic Example of Spring Junit Testing
Note - this is basic Spring - not Spring Boot - sourced from https://mkyong.com/unittest/junit-spring-integration-example/

# What the App Does

Well, there isn't really an app - nothing to run as such.  

All we have is:

* AppConfig.java - configuration file that tells Spring to scan package com.gillianbc.spring

* DataModelService.java - interface with an isValid() method

* MachineLearningService - impl class of the DataModelService.  Annotated with @Service and named "m1" so Spring will manage it in the application context and call it "m1"

# What the test class does

* @RunWith(SpringJUnit4ClassRunner.class) -  Indicates that the class should use Spring's JUnit facilities.

* @ContextConfiguration(classes = {AppConfig.class}) - tells the test class what classes to use to configure spring.  Note we could have multiple in here if necessary

The above annotations means the spring context is loaded for us.  To test the MachineLearningService, we need a spring managed instance of that class.  If we just initialised it, it wouldn't be a spring bean - spring has a MachineLearningService and we'd just be creating another instance of that class.  If it had any dependencies on spring properties or other beans, it wouldn't know about them.  So to test it we ask spring to assign it for us - by autowiring.

@Autowired
@Qualifier("ml")

i.e. have a look in the application context and assign the MachineLearningService bean known as m1
