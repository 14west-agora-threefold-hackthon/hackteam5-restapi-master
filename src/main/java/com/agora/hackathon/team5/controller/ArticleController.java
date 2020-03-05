package com.agora.hackathon.team5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agora.hackathon.team5.model.Article;
import com.agora.hackathon.team5.service.ArticleService;

@RestController
@RequestMapping(value = "/article", produces = "application/json")
public class ArticleController {

	private ArticleService articleService;

	public ArticleController(ArticleService articleService){
		this.articleService = articleService;
	}
	@GetMapping( "/")
	public Iterable<Article> findAllArticles() {
		return articleService.findAllArticles();
	}

	@GetMapping( "/{title}")
	public Article findByTitle(@PathVariable String title) {
		return articleService.findByTitle(title);
	}
}
