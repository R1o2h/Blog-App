package com.example.blog.articles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticlesController {
    @Autowired
    private ArticlesService articlesService;
    @GetMapping("")
    public List<ArticlesEntity> getArticles() {

        return articlesService.getAllArticles();
    }
}
