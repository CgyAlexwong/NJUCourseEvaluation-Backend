package nju.hackathon.njucourseevaluation.bl.response.course;

import nju.hackathon.njucourseevaluation.entity.Course;

import java.util.List;

public class GetCoursesByCatagoryResponse {
    //TODO
    private List<Course> courseList;
    public GetCoursesByCatagoryResponse(List<Course> courseList){
        this.courseList = courseList;
    }
}
