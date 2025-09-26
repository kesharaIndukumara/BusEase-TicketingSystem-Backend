package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.CustomerDTO;

public interface CustomerService {
    CustomerDTO createCustomer(CustomerDTO customer);

    String loginRequest(CustomerDTO customerDTO);
}
