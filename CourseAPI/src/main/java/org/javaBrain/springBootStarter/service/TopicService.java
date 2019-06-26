package org.javaBrain.springBootStarter.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.javaBrain.springBootStarter.model.Topic;
import org.javaBrain.springBootStarter.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	private TopicRepository topicRepository;
	
	private List<Topic> topics=new ArrayList<Topic>( Arrays.asList(new Topic("spring", "spring framework", 1),
			new Topic("java", "spring framework", 2),
			new Topic("angular", "spring framework", 3)));
	
	public List<Topic> getAllTopics(){
		return (List<Topic>) topicRepository.findAll();
	}

	public Topic getTopic(int id){
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
		
	}

	public void updateTopic(Topic topic) {
		topicRepository.save(topic);	
	}
	
	public void deleteTopic(int id) {
		topicRepository.delete(id);	
	}
	
	
}
