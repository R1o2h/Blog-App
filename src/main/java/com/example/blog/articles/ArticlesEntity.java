package com.example.blog.articles;

import com.example.blog.comments.CommentsEntity;
import com.example.blog.common.BaseEntity;
import com.example.blog.users.UsersEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity(name = "articles")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ArticlesEntity extends BaseEntity {
    @Column(nullable = false)
    String title;
    @Column(nullable = false,unique = true,length = 100)
    String slug;
    @Column(length = 150)
    String subtitle;
    @Column(columnDefinition = "TEXT")
    String body;

    @ManyToOne
    @JoinColumn(name = "author_id",nullable = false)
    UsersEntity author;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "likes",
            joinColumns = @JoinColumn(name = "article_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    Set<UsersEntity> likers;

    @OneToMany(mappedBy = "article",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    Set<CommentsEntity>comments;
}
