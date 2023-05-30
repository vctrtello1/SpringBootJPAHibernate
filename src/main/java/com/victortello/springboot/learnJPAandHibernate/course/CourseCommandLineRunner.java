package com.victortello.springboot.learnJPAandHibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// imports from previous config

// import com.victortello.springboot.learnJPAandHibernate.course.jdbc.CourseJDBCRepository;
// import com.victortello.springboot.learnJPAandHibernate.course.jpa.CourseJPARepository;
import com.victortello.springboot.learnJPAandHibernate.course.springdatajpa.CourseSpringDataJPARepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    // switch to JPA Repository

    // @Autowired
    // private CourseJDBCRepository repository;

    //@Autowired
    //private CourseJPARepository repository;

    @Autowired
    private CourseSpringDataJPARepository repository;

    @Override
    public void run(String... args) throws Exception {


        // previous config for JPA

        /*repository.insert(new Course(1, "Learn AWS", "Victor Tello"));
        repository.insert(new Course(2, "Learn DevOps", "Victor Tello"));
        repository.insert(new Course(3, "Learn GCP", "Victor Tello"));

        repository.deleteById(1);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));*/


        // SpringBoot Data JPA config

        repository.save(new Course(1, "Learn AWS", "Victor Tello"));
        repository.save(new Course(2, "Learn DevOps", "Victor Tello"));
        repository.save(new Course(3, "Learn GCP", "Victor Tello"));
        repository.save(new Course(4, "Learn Lucianism", "Lucia Leon"));
        repository.save(new Course(5, "Learn Marrucol", "Marruco"));

        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));

        // more features

        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByAuthor("Lucia Leon"));
        System.out.println(repository.findByName("Learn Marrucol"));
        
        
    }

}
