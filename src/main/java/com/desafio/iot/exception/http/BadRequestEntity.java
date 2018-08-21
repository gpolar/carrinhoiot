package com.desafio.iot.exception.http;

import org.springframework.http.HttpStatus;

public class BadRequestEntity extends ExcecoesHttp {

	private static final long serialVersionUID = 1L;

	public BadRequestEntity(){
		super("Aconteceu um erro");
	}
	
	public BadRequestEntity(String message){
		super(message,HttpStatus.BAD_REQUEST);
	}
	
	
}
