package com.sb.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService 
{
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("1", "Name1", "desc11"),
			new Topic("2", "Name2", "desc22"),
			new Topic("3", "Name3", "desc33")
			));
	
	public List<Topic> getAllTopics()
	{
		return topics;//returns json object
	}

	public Topic getTopic(String id) 
	{
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) 
	{
		topics.add(topic);
	}

	public void updateTopic(Topic updatedTopic, String id) 
	{
		for(int i = 0; i < topics.size(); i++) 
		{
			Topic topic = topics.get(i);
			
			if(topic.getId().equals(updatedTopic.getId()))
			{
				topics.set(i, updatedTopic);
			}
		}
	}

	public void deleteTopic(String id) 
	{
		topics.removeIf(t -> t.getId().equals(id));
	}
}
