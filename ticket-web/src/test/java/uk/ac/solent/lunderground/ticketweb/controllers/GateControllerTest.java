//package uk.ac.solent.lunderground.ticketweb.controllers;
//
//import org.junit.Before;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.web.context.WebApplicationContext;
//
//import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
//
//@ContextConfiguration(
//        locations =
//                {
//                        "classpath:spring/ticket-application-context.xml",
//                        "classpath:spring/ticket-servlet.xml"
//                }
//)
//@WebAppConfiguration
//@RunWith(SpringJUnit4ClassRunner.class)
//public class GateControllerTest
//{
//    /**
//     * Web Application Context used to allow the test cases to run.
//     */
//    @Autowired
//    private WebApplicationContext context;
//
//    /**
//     * MockMvc instance used to request endpoints and verify that the correct outcomes occur.
//     */
//    private MockMvc mockMvc;
//
//    /**
//     * Code to be executed before each test case to ensure that each one starts froms the same configuration.
//     */
//    @Before
//    public void setup()
//    {
//        mockMvc = webAppContextSetup(this.context).build();
//    }
//
//}
