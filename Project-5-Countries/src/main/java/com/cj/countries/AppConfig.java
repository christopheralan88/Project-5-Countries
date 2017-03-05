package com.cj.countries;


import com.cj.countries.model.Country;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;


@EnableAutoConfiguration
@ComponentScan // scans current package (com.cj.countries) for @Controller annotated classes
public class AppConfig {
    public static List<Country> countries;

    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }
}
