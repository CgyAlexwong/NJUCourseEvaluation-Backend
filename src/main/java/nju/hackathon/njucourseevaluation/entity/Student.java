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
    private CommentList commentList; //查看我以前的评价

    public Student(){ }

    public Student(Integer id, String studentName, String studentNumber, CommentList commentList){
        this.id = id;
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.commentList = commentList;
    }
}
