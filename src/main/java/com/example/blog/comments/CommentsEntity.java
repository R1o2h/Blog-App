package com.example.blog.comments;

import com.example.blog.articles.ArticlesEntity;
import com.example.blog.common.BaseEntity;
import com.example.blog.users.UsersEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "comments")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CommentsEntity extends BaseEntity {
    @Column(nullable = false,length = 100)
    String title;
    @Column(columnDefinition = "TEXT")
    String body;

    @ManyToOne
    @JoinColumn(name = "author_id",nullable = false)
    UsersEntity author;

    @ManyToOne
    @JoinColumn(name = "article_id",nullable=false)
    ArticlesEntity article;

}
