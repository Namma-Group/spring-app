package com.example.fatcat;

//import com.example.fatcat.config.OpenAPIConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
//@Import(OpenAPIConfiguration.class)
public class FatcatApplication {

	public static void main(String[] args) {
		SpringApplication.run(com.example.fatcat.FatcatApplication.class, args);
	}

}
