package com.applicationlogin.response;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Response {

	private String message;
	private int status;
	private Object object;
	private String error;
	
	
	
	
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Response(String message, HttpStatus status, Object object, String error) {
		super();
		this.message = message;
		this.status = status.value();
		this.object = object;
		this.error = error;
	}
	
	
	public static Response response(String message, HttpStatus status, Object object, String error){
		Response response =new Response();
		response.setMessage(message);
		response.setStatus(status.value());
		response.setObject(object);
		response.setError(error);
		
		return response;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public Object getObject() {
		return object;
	}


	public void setObject(Object object) {
		this.object = object;
	}


	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}


	@Override
	public String toString() {
		return "Response [message=" + message + ", status=" + status + ", object=" + object + ", error=" + error + "]";
	}

	
	







	
//	public static ResponseEntity<Object> generateResponse(String message,HttpStatus status,Object responseObj){
//		
//	Map<String,Object> map=new HashMap();
//	map.put("message", message);
//	map.put("status", status.value());
//	map.put("data", responseObj);
//	
//	return new ResponseEntity<Object>(map,status);
	
	
}

