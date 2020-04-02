package com.atguigu.eduservice.controller;


import com.atguigu.eduservice.entity.EduTeacher;
import com.atguigu.eduservice.service.EduTeacherService;
import com.baomidou.mybatisplus.extension.api.R;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2020-04-02
 */
@RestController
@RequestMapping("/eduService/teacher")
public class EduTeacherController {

   @Autowired
    private EduTeacherService teacherService;


    @GetMapping("findAll")
    public List<EduTeacher> list(){

        return teacherService.list(null);

    }
    //2 逻辑删除讲师的方法

    @DeleteMapping("{id}")
    public boolean removeTeacher(@PathVariable String id) {
        boolean flag = teacherService.removeById(id);
        return flag;
    }
}

