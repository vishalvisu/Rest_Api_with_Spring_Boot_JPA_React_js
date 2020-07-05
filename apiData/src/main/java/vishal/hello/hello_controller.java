package vishal.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello_controller {

	@RequestMapping("/hello")
	public String Hello ()
	{
		return "Hi I You Are Watching This That Means Data is Reached From Backend";
	}
}
