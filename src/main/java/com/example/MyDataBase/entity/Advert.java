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
public class Advert {

    @Id
    @GeneratedValue(generator = "increment")
    private Long id;

    @Column
    private String title;

    @Column
    private String text;

    @ManyToOne
    @JoinColumn(name="author", nullable=false)
    private MyUser author;

}
