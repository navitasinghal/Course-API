package org.javaBrain.springBootStarter.service;

import java.util.List;

import org.javaBrain.springBootStarter.model.Course;
import org.javaBrain.springBootStarter.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;

	public List<Course> getAll(int topicId) {
		return (List<Course>) courseRepository.findByTopicId(topicId);
	}
	
	public Course getCourse(int id){
		return courseRepository.findOne(id);
	}
	
	public void addCourse(Course course){
		courseRepository.save(course);
	}
	
	public void deleteCourse(int id){
		courseRepository.delete(id);
	}

	public void updateCourse(Course course){
		courseRepository.save(course);
	}
}
