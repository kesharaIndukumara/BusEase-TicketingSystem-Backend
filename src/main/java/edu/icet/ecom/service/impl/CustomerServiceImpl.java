package edu.icet.ecom.service.impl;

import edu.icet.ecom.model.dto.CustomerDTO;
import edu.icet.ecom.model.entity.CustomerEntity;
import edu.icet.ecom.repository.CustomerRepository;
import edu.icet.ecom.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    final ModelMapper modelMapper;

    final CustomerRepository customerRepository;

    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        CustomerEntity customerEntity = modelMapper.map(customerDTO, CustomerEntity.class);
        CustomerEntity savedCustomer = customerRepository.save(customerEntity);
        return modelMapper.map(savedCustomer, CustomerDTO.class);
    }
}
