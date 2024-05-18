package com.example.blog.common;

import org.springframework.stereotype.Service;

@Service
public class StringModifier {
    public String removeSpecialCharacter(String input) {
        return input.replaceAll("[^a-zA-Z0-9]"," ").trim();
    }
    public String slugify(String input) {
        return removeSpecialCharacter(input)
                .toLowerCase()
                .replaceAll("[^a-zA-Z0-9]","-");
    }
}
