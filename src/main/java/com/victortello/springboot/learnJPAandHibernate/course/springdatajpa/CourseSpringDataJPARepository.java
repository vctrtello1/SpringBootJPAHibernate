package com.victortello.springboot.learnJPAandHibernate.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victortello.springboot.learnJPAandHibernate.course.Course;

public interface CourseSpringDataJPARepository extends JpaRepository<Course, Long> {

}
