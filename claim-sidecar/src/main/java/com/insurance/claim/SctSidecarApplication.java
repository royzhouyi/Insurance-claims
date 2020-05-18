package com.insurance.claim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@EnableSidecar
@SpringBootApplication
public class SctSidecarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SctSidecarApplication.class, args);
	}

}
