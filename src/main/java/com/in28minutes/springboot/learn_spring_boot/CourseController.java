package com.in28minutes.springboot.learn_spring_boot;
import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CourseController {
    @RequestMapping("/Courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "In 20minutes"),
                new Course(2, "Learn SpringBoot", "In 20minutes")
        );
    }
}
