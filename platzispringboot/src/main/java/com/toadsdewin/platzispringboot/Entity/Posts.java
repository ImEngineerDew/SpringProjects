package com.toadsdewin.platzispringboot.Entity;

import javax.persistence.*;

@Entity
@Table(name="posts")
public class Posts
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_post",nullable = false,unique = true)
    private Long id;

    @Column(name= "description", length = 255)
    private String description;

    @ManyToOne
    private User users;

    public Posts()
    {

    }

    public Posts(Long id, String description, User users) {
        this.id = id;
        this.description = description;
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }
}
