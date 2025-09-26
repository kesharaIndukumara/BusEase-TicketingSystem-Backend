package edu.icet.ecom.model.dto;

import lombok.Data;

@Data
public class TicketDTO {
    private Long id;

    private String fullName;
    private Integer contactNumber;
    private String email;
    private Integer sheetsCount;
}
