package com.example.blog.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringModifierTests {
    private StringModifier strModSvc;

    public StringModifierTests() {
        strModSvc = new StringModifier();
    }

    @Test
    public void removeSpecialCharacterWorks() {
        var input ="Hello World!";
        var expected="Hello World";
        var actual= strModSvc.removeSpecialCharacter(input);
      //  assert actual.equals(expected);
        assertEquals(expected,actual);
    }
    @Test
    public void slugifyWorks() {
        var input = "Hello World!";
        var expected = "hello-world";
        var actual =strModSvc.slugify(input);
        //assert actual.equals(expected);
        assertEquals(expected,actual);
    }
}
