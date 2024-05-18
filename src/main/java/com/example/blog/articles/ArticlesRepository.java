package com.example.blog.articles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticlesRepository extends JpaRepository<ArticlesEntity,Long> {
//    @Query("SELECT * FROM articles a WHERE a.slug=?1")
//  List<ArticlesEntity>findByArticlesBySlug(String slug);
  List<ArticlesEntity>findArticleEntitiesBySlugContaining(String slug);
}
