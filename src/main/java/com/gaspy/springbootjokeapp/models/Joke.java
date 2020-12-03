package com.gaspy.springbootjokeapp.models;

public class Joke {
    private String joke;

    public Joke() {
    }

    public Joke(String joke) {
        this.joke = joke;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }
}
