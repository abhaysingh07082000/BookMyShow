package com.example.Book_My_Show_Backend.Entities;


import com.example.Book_My_Show_Backend.Enums.ShowType;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="shows")
@Data
public class ShowEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate localDate;


    private LocalTime localTime;


    @Enumerated(value = EnumType.STRING)
    private ShowType showType;


    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedOn;


    @ManyToOne
    @JoinColumn
    private MovieEntity movieEntity;

    @ManyToOne
    @JoinColumn
    private TheaterEntity theaterEntity;


    @OneToMany(mappedBy = "showEntity",cascade = CascadeType.ALL)
    private List<TicketEntity>listOfBookedTickets=new ArrayList<>();


    @OneToMany(mappedBy = "showEntity",cascade = CascadeType.ALL)
    private List<ShowSeatEntity>listOfShowSeats=new ArrayList<>();
}
