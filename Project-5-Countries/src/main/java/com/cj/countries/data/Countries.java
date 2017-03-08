package com.cj.countries.data;


import com.cj.countries.model.Country;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class Countries {
    private static final List<Country> COUNTRIES = Arrays.asList(
            new Country("USA", 37600000L, "Washington, DC", new String[] {"English", "Spanish"}),
            new Country("Great Britain", 67800000L,"London", new String[] {"English"}),
            new Country("Zimbabwe", 14150000L, "Harare", new String[] {"English", "Tswana", "Venda","Shona", "Xhosa", "Tsonga", "Ndebele", "Chewa", "Tonga"}),
            new Country("Russia", 143500000L, "Moscow", new String[] {"Russian"}),
            new Country("Israel", 8059000L, "Tel Aviv", new String[] {"Hebrew", "Arabic"})
    );

    public Country getCountryByName(String name) {
        return COUNTRIES.stream()
                .filter(country -> name.equals(country.getName()))
                .findFirst()
                .orElse(null);
    }

    public List<Country> getCOUNTRIES() {
        return COUNTRIES;
    }
}

