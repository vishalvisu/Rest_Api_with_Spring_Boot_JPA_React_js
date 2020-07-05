package vishal.topic;

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

@RestController
public class Topic_Controller {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return topicService.getAll_Topics();
				
	}
	
	@RequestMapping("/topics/{id}")
	public Optional<Topic> geTopic(@PathVariable String id)
	{
		return topicService.get_topic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/topics")
	public List<Topic> addTopic (@RequestBody Topic topic)
	{
	   return	topicService.add_Topic(topic);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,path="/topics/{id}")
	public void deleteTopic (@PathVariable String id)
	{
	     topicService.deleteTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT,path="/topics/{id}")
	public void updateTopic (@PathVariable String id,@RequestBody Topic topic)
	{
		
		 topicService.Update_Topic(id,topic);
	}
	
	
};
