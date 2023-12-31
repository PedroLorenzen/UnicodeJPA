package com.example.unicodejpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnicodeRestController
{
    @GetMapping("/unicode/{i}")
    public String unicodeToChar(@PathVariable int i)
    {
        char c = (char) i;
        return "unicode=" + i + " char=" + c;
    }

    @GetMapping("/char/{c}")
    public String charToUnicode(@PathVariable char c)
    {
        int unicode = c;
        return "char=" + c + " unicode=" + unicode;
    }
}
