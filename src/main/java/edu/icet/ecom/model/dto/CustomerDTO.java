package edu.icet.ecom.model.dto;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class CustomerDTO {
    @Id
    private Long id;

    private Long nic;
    private String fullName;
    private String username;
    private String password;
    private String email;
    private Integer mobileNumber;

}
