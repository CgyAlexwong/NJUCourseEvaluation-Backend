package nju.hackathon.njucourseevaluation.dataaccess.serviceimpl;

import nju.hackathon.njucourseevaluation.dataaccess.dao.CourseDao;
import nju.hackathon.njucourseevaluation.dataaccess.serviceinterface.CourseDataAcessService;
import nju.hackathon.njucourseevaluation.entity.CommentList;
import nju.hackathon.njucourseevaluation.entity.Course;
import nju.hackathon.njucourseevaluation.entity.Rate;
import org.springframework.beans.factory.annotation.Autowired;

public class CourseDataAcessServiceImpl implements CourseDataAcessService {

    private final CourseDao courseDao;
    @Autowired
    public CourseDataAcessServiceImpl(CourseDao courseDao){
        this.courseDao = courseDao;
    }

    @Override
    public Course GetCourseById(int id) {
        return null;
    }

    @Override
    public Course GetCourseByCourse_id(String course_id) {
        return null;
    }

    @Override
    public Course InsertCourse(Integer id, String course_id, int category, Rate rate, CommentList commentList, String description) {
        return null;
    }

    @Override
    public Course UpdateCourseById(Integer id, String course_id, int category, Rate rate, CommentList commentList, String description) {
        return null;
    }
}