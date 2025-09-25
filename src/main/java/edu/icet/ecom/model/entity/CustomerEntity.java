package edu.icet.ecom.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "customer_user")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    private Long version;

    private Long nic;
    private String fullName;
    private String username;
    private String password;
    private String email;
    private Integer mobileNumber;
    private String role;


}
