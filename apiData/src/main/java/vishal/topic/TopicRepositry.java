package vishal.topic;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepositry  extends CrudRepository<Topic,String> {
	
	
	
	
	

}
