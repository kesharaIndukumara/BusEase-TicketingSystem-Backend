package edu.icet.ecom.model.dto;

import lombok.Data;

@Data
public class CustomerDTO {
    private Long id; // removed @Id

    private Long nic;
    private String fullName;
    private String username;
    private String password;
    private String email;
    private Integer mobileNumber;
    private String role;

}
