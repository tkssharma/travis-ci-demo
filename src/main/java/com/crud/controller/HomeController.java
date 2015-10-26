package com.crud.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.crud.model.StudntModel;
import com.model.service.StudentService;

@Controller
public class HomeController {
	
	@Autowired
	private StudentService studentService;
	
	
	
	@RequestMapping
	public String SetUpForm(Map<String, Object> map)
	{
		StudntModel model = new StudntModel();
		map.put("student", model);
		map.put("studentList", studentService.list());
		
		return "student";
	}
	
	@RequestMapping(value="/student.do" , method=RequestMethod.POST)
    public ModelAndView DoAction(@ModelAttribute StudntModel studntModel , BindingResult result , @RequestParam String Action , Map<String, Object> map)
    {
		return null;
    	
    	
    }
	

}
