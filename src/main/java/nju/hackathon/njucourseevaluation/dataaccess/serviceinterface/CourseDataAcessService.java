package nju.hackathon.njucourseevaluation.dataaccess.serviceinterface;

import nju.hackathon.njucourseevaluation.entity.CommentList;
import nju.hackathon.njucourseevaluation.entity.Course;
import nju.hackathon.njucourseevaluation.entity.Rate;

public interface CourseDataAcessService {
    Course GetCourseById(int id);
    Course GetCourseByCourse_id(String course_id);
    Course InsertCourse(Integer id, String course_id, int category, Rate rate, CommentList commentList, String description);
    Course UpdateCourseById(Integer id, String course_id, int category, Rate rate, CommentList commentList, String description);
}
