package com.example.Book_My_Show_Backend.Services;


import com.example.Book_My_Show_Backend.Entities.UserEntity;
import com.example.Book_My_Show_Backend.EntryDtos.UserEntryDto;
import com.example.Book_My_Show_Backend.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{


    @Autowired
    UserRepository userRepository;

    public void addUser(UserEntryDto userEntryDto)
    {


        //this is set to all of the attributes in one go

        UserEntity userEntity=UserEntity.builder().age(userEntryDto.getAge()).name(userEntryDto.getName()).address(userEntryDto.getAddress())
                .email(userEntryDto.getEmail()).mobNo(userEntryDto.getMobNo()).build();

        userRepository.save(userEntity);

    }

}
