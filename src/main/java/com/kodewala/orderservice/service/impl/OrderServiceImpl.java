package com.kodewala.orderservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.orderservice.entity.OrderEntity;
import com.kodewala.orderservice.repository.OrderRepository;
import com.kodewala.orderservice.request.OrderRequest;
import com.kodewala.orderservice.service.IOrderService;

@Service
public class OrderServiceImpl implements IOrderService {

	@Autowired
	OrderRepository orderRepository;



	@Override
	public int createOrder(OrderRequest orderRequest) {
		OrderEntity entity = new OrderEntity();
		entity.setItemName(orderRequest.getItemName());
		entity.setPrice(orderRequest.getPrice());
		entity.setQty(orderRequest.getQty());
		entity.setStatus(orderRequest.getStatus());
		entity.setDescription(orderRequest.getDescription());

		OrderEntity orderEntity = orderRepository.save(entity);
		int orderId = orderEntity.getOrderId();
		return orderId;
		
	}

}
