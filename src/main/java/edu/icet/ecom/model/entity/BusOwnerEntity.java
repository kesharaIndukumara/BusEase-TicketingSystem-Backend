package edu.icet.ecom.model.entity;


import edu.icet.ecom.util.BusType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;

@Data
@Entity
@Table(name = "busOwner")
public class BusOwnerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String busChassisNumber;
    private Long nic;
    private String fullName;
    private String userName;
    private String localRouteNumber;
    private String vehicleRegNumber;
    private String address;
    private String password;
    private BusType busType;
    private Integer sheetsCount;
    private Boolean RouterType_normal;
    private Boolean RouterType_special;
    private Long RouterPermitNumber;
    private String email;
    private String role;
}
