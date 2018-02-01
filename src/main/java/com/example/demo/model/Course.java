package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;

import javax.persistence.*;

/**
 * @author Igor Hnes on 2/1/18.
 */
@Getter
@Setter
@Entity
@Table(name = "course")
public class Course extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "user_id")
    private Long userId;
}
