package nju.hackathon.njucourseevaluation.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Setter
@Getter
@Table(name = "description")
@Entity
public class Description {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "teacher")
    private String teacher;

    @Column(name = "homework")
    private String homework;

    @Column(name = "requirement")
    private String requirement;

    @Column(name = "books")
    private String books;
}
