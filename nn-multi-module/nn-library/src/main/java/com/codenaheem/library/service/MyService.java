package com.codenaheem.library.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyService {

	@Value(value = "${service.message}")
	private String message;

	public String message() {
		return this.message;
	}
}
