package com.klef.jfsd.springboot.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class APIServiceImpl implements APIService
{
	@Autowired
	private RestTemplate restTemplate;



	@Override
	public List<Object> displayAllProducts() 
	{
		Object[] users=  restTemplate.getForObject("https://fakestoreapi.com/products", Object[].class);
		return Arrays.asList(users);
	}

	
}
