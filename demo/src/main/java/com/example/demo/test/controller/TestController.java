package com.example.demo.test.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.test.service.TestService;
import com.example.demo.test.vo.TestVO;



@Controller
public class TestController {
	
	@Autowired 
	TestService testService;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());


	
	@RequestMapping(value = "/home") 
	public String home(){
		return "index.html"; 
	}
	
	@ResponseBody
	@RequestMapping("/valueTest")
	public String valueTest(){
		String value = "테스트 String";
		return value;
	}
	
	@RequestMapping("/test")
	public ModelAndView test() throws Exception{
		ModelAndView mav = new ModelAndView("test");
//		mav.addObject("name", "heyyyyyyyyyyyyyy");
//		List<String> testList = new ArrayList<String>(); 
//		testList.add("a"); 
//		testList.add("b"); 
//		testList.add("c");
		List<TestVO> testList = testService.selectTest(); 
		mav.addObject("list", testList); 
		
		
		
		logger.trace("Trace Level 테스트");
		logger.debug("DEBUG Level 테스트");
		logger.info("INFO Level 테스트");
		logger.warn("Warn Level 테스트");
		logger.error("ERROR Level 테스트");
		
		return mav;
	}
	
	@RequestMapping("/thymeleafTest") 
	public String thymeleafTest(Model model) {
		TestVO testModel = new TestVO();
		testModel.setName("차차차");
		testModel.setId("chachacha");
		model.addAttribute("testModel", testModel);
		return "thymeleaf/thymeleafTest"; 
	}
	

}
