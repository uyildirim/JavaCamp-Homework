package com.example.springwebdemo01.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    private Character customer_id;

}
