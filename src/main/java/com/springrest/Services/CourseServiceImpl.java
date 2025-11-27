package com.springrest.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.Bindings.Course;
import com.springrest.Repo.courseRepo;
@Service
public class  CourseServiceImpl implements CourseService  {
    @Autowired
    private courseRepo courserepo;
    @Override
    public String upsert(Course course) {
       courserepo.save(course);//update if the course is present and insert if not
       return "success";
    }

    @Override
    public Course getById(Integer id) {
      Optional <Course> findById = courserepo.findById(id);
      if(findById.isPresent()){
        return findById.get();
      }
    
       return null;
    }

    @Override
    public List<Course> getAllCourses() {
       return  courserepo.findAll();
    }

    @Override
    public String deleteById(Integer id) {
        if(courserepo.existsById(id)){
            courserepo.deleteById(id);
            return "Delete Success";
        }else{
return "No Records Found";
        }

    }
    
}
