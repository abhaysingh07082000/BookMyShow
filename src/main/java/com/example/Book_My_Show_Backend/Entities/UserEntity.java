package com.example.Book_My_Show_Backend.Entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="users")
@Data
@NoArgsConstructor
@Builder  //entitydto --->  entity
@AllArgsConstructor
public class UserEntity
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int age;

    @Column(unique = true,nullable = false)
    private String email;

    @NonNull
    @Column(unique = true)
    private String mobNo;

    private String address;


    @OneToMany(mappedBy = "userEntity",cascade = CascadeType.ALL)
    private List<TicketEntity>bookedTickets=new ArrayList<>();
}
