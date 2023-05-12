package com.pream.applicationLearn.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{

    private final ChuckNorrisQuotes chuckQuote;

    public JokeServiceImpl(ChuckNorrisQuotes chuckQuote) {
        this.chuckQuote = chuckQuote;
    }

    @Override
    public String makeJoke() {
        return chuckQuote.getRandomQuote();
    }
}
