package com.invenio.test.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.invenio.test.student.InvenioTestStudentApplication;

@SpringBootApplication
public class InvenioTestStudentApplication {

	public static ConfigurableApplicationContext context;
	public static ConfigurableApplicationContext getContext() {
		return context;
	}
	public static void main(String[] args) {
		context = SpringApplication.run(InvenioTestStudentApplication.class, args);
	}
}


