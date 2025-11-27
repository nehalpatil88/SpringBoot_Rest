package com.springrest.Repo;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.Bindings.Course;

public interface courseRepo extends JpaRepository<Course, Serializable>{

}