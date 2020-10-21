package com.example.MyDataBase.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class MyUser {

    @Id
    @GeneratedValue(generator = "increment")
    private Long id;

    @Column
    private String fio;

    @Column
    private String position;

    @ManyToOne
    @JoinColumn
    private University university;
}
