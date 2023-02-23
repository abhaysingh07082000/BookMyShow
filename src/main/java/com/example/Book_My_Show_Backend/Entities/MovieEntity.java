package com.example.Book_My_Show_Backend.Entities;


import com.example.Book_My_Show_Backend.Enums.Genre;
import com.example.Book_My_Show_Backend.Enums.Language;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="movies")
@Data
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true,nullable = false)
    private String movieName;

    private double ratings;

    private int duration;

    @Enumerated(value = EnumType.STRING)
    private Language language;


    @Enumerated(value =EnumType.STRING)
    private Genre genre;

    @OneToMany(mappedBy = "movieEntity",cascade = CascadeType.ALL)
    private List<ShowEntity>showEntityList=new ArrayList<>();

}
