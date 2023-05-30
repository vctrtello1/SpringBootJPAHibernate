package com.victortello.springboot.learnJPAandHibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// import com.victortello.springboot.learnJPAandHibernate.course.jdbc.CourseJDBCRepository;
import com.victortello.springboot.learnJPAandHibernate.course.jpa.CourseJPARepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    // switch to JPA Repository

    // @Autowired
    // private CourseJDBCRepository repository;

    @Autowired
    private CourseJPARepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS", "Victor Tello"));
        repository.insert(new Course(2, "Learn DevOps", "Victor Tello"));
        repository.insert(new Course(3, "Learn GCP", "Victor Tello"));

        repository.deleteById(1);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }

}
