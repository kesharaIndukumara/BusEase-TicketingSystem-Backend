package edu.icet.ecom.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class TicketDTO {
    private Long id;

    private String fullName;
    private Integer contactNumber;
    private String email;

    private Integer seatCount;
    private String busNumber;
    private Date journeyDate;
}
