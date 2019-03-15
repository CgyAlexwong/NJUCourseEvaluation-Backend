package nju.hackathon.njucourseevaluation.bl.parameter.course;

import nju.hackathon.njucourseevaluation.entity.Comment;
import nju.hackathon.njucourseevaluation.entity.Description;
import nju.hackathon.njucourseevaluation.entity.Rate;

import java.util.List;

public class InsertCourseByNameParameter { //vue操作
    private int id;
    private String course_id;
    private int category;
    private Rate rate;
    private List<Comment> commentList;
    private Description description;
}
