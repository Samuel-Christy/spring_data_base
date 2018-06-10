package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		// have a look@controllers.DemoController for data manipulation
		// and @resources/application.properties for toggling database (re)creation

	}

}
