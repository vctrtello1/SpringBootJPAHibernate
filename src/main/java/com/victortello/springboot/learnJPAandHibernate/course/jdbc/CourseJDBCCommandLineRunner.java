package com.victortello.springboot.learnJPAandHibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.victortello.springboot.learnJPAandHibernate.course.Course;

@Component
public class CourseJDBCCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJDBCRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS", "Victor Tello"));
        repository.insert(new Course(2, "Learn DevOps", "Victor Tello"));
        repository.insert(new Course(3, "Learn GCP", "Victor Tello"));

        repository.deleteById(1);

    }

}
