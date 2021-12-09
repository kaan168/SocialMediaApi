package com.example.InstagramApi.api.controllers;


import com.example.InstagramApi.business.abstracts.UserService;
import com.example.InstagramApi.core.results.Result;
import com.example.InstagramApi.entities.concrents.Photo;
import com.example.InstagramApi.entities.concrents.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/addUser")
    public Result addUser(@RequestBody User user){

       return userService.addUser(user);
    }

    @PostMapping("/postPhoto")
    public Result postPhoto(@RequestBody Photo photo,Integer userid){

        return userService.postPhoto(photo,userid);
    }

}
