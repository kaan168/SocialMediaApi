package com.example.InstagramApi.business.concretes;

import com.example.InstagramApi.business.abstracts.UserService;
import com.example.InstagramApi.core.results.Result;
import com.example.InstagramApi.core.results.SuccesResult;
import com.example.InstagramApi.dataAccess.abstracts.UserDAO;
import com.example.InstagramApi.entities.concrents.Photo;
import com.example.InstagramApi.entities.concrents.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Optional;

@Service
public class UserManager implements UserService {

    private UserDAO userDAO;

    @Autowired
    public UserManager(UserDAO userDAO) {
    this.userDAO=userDAO;
    }


    @Override
    public Result addUser(User user) {
        user.setProfilePicture("https://t3.ftcdn.net/jpg/03/46/83/96/360_F_346839683_6nAPzbhpSkIpb8pmAwufkC7c5eD7wYws.jpg");
       userDAO.save(user);

        return new SuccesResult("User basariyla eklendi.");
    }

    @Override
    public Result postPhoto(Photo photo, Integer userid) {
        Optional<User> user=Optional.of(userDAO.getById(userid));

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        photo.setDate(formatter.format(date));

    user.get().setPhotos(photo);
        return new SuccesResult("Photo eklendi");
    }


}
