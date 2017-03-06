package com.cj.countries.model;


import java.util.Arrays;
import java.util.List;

// implements Comparable<Country>
public class Country {
    private String name;
    private Long population;
    private String capitalCity;
    private List<String> officialLanguages;

    public Country(String name, Long population, String capitalCity, String[] officialLanguages) {
        this.name = name;
        this.population = population;
        this.capitalCity = capitalCity;
        this.officialLanguages = Arrays.asList(officialLanguages);
    }

    /*public int compareTo(Country other) {
        if (this.equals(other)) {
            return 0;
        } else {
            return this.getName().compareTo(other.getName());
        }
    }*/

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
