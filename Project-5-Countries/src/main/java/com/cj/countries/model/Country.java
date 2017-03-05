package com.cj.countries.model;


import java.util.Arrays;
import java.util.List;

public class Country {
    private String name;
    private Long population;
    private String capitalCity;
    private List<String> officialLanguages;
    //private String flagImage; // string of directory path?

    public Country(String name, Long population, String capitalCity, String[] officialLanguages) {
        this.name = name;
        this.population = population;
        this.capitalCity = capitalCity;
        this.officialLanguages = Arrays.asList(officialLanguages);
    }

    public String getName() {
        return name;
    }

    public Long getPopulation() {
        return population;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public List<String> getOfficialLanguages() {
        return officialLanguages;
    }
}
