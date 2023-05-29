package com.victortello.springboot.learnJPAandHibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.victortello.springboot.learnJPAandHibernate.course.Course;

@Repository
public class CourseJDBCRepository {

	@Autowired
	private JdbcTemplate sprinJdbcTemplate;

	private static String INSERT_QUERY = """
			insert into
					  course(id, name, author)
					values
					  (?,?,?);
			""";

	private static String DELETE_QUERY = """
			delete from
			  course
			where
			  id = ?;
			""";

	public void insert(Course course) {
		sprinJdbcTemplate.update(
				INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}

	public void deleteById(long id) {

		sprinJdbcTemplate.update(DELETE_QUERY, id);

	}

}
