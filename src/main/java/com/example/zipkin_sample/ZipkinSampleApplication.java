package com.example.zipkin_sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipkinSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinSampleApplication.class, args);
	}

}
