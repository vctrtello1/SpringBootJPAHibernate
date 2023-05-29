package com.victortello.springboot.learnJPAandHibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {

	@Autowired
	private JdbcTemplate sprinJdbcTemplate;

	private static String INSERT_QUERY = """
			insert into
					  course(id, name, author)
					values
					  (1, 'Learn AWS', 'Victor Tello');
			insert into
					  course(id, name, author)
					values
					  (2, 'Learn DevOps', 'Victor Tello');
			""";

	public void insert() {
		sprinJdbcTemplate.update(INSERT_QUERY);
	}

}
