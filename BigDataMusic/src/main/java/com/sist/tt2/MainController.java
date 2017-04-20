package com.sist.tt2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("main.do")
	public String main_page()
	{
		return "main";
	}
	@RequestMapping("content.do")
	public String main_content_page()
	{
		return "content";
	}
}
