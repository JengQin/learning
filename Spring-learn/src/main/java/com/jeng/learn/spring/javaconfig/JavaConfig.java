package com.jeng.learn.spring.javaconfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean("mp3")
    public Mp3 getPerson(Player player) {
        Mp3 mp3 = new Mp3();
        mp3.setPlayer(player);
        return mp3;
    }

    @Bean("player")
    public Player getPlayer() {
        return new Player();
    }

}
