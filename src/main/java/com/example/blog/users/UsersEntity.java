package com.example.blog.users;

import com.example.blog.articles.ArticlesEntity;
import com.example.blog.common.BaseEntity;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity(name = "users")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UsersEntity extends BaseEntity {
    @Column(nullable = false,unique = true)
    String username;
    @Column(nullable = false) @Setter
    String password;
    @Column(nullable = false,unique = true)
    String email;
    @Nullable @Setter
    String bio;
    @Nullable @Setter
    String image;

    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    Set<ArticlesEntity> authoredArticles;

    @ManyToMany(fetch = FetchType.EAGER,mappedBy = "likers")
    Set<ArticlesEntity> likedArticles;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
    joinColumns =@JoinColumn(name = "following_id"),
            inverseJoinColumns =@JoinColumn(name = "follower_id"))
    Set<UsersEntity> followers;

    @ManyToMany(fetch = FetchType.EAGER)
    Set<UsersEntity> following;
}
