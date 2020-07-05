package vishal.topic;

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
public class TopicService {

	@Autowired
	private TopicRepositry topicRepositry;
	
  private List<Topic> tList =new ArrayList<>(Arrays.asList());

  public Optional<Topic> get_topic(String id) 
  {
	
	 if(topicRepositry.findById(id)!=null)
		  return topicRepositry.findById(id);
		     
	return null;
  }
  
  public List<Topic> getAll_Topics() {	
	//	return topicList;
		List<Topic> tList=new ArrayList<>();
		
	   topicRepositry.findAll().forEach(tList::add);
	   
	   return tList;
	  }

   public List<Topic> add_Topic(Topic topic) {
	
     topicRepositry.save(topic);
	
     List<Topic> tList=new ArrayList<>();
	   topicRepositry.findAll().forEach(tList::add);
	   
	   return tList;
  }

public void deleteTopic(String id) {
	
	
	if(topicRepositry.existsById(id)==true)
	topicRepositry.deleteById(id);
	
	
}

public void Update_Topic(String id, Topic topic) 
{

	topicRepositry.save(topic);
	
	return ;
	
 }
	
}
