package vishal.course;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepositry  extends CrudRepository<Course,String> {
	
	
	List<Course> findByTopicId (String topicId);
	
	

}
