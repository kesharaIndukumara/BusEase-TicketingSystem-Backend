package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.BusOwnerDTO;
import edu.icet.ecom.model.entity.BusOwnerEntity;

public interface BusOwnerService {

    BusOwnerDTO createBusowner(BusOwnerDTO busOwnerEntity);

    String loginRequest( BusOwnerDTO user);
}
