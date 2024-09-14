package com.example.exjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EntityScan(basePackages = {"com/example/exjpa/CorruptedItem.java"})
public class SpringJPAApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJPAApplication.class, args);



		ItemRun itemRun = context.getBean(ItemRun.class);
		itemRun.sample();

		Relation oto = context.getBean(Relation.class);
		oto.sample();
	}
}

