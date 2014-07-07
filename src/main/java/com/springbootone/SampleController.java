package com.springbootone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Configurable
@RestController
@EnableAutoConfiguration
public class SampleController {

	private static Logger log = LoggerFactory.getLogger(SampleController.class);

	private static final String template = "Hello, %s!";

	@RequestMapping("/")
	public @ResponseBody Greeting saHello(@RequestParam(value = "name", required = false, defaultValue = "Guest") String name) {
		return new Greeting(String.format(template, name));
	}

	public static void main(String[] args) throws Exception {
		log.debug("SampleController.main()" + " - start");
		SpringApplication.run(SampleController.class, args);
		log.debug("SampleController.main()" + " - end");
	}

}
