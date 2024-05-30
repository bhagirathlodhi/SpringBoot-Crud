package com.student.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.student.student.entity.Student;
import com.student.student.service.StudentServ;

@Controller
public class StudentController {
	
	@Autowired
	private StudentServ stserv;
	
	 @GetMapping("/")
	    public String home(Model model) {
	        List<Student> lst = stserv.getAllStudents();
	        model.addAttribute("students", lst);
	        return "home";
	    }
	
	 @GetMapping("/register")
	    public String register(Model model) {
	        model.addAttribute("student", new Student());
	        return "register";
	    }
	                                                                         
	@PostMapping("/save")
	public String addStudent(@ModelAttribute Student st) {
		
		stserv.save(st);
		return "redirect:/";
		
	}
	
	@RequestMapping("/edit/{id}")
	public String editStudent(@PathVariable("id") int id, Model model) {
		
	 Student st = stserv.getStudentByid(id);
	 model.addAttribute("student", st);
	 return "edit";
		
	}


	    @GetMapping("/delete/{id}")
	    public String deleteStudent(@PathVariable("id") int id) {
	        stserv.deleteStudentById(id);
	        return "redirect:/";
	    }

}
