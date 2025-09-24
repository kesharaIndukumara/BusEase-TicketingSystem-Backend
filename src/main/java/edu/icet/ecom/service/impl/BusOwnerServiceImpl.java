package edu.icet.ecom.service.impl;

import edu.icet.ecom.model.dto.BusOwnerDTO;
import edu.icet.ecom.model.entity.BusOwnerEntity;
import edu.icet.ecom.repository.BusOwnerRepository;
import edu.icet.ecom.service.BusOwnerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BusOwnerServiceImpl implements BusOwnerService {

    final ModelMapper modelMapper;

    final BusOwnerRepository busOwnerRepository;

    @Override
    public BusOwnerDTO createBusowner(BusOwnerDTO busOwnerEntity) {
        BusOwnerEntity busOwner = modelMapper.map(busOwnerEntity, BusOwnerEntity.class);
        BusOwnerEntity savedBusOwner = busOwnerRepository.save(busOwner);
        return modelMapper.map(savedBusOwner, BusOwnerDTO.class);

    }

    @Override
    public String loginRequest(BusOwnerDTO user) {
        // Validate input
        if (user == null || user.getEmail() == null || user.getPassword() == null
                || user.getEmail().isBlank() || user.getPassword().isBlank()) {
            return "Login Failed";
        }

        // Lookup by email and compare password
        return busOwnerRepository.findByEmail(user.getEmail())
                .map(entity -> entity.getPassword() != null && entity.getPassword().equals(user.getPassword())
                        ? "Login Successful"
                        : "Login Failed")
                .orElse("Login Failed");
    }
}
