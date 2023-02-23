package com.example.Book_My_Show_Backend.Controllers;

import com.example.Book_My_Show_Backend.EntryDtos.UserEntryDto;
import com.example.Book_My_Show_Backend.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody UserEntryDto userEntryDto)
    {
             return "";
    }

}
