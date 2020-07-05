package vishal.course;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import vishal.topic.Topic;

@RestController
public class Course_Controller {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping("topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id)
	{
		return courseService.getAll_Courses(id);
				
	}

	@RequestMapping("topics/{topicId}/courses/{id}")
	public Optional<Course> geCourse(@PathVariable String id)
	{
		return courseService.get_course(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "topics/{id}/courses")
	public void addCourses (@RequestBody Course course,@PathVariable String id)
	{
		course.setTopic(new Topic(id,"",""));
	     courseService.add_Course(course);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,path="topics/{topicId}/courses/{id}")
	public void deleteCourse (@PathVariable String id,@PathVariable String topicId)
	{
	     courseService.deleteCourse(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT,path="/topics/{topicId}/courses/{id}")
	public void updateCourse (@PathVariable String id,@RequestBody Course course,@PathVariable String topicId)
	{	
		course.setTopic(new Topic(id,"",""));
		 courseService.Update_Course(id,course);
	}
	
	
};
