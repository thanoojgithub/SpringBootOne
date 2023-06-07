package com.thanooj.demo.springboot.springbootone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class SpringBootOneApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringBootOneApplication.class);

	public static void main(String[] args) {
		log.debug("SpringBootOneApplication.main()" + " - start");
		SpringApplication.run(SpringBootOneApplication.class, args);
		log.debug("SpringBootOneApplication.main()" + " - end");
	}
}


@RestController
class Greet {

	private static final String template = "Hello, %s!";

	@GetMapping("/")
	@ResponseBody
	public String self() {
		return "Hey!!";
	}
	@RequestMapping("/greet")
	public @ResponseBody Greeting doGreet(@RequestParam(value = "name", required = false, defaultValue = "Guest") String name) {
		return new Greeting(String.format(template, name));
	}
}

