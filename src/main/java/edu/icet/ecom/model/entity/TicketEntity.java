package edu.icet.ecom.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "customer_ticket")
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private Integer contactNumber;
    private String email;

    private Integer seatCount;
    private String busNumber;
    private Date journeyDate;

}
