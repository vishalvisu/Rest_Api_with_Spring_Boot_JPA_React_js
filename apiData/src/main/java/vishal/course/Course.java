package vishal.course;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import vishal.topic.Topic;

@Entity
public class Course {

	@Id
	private String id;
	private String name;
	private String description;
	
	@ManyToOne
	private Topic topic;
	
	public Course(String id, String name, String description,String topicId) 
	{
		super();
		this.id = id;
		this.name = name;
		this.description = description;
        this.topic = new Topic(topicId,"","");
	}
	
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public Course() {
		super();
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}


/*[
 {id:"101",title:"JEE",description:"Joint Entrance Exam Main is the national level computer based test conducted by the National Testing Agency for the purpose of admissions to the undergraduate engineering courses in top engineering institutes in India like National Institutes of Technology, IIITs and the Govt funded Technical Institutes. In addition, it is also the screening cum qualifier test for JEE Advanced.  The test is held twice in a year in January and April, and validity of the result is one year."},
 {id:"102",title:"NEET",description:"the National Eligibility cum Entrance Test (NEET) is for admission to medical colleges."},
 {id:"103",title:"ICAI",description:"also known as CA exams, is conducted by the Institute of Chartered Accountants of India (ICAI) for aspirants of Chartered Accountancy profession in India. The exam is conducted at different levels as per the CA courses"},
 {id:"104",title:"CLAT",description:"The Common Law Admission Test (CLAT) is a national level entrance exam for admissions to candidates in undergraduate (UG) and postgraduate (PG) law courses offered at 22 NLUs and other colleges/ universities accepting exam scores. Till 2018, the exam was conducted by NLUs on a rotational basis."},
 {id:"105",title:"CAT",description:"CAT exam or the Common Admission Test is a computer-based MBA entrance test for admissions into the IIMs and several other prestigious B-Schools "}]*/