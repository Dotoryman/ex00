package org.zerock.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.SampleDTO;
import org.zerock.domain.SampleDTOList;
import org.zerock.domain.TodoDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	@GetMapping("/ex04")
	public String ex04(SampleDTO dto, @ModelAttribute("page") int page) {
		log.info("dto: " + dto);
		log.info("page: " + page);
		return "ex04";
	}
	
	//문자열을 Date로->
	@GetMapping
	public String ex03(TodoDTO dto) {
		log.info(dto);
		return "ex03";
	}
	
	
//	객체를 배열로 전달.
	@GetMapping("/ex02Bean")
	public String ex02Bean(SampleDTOList list) {
		log.info(list);
		return "ex02Bean";
	}
	
	@GetMapping("/ex02List")
	public String ex02List(Model model, @RequestParam("ids") ArrayList<String> ids ) {
		log.info("ids: " + ids);
		model.addAttribute("ids", ids);
		return "sample/ex02List";
	}
	
	
	@GetMapping("/ex02")
	public String ex02(@RequestParam("naming") String name, @RequestParam("aging") int age) {
		log.info("name: " + name);
		log.info("age: " + age);
		return "ex02";
	}
	
	
	
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {
		
		log.info(dto);
		return"ex01";
	}
	
	
	@RequestMapping(value="/basic", method = {RequestMethod.GET, RequestMethod.POST})
	public void basicGet() {
//		url : /sample/basic : Get/Post 두가지 요청에대해 컨트롤 실행
		log.info("basic get....."); //WEB-INF/views/sample/basic.jsp
	}
	
	@GetMapping("/basicOnlyGet")
	public void basicGet2() {
		log.info("basic get only....");
	}
	
	@RequestMapping("")
	public void basic() {
		log.info("basic.....");
	}
}
