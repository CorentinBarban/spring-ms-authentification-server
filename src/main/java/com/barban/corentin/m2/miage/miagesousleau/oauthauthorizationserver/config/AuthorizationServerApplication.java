package com.barban.corentin.m2.miage.miagesousleau.oauthauthorizationserver.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication(scanBasePackages = "com.barban.corentin.m2.miage.miagesousleau.oauthauthorizationserver")
@EntityScan("com.barban.corentin.m2.miage.miagesousleau.oauthauthorizationserver.entities")
@EnableJpaRepositories("com.barban.corentin.m2.miage.miagesousleau.oauthauthorizationserver.repository")
public class AuthorizationServerApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(AuthorizationServerApplication.class, args);
    }

}
