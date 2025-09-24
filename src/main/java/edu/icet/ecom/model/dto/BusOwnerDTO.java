package edu.icet.ecom.model.dto;

import edu.icet.ecom.util.BusType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BusOwnerDTO {
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
}
