package nju.hackathon.njucourseevaluation.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "rate")

public class Rate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "rate")
    private Rate rate;

    public Rate(){}

    public Rate(Integer id, Rate rate){
        this.id = id;
        this.rate = rate;
    }

}
