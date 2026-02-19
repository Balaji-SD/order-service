package com.kodewala.orderservice.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.kodewala.orderservice.request.OrderRequest;

@Service
public interface IOrderService {
	
	public int createOrder(OrderRequest orderRequest);

}
