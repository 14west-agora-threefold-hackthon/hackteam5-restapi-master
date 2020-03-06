package com.agora.hackathon.team5.service;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.agora.hackathon.team5.model.Article;
import com.agora.hackathon.team5.repository.ArticleRepository;

@Service
public class ArticleServiceImpl implements ArticleService {

	ArticleRepository articleRepository;

	public ArticleServiceImpl (ArticleRepository articleRepository){
		this.articleRepository = articleRepository;
	}

	@Override
	public List<Article> findAllArticles() {
		return articleRepository.findAll();
	}

	@Override
	public Article findByTitle(String title){
//		String newTitle = StringUtils.replace(title,"?", "\\?");
//		newTitle = StringUtils.replace(newTitle,"\"","\\\"" );
		return articleRepository.findByTitle(title);
	}
}
