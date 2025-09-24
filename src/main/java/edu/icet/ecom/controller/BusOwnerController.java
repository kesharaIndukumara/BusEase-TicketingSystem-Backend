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

    private final BusOwnerService busOwnerService;


    @PostMapping("/add")
    public BusOwnerDTO createBusOwner(@RequestBody BusOwnerDTO busOwner){
        return busOwnerService.createBusowner(busOwner);
    }

    @PostMapping("/login")
    public String login(@RequestBody BusOwnerDTO user){
        return busOwnerService.loginRequest(user);
    }
}
