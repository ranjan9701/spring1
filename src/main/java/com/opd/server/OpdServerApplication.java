package com.opd.server;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPid;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OpdServerApplication {

	private static final Logger LOGGER = LogManager.getLogger(OpdServerApplication.class);
	  
	public static void main(String[] args) {
		long time = new Date().getTime();
		SpringApplication.run(OpdServerApplication.class, args);
		System.out.println("OPD Insurance Service Start time : " + (new Date().getTime()-time)/1000 + " seconds.");
		 
		LOGGER.info("Process Id: " + new ApplicationPid().toString());
	}

}
