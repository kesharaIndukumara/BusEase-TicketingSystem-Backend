package edu.icet.ecom.service.impl;

import edu.icet.ecom.model.dto.TicketDTO;
import edu.icet.ecom.model.entity.TicketEntity;
import edu.icet.ecom.repository.TicketRepository;
import edu.icet.ecom.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {

    final TicketRepository ticketRepository;
    final ModelMapper modelMapper;

    @Override
    public void createTicket(TicketDTO ticketDTO) {
//        if (ticketDTO.getEmail().isEmpty()|| ticketDTO.getContactNumber().is) {
//            throw new IllegalArgumentException("Email is required");
//        } else {
//            ticketRepository.save(modelMapper.map(ticketDTO, TicketEntity.class));
//        }
    }
}
