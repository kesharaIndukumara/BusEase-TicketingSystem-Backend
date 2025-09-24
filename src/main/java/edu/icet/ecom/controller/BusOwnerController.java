package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.BusOwnerDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/busOwner")
public class BusOwnerController {

    @PostMapping("/add")
    public BusOwnerDTO createBusOwner(@RequestBody BusOwnerDTO busOwner){
        return busOwner;

    }

}
