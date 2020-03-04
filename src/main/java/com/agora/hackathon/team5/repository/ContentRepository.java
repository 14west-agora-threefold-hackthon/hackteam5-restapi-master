package com.agora.hackathon.team5.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agora.hackathon.team5.model.Content;

public interface ContentRepository  extends MongoRepository<Content, String> {

	public Content findByPubCode(String pub_code);

}
