package com.agora.hackathon.team5.repository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.agora.hackathon.team5.model.Article;

public interface ArticleRepository extends MongoRepository<Article, String> {

	@Cacheable("article")
	public Article findByTitle(String title);


}
