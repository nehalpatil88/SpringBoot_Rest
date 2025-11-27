package com.springrest.Services;

import java.util.List;

import com.springrest.Bindings.Course;

public interface CourseService {
    public String upsert(Course course);
    public Course getById(Integer id);
    public List<Course> getAllCourses();
    public String deleteById(Integer id);
}
