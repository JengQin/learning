package com.jeng.learn.spring.javaconfig;

public class Mp3 {
    private Player player;


    public void setPlayer(Player player) {
        this.player = player;
    }

    public void play() {
        player.play();
    }
}
