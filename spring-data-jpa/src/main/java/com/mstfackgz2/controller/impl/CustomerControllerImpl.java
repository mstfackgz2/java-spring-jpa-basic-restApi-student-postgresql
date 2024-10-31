package com.mstfackgz2.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mstfackgz2.controller.ICustomerController;
import com.mstfackgz2.dto.DtoCustomer;
import com.mstfackgz2.services.ICustomerService;


@RestController
@RequestMapping(path = "/api/customer")
public class CustomerControllerImpl implements ICustomerController {

	@Autowired
	private ICustomerService customerService;
	
	@GetMapping(path = "/get/{id}")
	@Override
	public DtoCustomer findCustomerById(@PathVariable(name = "id") Long id) {
		
		return customerService.findCustomerById(id);
	}

}
