package com.Library.LibraryManagmentSystem;

import com.Library.LibraryManagmentSystem.builderDesignpatternDemo.BuilderDesignDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryManagmentSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagmentSystemApplication.class, args);

		/*
		 original problem was the creation of the BuilderDesignDemo object was tricky
		 we have to remember the order of 10 or 15 objects
		BuilderDesignDemo builderDesignDemo = new BuilderDesignDemo.Builder()
				.setName("Aman").setCity("New York").setPincode("10001").setStreet("123 Main St").setId(1).build();
		System.out.println(builderDesignDemo.getCity());
		System.out.println(builderDesignDemo.getId());
		System.out.println(builderDesignDemo.getName());
		 this all the example of builder design pattern

		 */


	}

}
