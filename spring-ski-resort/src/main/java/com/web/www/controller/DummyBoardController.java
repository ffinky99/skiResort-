package com.web.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.www.service.DummyBoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/dummy-board/*")
@RequiredArgsConstructor
public class DummyBoardController {
	
	private final DummyBoardService dbsv;
	
	
	public void test() {
		log.info("test");
	}

	
}
