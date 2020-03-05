package com.agora.hackathon.team5.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agora.hackathon.team5.model.Content;
import org.springframework.cache.annotation.Cacheable;

public interface ContentRepository  extends MongoRepository<Content, Long> {

	@Cacheable("content")
	public List<Content> findByPubCode(String pubCode);



}
