package com.alibaba.demo.microsvc.controller;

import com.alibaba.demo.microsvc.config.ACMConfig;
import com.alibaba.demo.microsvc.model.McClue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.demo.microsvc.dao.McClueRepository;


@RestController
public class MovieController {

	@Autowired
	McClueRepository mcClueRepository;

	@RequestMapping("/list-movies")
	public String listMovies() {
		Object testValue = ACMConfig.getPorpertiesValue("test.value");
		System.out.println(testValue);
		return (String)testValue;
	}
}
