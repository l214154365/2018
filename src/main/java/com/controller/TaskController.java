package com.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TaskController {


	static final String m="0/2 * * * * ?";
	@Scheduled(cron = m)//ÿ��2�����һ��
	@RequestMapping("/task")
	public String task(){

		return "0";
	}
}
