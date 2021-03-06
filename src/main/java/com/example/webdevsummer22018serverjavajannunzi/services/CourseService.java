package com.example.webdevsummer22018serverjavajannunzi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.webdevsummer22018serverjavajannunzi.models.Course;
import com.example.webdevsummer22018serverjavajannunzi.repositories.CourseRepository;

@RestController
@CrossOrigin(origins="*")
public class CourseService {
	@Autowired
	CourseRepository courseRepository;
	
	@GetMapping("/api/course")
	public List<Course> findAllCourses() {
		return (List<Course>) courseRepository.findAll();
	}
	
	@PostMapping("/api/course")
	public Course createCourse(
			@RequestBody Course course) {
		return courseRepository.save(course);
	}
	
	@DeleteMapping("/api/course/{courseId}")
	public void deleteCourse(@PathVariable("courseId") int id) {
		
		courseRepository.deleteById(id);
		
//		Optional<Course> optional = courseRepository.findById(id);
//		if(optional.isPresent()) {
//			Course course = optional.get();
//			courseRepository.delete(course);
//		}
	}
}
