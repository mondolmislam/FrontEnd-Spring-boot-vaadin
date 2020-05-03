package com.proit.todoapp.request;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

public interface RequestHandler<T> {
	public ResponseEntity<List<T>> createRequest(String url, T entity, HttpMethod method);
	public ResponseEntity<List<T>> createRequest(String url, T entity, HttpMethod method,Map<String,String> parameters);
}
