package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.TicketDTO;
import edu.icet.ecom.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
@CrossOrigin
@RequiredArgsConstructor
public class TicketController {
    private final TicketService ticketService;

    @PostMapping("/add")
    public void createTicket(TicketDTO ticketDTO){
        ticketService.createTicket(ticketDTO);
    }

}
