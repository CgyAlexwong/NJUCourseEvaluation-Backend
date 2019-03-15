package nju.hackathon.njucourseevaluation.dataaccess.serviceinterface;

import nju.hackathon.njucourseevaluation.entity.Comment;
import nju.hackathon.njucourseevaluation.entity.Course;
import nju.hackathon.njucourseevaluation.entity.Description;
import nju.hackathon.njucourseevaluation.entity.Rate;

import java.util.List;

public interface CourseDataAcessService {
    Course GetCourseById(int id);
    Course GetCourseByCourse_id(String course_id);
    Course InsertCourse(Integer id, String course_id, int category, Rate rate, List<Comment> commentList, Description description);
    Course UpdateCourseById(Integer id, String course_id, int category, Rate rate, List<Comment> commentList, Description description);
}
