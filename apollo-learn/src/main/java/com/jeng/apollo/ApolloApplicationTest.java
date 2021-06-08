package com.jeng.apollo;

import com.jeng.apollo.service.ApolloServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.Banner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * The ApolloApplicationTest
 *
 * @author JiaZheng
 * @create 2021-06-07 22:29
 */
@SpringBootApplication
public class ApolloApplicationTest implements ApplicationRunner {

    @Autowired
    private ApolloServiceTest apolloServiceTest;

    public static void main(String[] args) {
        new SpringApplicationBuilder(ApolloApplicationTest.class)
                .web(WebApplicationType.NONE)
                .bannerMode(Banner.Mode.OFF)
                .build()
                .run(args);

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        apolloServiceTest.run();

    }
}
