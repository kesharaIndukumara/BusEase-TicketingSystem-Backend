package edu.icet.ecom.service.impl;

import edu.icet.ecom.model.dto.CustomerDTO;
import edu.icet.ecom.model.entity.CustomerEntity;
import edu.icet.ecom.repository.CustomerRepository;
import edu.icet.ecom.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.dao.IncorrectResultSizeDataAccessException;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    final ModelMapper modelMapper;
    final CustomerRepository customerRepository;

    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        // Normalize: id=0 should be treated as new
        if (customerDTO.getId() != null && customerDTO.getId() == 0) {
            customerDTO.setId(null);
        }

        if (customerDTO.getEmail()!=null && customerRepository.findByEmail(customerDTO.getEmail()).isPresent()) {
//            System.out.println("Email already exists");
            throw new IllegalArgumentException("Email already exists");
        }
        else {
            CustomerEntity customerEntity = modelMapper.map(customerDTO, CustomerEntity.class);
            CustomerEntity savedCustomer = customerRepository.save(customerEntity);
            return modelMapper.map(savedCustomer, CustomerDTO.class);
        }

    }

    @Override
    public String loginRequest(CustomerDTO customerDTO) {
        if (customerDTO == null || customerDTO.getEmail() == null || customerDTO.getPassword() == null
                || customerDTO.getEmail().isBlank() || customerDTO.getPassword().isBlank()) {
            return "Login Failed";
        }
        try {
            return customerRepository.findByEmail(customerDTO.getEmail())
                    .map(entity -> (entity.getPassword() != null && entity.getPassword().equals(customerDTO.getPassword()))
                            ? "Login Successful"
                            : "Login Failed")
                    .orElse("Login Failed");
        } catch (IncorrectResultSizeDataAccessException e) {
            // Duplicate email found; needs data cleanup + unique constraint
            return "Login Failed";
        }
    }
}
