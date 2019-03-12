package nju.hackathon.njucourseevaluation.dataaccess.dao;

import nju.hackathon.njucourseevaluation.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Integer> {
    public Course findCourseById(int id);
}
