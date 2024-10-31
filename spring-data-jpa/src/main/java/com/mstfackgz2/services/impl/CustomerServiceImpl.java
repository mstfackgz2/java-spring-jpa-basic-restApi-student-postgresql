package com.mstfackgz2.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mstfackgz2.dto.DtoAdress;
import com.mstfackgz2.dto.DtoCustomer;
import com.mstfackgz2.entity.Adress;
import com.mstfackgz2.entity.Customer;
import com.mstfackgz2.repository.CustomerRepository;
import com.mstfackgz2.services.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public DtoCustomer findCustomerById(Long id) {
		DtoCustomer dtoCustomer = new DtoCustomer() ;
		DtoAdress dtoAdress = new DtoAdress() ;
		
		Optional<Customer> optional =  customerRepository.findById(id);
		if (optional.isEmpty()) {
			return null;
		}
		Customer customer = optional.get();
		Adress adress = optional.get().getAdress();
		
		BeanUtils.copyProperties(customer, dtoCustomer);
		BeanUtils.copyProperties(adress, dtoAdress);
		
		dtoCustomer.setAdress(dtoAdress);
		
		return dtoCustomer;
	}

}
