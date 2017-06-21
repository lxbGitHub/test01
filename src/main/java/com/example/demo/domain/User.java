package com.example.demo.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Rico on 2017/6/20.
 */
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private int age;



}
