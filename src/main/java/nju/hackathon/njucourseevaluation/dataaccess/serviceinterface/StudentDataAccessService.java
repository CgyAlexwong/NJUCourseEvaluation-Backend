package nju.hackathon.njucourseevaluation.dataaccess.serviceinterface;

import nju.hackathon.njucourseevaluation.entity.CommentList;
import nju.hackathon.njucourseevaluation.entity.Student;

public interface StudentDataAccessService {
    Student GetStudentById(int id);
    Student GetStudentByStudentByStudent_number(String studentNumber);
    Student InsertStudent(Integer id, String studentName, String studentNumber, CommentList commentList);
    Student UpdateStudentById(Integer id, String studentName, String studentNumber, CommentList commentList);
}
