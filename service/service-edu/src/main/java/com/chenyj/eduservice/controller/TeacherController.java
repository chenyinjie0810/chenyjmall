package com.chenyj.eduservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chenyj.commonutils.Result;
import com.chenyj.eduservice.entity.Teacher;
import com.chenyj.eduservice.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2020-06-13
 */
@RestController
@RequestMapping("/edu/teacher")
@Api(tags = "讲师管理")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @ApiOperation(value = "所有讲师列表")
    @GetMapping("/")
    public Result find() throws Exception {
        int a=10/0;
        return Result.ok().data("itms",teacherService.list());
    }

    @ApiOperation(value = "根据ID删除讲师")
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return teacherService.removeById(id);
    }


    @ApiOperation(value = "分页讲师列表")
    @GetMapping("{page}/{limit}")
    public Result pageList(@ApiParam(name = "page", value = "当前页码", required = true)  @PathVariable Long page,
                      @ApiParam(name = "limit", value = "每页记录数", required = true) @PathVariable Long limit){
        Page<Teacher> pageParam = new Page<>(page, limit);
        QueryWrapper<Teacher> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq(true,"user","");
        teacherService.page(pageParam, queryWrapper);
        List<Teacher> records = pageParam.getRecords();
        long total = pageParam.getTotal();
        return  Result.ok().data("total", total).data("rows", records);

    }
}

