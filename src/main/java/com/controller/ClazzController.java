package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClazzController {
	@RequestMapping("/clazz")
	public String clazz(){
		return "clazz";
	}
	
	@RequestMapping("/course")
	public String course(){
		return "course";
	}
	
	@RequestMapping("/clazzAcourse")
	public String clazzAcourse(){
		return "clazzAcourse";
	}

	@RequestMapping("/teachAcourse")
	public String teachAcourse(){
		return "teachAcourse";
	}
	
	@RequestMapping("/teacher")
	public String teacher(){
		return "teacher";
	}
	@RequestMapping("/student")
	public String student(){
		return "student";
	}
	@RequestMapping("/Task")
	public String Task(){
		return "Task";
	}
	@RequestMapping("/update_info")
	public String updateinfo(){
		return "updatestinfo";
	}

	@RequestMapping("/myjsp")
	public String myjsp(){
		return "MyJsp";
	}

	@RequestMapping("/indicator")
	public String indicator(){
		return "indicator";
	}
	
	@RequestMapping("/sindicator")
	public String sindicator(){
		return "sindicator";
	}
	
	@RequestMapping("/sindicator_next")
	public String sindicator_next(){
		return "sindicator_next";
	}
	@RequestMapping("/tindicator")
	public String tindicator(){
		return "tindicator";
	}
	@RequestMapping("/tindicator_next")
	public String tindicator_next(){
		return "tindicator_next";
	}
	@RequestMapping("/erro")
	public String erro(){
		return "erro";
	}
}
