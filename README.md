# Basic Example of Spring Junit Testing
Note - this is basic Spring - not Spring Boot

# What the App Does

Well, there isn't really an app - nothing to run as such.  

All we have is:

* AppConfig.java - configuration file that tells Spring to scan package com.gillianbc.spring

* DataModelService.java - interface with an isValid() method

* BeanMaker - @Configuration tells spring to look in this class for beans to manage.  @Bean on a method tells spring to run this method, put the returned object into the application context

* MachineLearningService - impl class of the DataModelService.  Annotated with @Service and named "mach" so Spring will manage it in the application context and call it "mach".  **Field Autowiring** - Autowires a String field with name "yellowfruit". i.e. asks Spring to look in the app context for a bean of type String with name "yellowfruit".
There is a getFruit() method that returns this String.

# What the test classes do

* @RunWith(SpringJUnit4ClassRunner.class) -  Indicates that the class should use Spring's JUnit facilities.

* @ContextConfiguration(classes = {AppConfig.class}) - tells the test class what classes to use to configure spring.  Note we could have multiple in here if necessary

The above annotations means the spring context is loaded for us.  To test the MachineLearningService, we need a spring managed instance of that class.  If we just initialised it, it wouldn't be a spring bean - spring has a MachineLearningService and we'd just be creating another instance of that class.  If it had any dependencies on spring properties or other beans, it wouldn't know about them.  So to test it we ask spring to assign it for us - by autowiring.

## MachineLearningServiceTest

@Autowired
@Qualifier("mach")

i.e. tells spring to have a look in the application context and use the bean called "mach" that implements the DataModelService


