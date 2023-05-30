package com.victortello.springboot.learnJPAandHibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victortello.springboot.learnJPAandHibernate.course.Course;

public interface CourseSpringDataJPARepository extends JpaRepository<Course, Long> {

    // custom method

    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);

}
