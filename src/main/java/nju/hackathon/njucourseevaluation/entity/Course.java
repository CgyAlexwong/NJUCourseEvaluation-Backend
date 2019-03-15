package nju.hackathon.njucourseevaluation.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "course_id")
    private String course_id;

    //课程类型
    /**
     * 1 专业课
     * 2 通识课
     * 3 通修课
     * 4 阅读
     * 5 公选
     */

    @Column(name = "category")
    private int category;

    @Column(name = "rate")
    private Rate rate;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "course_id")
    private List<Comment> commentList;

    @Column(name = "description")
    private Description description;

    public Course(){

    }

    public Course(Integer id, String course_id, int category, Rate rate, List<Comment> commentList, Description description){
        this.id = id;
        this.course_id = course_id;
        this.category = category;
        this.rate = rate;
        this.commentList = commentList;
        this.description = description;
    }
}
