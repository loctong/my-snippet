package com.loctb3.snippet.MySnippet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class MySnippetApplication {

	@RequestMapping("/")
	@ResponseBody
	String home(){
		return "Hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(MySnippetApplication.class, args);
	}

}
