package com.agora.hackathon.team5.service;

import java.util.List;

import com.agora.hackathon.team5.model.Article;

public interface ArticleService {

	List<Article> findAllArticles();
	Article findByTitle(String title);

}
