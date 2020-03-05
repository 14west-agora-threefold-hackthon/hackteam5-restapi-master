package com.agora.hackathon.team5.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agora.hackathon.team5.model.Content;
import org.springframework.cache.annotation.Cacheable;

public interface ContentRepository  extends MongoRepository<Content, Long> {

	@Cacheable("content")
	public Content findByPubCode(String pubCode);

}
