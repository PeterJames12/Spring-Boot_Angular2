package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Igor Hnes on 2/1/18.
 */
@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
}
