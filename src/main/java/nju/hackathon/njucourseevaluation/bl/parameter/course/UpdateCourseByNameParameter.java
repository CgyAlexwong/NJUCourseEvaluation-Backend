package nju.hackathon.njucourseevaluation.bl.parameter.course;

import lombok.Getter;
import lombok.Setter;
import nju.hackathon.njucourseevaluation.entity.Comment;
import nju.hackathon.njucourseevaluation.entity.Description;
import nju.hackathon.njucourseevaluation.entity.Rate;

import java.util.List;

@Getter
@Setter
public class UpdateCourseByNameParameter { //添加评论和评分
    List<Comment> commentList;
    Description description;
    Rate rate;
}
