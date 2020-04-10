package com.atguigu.eduservice.entity.course;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class EduCourseQuery {
    @ApiModelProperty(value = "课程发布状态")
    private String status;
    @ApiModelProperty(value = "课程名称,模糊查询")
    private String title;
}
