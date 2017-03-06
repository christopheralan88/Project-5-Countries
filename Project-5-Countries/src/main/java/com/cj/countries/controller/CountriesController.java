package com.cj.countries.controller;

import com.cj.countries.data.Countries;
import com.cj.countries.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class CountriesController {

    @Autowired // construct and assign an object to this field as soon as it's needed.  This is DI (Dependency Injection).
    private Countries countries;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String indexPage(@RequestParam(value = "sort", required = false) String sort, ModelMap model) {
        List<Country> countryList = countries.getCOUNTRIES();
        if (sort != null) {
            if (sort.equals("Country Name")) {
                countryList.sort((a, b) -> a.getName().compareTo(b.getName()));
            } else if (sort.equals("Population")) {
                countryList.sort((a, b) -> - a.getPopulation().compareTo(b.getPopulation())); // minus sign to make largest countries first
            }
        }
        model.put("countries", countryList);
        return "base";
    }

    @RequestMapping(value = "/detail/{name}", method = RequestMethod.GET)
    public String loadCountry(@PathVariable String name, ModelMap model) {
        model.put("country", countries.getCountryByName(name));
        return "country-detail";
    }
}
