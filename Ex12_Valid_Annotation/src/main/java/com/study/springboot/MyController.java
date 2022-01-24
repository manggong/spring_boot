package com.study.springboot;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@RequestMapping("/")
	public @ResponseBody String root() throws Exception {
		return "Valid_Annotation (4)";
	}

	@RequestMapping("/insertForm")
	public String insert1() {
		return "createPage";
	}

	@RequestMapping("/create")
	public String insert2(@ModelAttribute("dto") @Valid ContentDto contentDto, BindingResult result) {

		String page = "createDonePage";
		System.out.println(contentDto);

		if (result.hasErrors()) {
//			System.out.println("getAllErrors:" + result.getAllErrors());
//
//			if (result.getFieldError("writer") != null) {
//				System.out.println("1:" + result.getFieldError("writer").getCode());
//			}
//			if (result.getFieldError("content") != null) {
//				System.out.println("2:" + result.getFieldError("content").getCode());

			if (result.getFieldError("wrtier") != null) {
				System.out.println("1:" + result.getFieldError("writer").getDefaultMessage());
			}
			if (result.getFieldError("content") != null) {
				System.out.println("1:" + result.getFieldError("contetnt").getDefaultMessage());
			}
			
			page = "createPage";
		}

		return page;
	}

//	@InitBinder // 프로젝트 시작 시 먼저 수행 함.
//	protected void initBinder(WebDataBinder binder) {
//		binder.setValidator(new ContentValidator());
//	}
}
