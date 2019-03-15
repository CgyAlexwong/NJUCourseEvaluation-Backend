package nju.hackathon.njucourseevaluation.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "student")
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "student_Number")
    private String studentNumber;

    @Column(name = "student_comment")
    private Comment commentList; //查看我以前的评价

    @Column(name = "terms")
    private int terms;

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
//    @JoinColumn(name = "student_id")
//    private List<Course> courseList;

    public Student(){ }

    public Student(Integer id, String studentName, String studentNumber, int terms){
        this.id = id;
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.terms = terms;
//        this.courseList = courseList;
    }
}
