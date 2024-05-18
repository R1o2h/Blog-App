package com.example.blog.articles;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticlesService {
    private ArticlesRepository articlesRepository;

    public ArticlesService(ArticlesRepository articlesRepository) {
        this.articlesRepository=articlesRepository;
    }
    List<ArticlesEntity> getAllArticles() {
       return articlesRepository.findAll();
    }
    void getArticlesById(Long id) {
        articlesRepository.findById(id);
    }
    void getArticlesBySlug(String slug) {
       articlesRepository.findArticleEntitiesBySlugContaining(slug);
  }
}
