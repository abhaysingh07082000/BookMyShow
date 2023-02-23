package com.example.Book_My_Show_Backend.Entities;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="theaters")
@Data
@NoArgsConstructor
public class TheaterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String location;

    //this is the parent table with respect to the Theater entity
    @OneToMany(mappedBy = "theaterEntity",cascade = CascadeType.ALL)
    private List<TheaterSeatEntity>theaterSeatEntityList=new ArrayList<>();


  @OneToMany(mappedBy = "theaterEntity",cascade = CascadeType.ALL)
    private List<ShowEntity>showEntityList=new ArrayList<>();


}