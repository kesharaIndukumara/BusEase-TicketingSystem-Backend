package edu.icet.ecom.service.impl;

import edu.icet.ecom.model.dto.BusOwnerDTO;
import edu.icet.ecom.model.entity.BusOwnerEntity;
import edu.icet.ecom.repository.BusOwnerRepository;
import edu.icet.ecom.service.BusOwnerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class BusOwnerServiceImpl implements BusOwnerService {

    final ModelMapper modelMapper;

    final BusOwnerRepository busOwnerRepository;

    @Override
    public BusOwnerDTO createBusowner(BusOwnerDTO busOwnerEntity) {
        // Validation: check required fields
        if (busOwnerEntity == null ||
            busOwnerEntity.getEmail() == null || busOwnerEntity.getEmail().isBlank() ||
            busOwnerEntity.getPassword() == null || busOwnerEntity.getPassword().isBlank() ||
            busOwnerEntity.getFullName() == null || busOwnerEntity.getFullName().isBlank()) {
            return null;
        }
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

        return busOwnerRepository.findByEmail(user.getEmail())
                .map(entity -> {
                    if (entity.getPassword() != null && entity.getPassword().equals(user.getPassword())) {
//                        System.out.println("success");
                        return "Login Successful";
                    } else {
                        return "Login Failed";
                    }
                })
                .orElse("Login Failed");
    }
}
