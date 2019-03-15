package nju.hackathon.njucourseevaluation.bl.serviceinterface;

import nju.hackathon.njucourseevaluation.bl.response.student.UpdateStudentByIdResponse;

public interface StudentblService {
    /**
     * 根据id更新学生
     */
    UpdateStudentByIdResponse UpdateStudentByIdResponse(int id);

}
