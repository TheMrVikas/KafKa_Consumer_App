package com.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.Model.Customer;
import com.kafka.constant.KafkaConstants;

/**
 * 
 * @author Vikas
 *
 */
@Service
public class CustomerServiceImpl {

	@KafkaListener(topics = KafkaConstants.Topic, groupId = KafkaConstants.Group_id)
	public Customer listner(Customer c) {
		System.out.println("************ message Recived ************ ");
		return c;
	}
}
