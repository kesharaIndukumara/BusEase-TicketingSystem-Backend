package edu.icet.ecom.service.impl;

import edu.icet.ecom.model.dto.BusOwnerDTO;
import edu.icet.ecom.model.entity.BusOwnerEntity;
import edu.icet.ecom.repository.BusOwnerRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BusOwnerServiceImpl {

    final ModelMapper modelMapper;

    final BusOwnerRepository busOwnerRepository;

    public BusOwnerDTO createBusOwner(BusOwnerEntity busOwner){
        BusOwnerEntity busOwnerEntity = modelMapper.map(busOwner, BusOwnerEntity.class);
        busOwnerEntity = busOwnerRepository.save(busOwnerEntity);

        return modelMapper.map(busOwnerEntity, BusOwnerDTO.class);

    }
}
