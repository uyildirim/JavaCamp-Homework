package com.example.springwebdemo.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
//@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
}
