package vishal.course;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@Service
public class CourseService {

	@Autowired
	private CourseRepositry courseRepositry;
	
  private List<Course> cList =new ArrayList<>(Arrays.asList());

  public Optional<Course> get_course(String id) 
  {
	
	 if(courseRepositry.findById(id)!=null)
		  return courseRepositry.findById(id);
		     
	return null;
  }
  
  public List<Course> getAll_Courses(String id) {	
	//	return topicList;
		List<Course> tList=new ArrayList<>();
		
	   courseRepositry.findByTopicId(id).forEach(tList::add);
	   
	   return tList;
	  }

   public void add_Course(Course course) {
	
     courseRepositry.save(course);
	
	   
	   return ;
  }

public void deleteCourse(String id) {
	
	courseRepositry.deleteById(id);	
	
}

public void Update_Course(String id, Course course) 
{
	courseRepositry.save(course);
	
	return ;
 }
	
}
