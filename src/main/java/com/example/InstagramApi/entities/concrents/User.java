package com.example.InstagramApi.entities.concrents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(value = {"following","follower","photos","likings","commentList"})
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;

    @Column(name="profile_picture")
    private String profilePicture;



    @Column(name = "name")
    private String name;

    private String userName;

    private String bio;

    private String email;

    private String phoneNumber;

    private String Gender;


    @OneToMany(mappedBy = "user")
    private List<Photo> photos;

    @OneToMany(mappedBy = "user")
    private List<Liking> likings;

    @OneToMany(mappedBy = "user")
    private List<Comment> commentList;


    @ManyToMany
    @JoinTable(name = "table_followers",
            joinColumns = {@JoinColumn(name ="user_from_id")},
            inverseJoinColumns = { @JoinColumn(name = "user_to_id")}
    )
    @JsonIgnoreProperties("following")
    private List<User> follower;


    @ManyToMany
    @JoinTable(name="table_followers",
            joinColumns = {@JoinColumn(name = "user_to_id")},
            inverseJoinColumns = {@JoinColumn(name = "user_from_id")}
    )
    @JsonIgnoreProperties("follower")
    private List<User> following;


    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(Photo photo) {
        this.photos.add(photo);
    }
}
