package nju.hackathon.njucourseevaluation.dataaccess.serviceimpl;

import nju.hackathon.njucourseevaluation.dataaccess.dao.CourseDao;
import nju.hackathon.njucourseevaluation.dataaccess.serviceinterface.CourseDataAcessService;
import nju.hackathon.njucourseevaluation.entity.Comment;
import nju.hackathon.njucourseevaluation.entity.Course;
import nju.hackathon.njucourseevaluation.entity.Description;
import nju.hackathon.njucourseevaluation.entity.Rate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseDataAcessServiceImpl implements CourseDataAcessService {

    private final CourseDao courseDao;

    @Autowired
    public CourseDataAcessServiceImpl(CourseDao courseDao){
        this.courseDao = courseDao;
    }

    @Override
    public Course GetCourseById(int id) {
        return courseDao.findById(id).orElse(null);
    }

    @Override
    public Course GetCourseByCourse_id(String course_id) {
        return courseDao.findCourseByCourse_id(course_id);
    }

    @Override
    public Course InsertCourse(Integer id, String course_id, int category, Rate rate, List<Comment> commentList, Description description) {
        return courseDao.save(new Course(id, course_id, category, rate, commentList, description));
    }

    @Override
    public Course UpdateCourseById(Integer id, String course_id, int category, Rate rate, List<Comment> commentList, Description description) {
        return courseDao.save(new Course(id, course_id, category, rate, commentList, description));
    }
}
