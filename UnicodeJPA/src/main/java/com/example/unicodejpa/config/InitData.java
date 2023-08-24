package com.example.unicodejpa.config;

import com.example.unicodejpa.model.UniCode;
import com.example.unicodejpa.repository.UnicodeRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InitData
{

    @Autowired
    private UnicodeRepository unicodeRepository;

    @PostConstruct
    public void initData()
    {
        for ( char c = 'a'; c <= 'z'; c++ )
        {
            UniCode uniCode = new UniCode();
            uniCode.setBogstav(c);
            uniCode.setUnicode(c);
            uniCode.setBeskrivelse("This is character " + c);
            unicodeRepository.save(uniCode);
        }
    }
}
