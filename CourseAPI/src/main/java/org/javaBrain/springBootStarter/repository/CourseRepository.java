package org.javaBrain.springBootStarter.repository;

import java.util.List;

import org.javaBrain.springBootStarter.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer>{
	public List<Course> findByTopicId(int topicId);
}	
