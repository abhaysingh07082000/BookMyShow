package com.example.Book_My_Show_Backend.Entities;


import com.example.Book_My_Show_Backend.Enums.SeatType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="theater_seats")
@Data
@NoArgsConstructor
public class TheaterSeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private String seatNo;

//child table with respect to the theater entity
    @ManyToOne
    @JoinColumn
    private TheaterEntity theaterEntity;



}
