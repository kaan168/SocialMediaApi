package com.example.InstagramApi.business.abstracts;

import com.example.InstagramApi.core.results.Result;
import com.example.InstagramApi.entities.concrents.Photo;
import com.example.InstagramApi.entities.concrents.User;
import org.springframework.stereotype.Service;



public interface UserService {

    public Result addUser(User user);

    public Result postPhoto(Photo photo,Integer userid);
}
