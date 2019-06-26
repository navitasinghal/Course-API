package org.javaBrain.springBootStarter.repository;

import org.javaBrain.springBootStarter.model.Topic;
import org.springframework.data.repository.CrudRepository;
public interface TopicRepository extends CrudRepository<Topic, Integer> {
	
	

}
