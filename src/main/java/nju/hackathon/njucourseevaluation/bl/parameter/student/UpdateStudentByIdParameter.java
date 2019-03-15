package nju.hackathon.njucourseevaluation.bl.parameter.student;

import lombok.Getter;
import lombok.Setter;
import nju.hackathon.njucourseevaluation.entity.Comment;
import java.util.List;

@Setter
@Getter
public class UpdateStudentByIdParameter {
    private int id;
    private List<Comment> commentList;
}
