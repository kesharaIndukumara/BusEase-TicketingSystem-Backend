package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.CustomerDTO;
import edu.icet.ecom.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@CrossOrigin
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping("/add")
    public CustomerDTO createCustomer(@RequestBody CustomerDTO customer){
        return customerService.createCustomer(customer);
    }

    @PostMapping("/login")
    public String login(@RequestBody CustomerDTO customerDTO){
        return customerService.loginRequest(customerDTO);
    }
}
