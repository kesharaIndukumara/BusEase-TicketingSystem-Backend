package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.BusOwnerDTO;
import edu.icet.ecom.model.entity.BusOwnerEntity;
import edu.icet.ecom.service.BusOwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/busOwner")
@CrossOrigin
@RequiredArgsConstructor

public class BusOwnerController {

    final BusOwnerService busOwnerService;


    @PostMapping("/add")
    public BusOwnerDTO createBusOwner(@RequestBody BusOwnerEntity busOwner){
        return busOwnerService.createBusowner(busOwner);
    }

}
