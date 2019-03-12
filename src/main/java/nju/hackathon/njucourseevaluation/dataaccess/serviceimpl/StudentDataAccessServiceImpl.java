package nju.hackathon.njucourseevaluation.dataaccess.serviceimpl;

import nju.hackathon.njucourseevaluation.dataaccess.dao.StudentDao;
import nju.hackathon.njucourseevaluation.dataaccess.serviceinterface.StudentDataAccessService;
import nju.hackathon.njucourseevaluation.entity.CommentList;
import nju.hackathon.njucourseevaluation.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentDataAccessServiceImpl implements StudentDataAccessService {

    public final StudentDao studentDao;
    @Autowired
    public StudentDataAccessServiceImpl(StudentDao studentDao){
        this.studentDao = studentDao;
    }

    @Override
    public Student GetStudentById(int id) {
        return null;
    }

    @Override
    public Student GetStudentByStudentByStudent_number(String studentNumber) {
        return null;
    }

    @Override
    public Student InsertStudent(Integer id, String studentName, String studentNumber, CommentList commentList) {
        return null;
    }

    @Override
    public Student UpdateStudentById(Integer id, String studentName, String studentNumber, CommentList commentList) {
        return null;
    }
}
