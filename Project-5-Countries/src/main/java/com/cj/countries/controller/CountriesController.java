package com.cj.countries.controller;

import com.cj.countries.model.Country;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CountriesController {
    public static List<Country> countries = new ArrayList<Country>();

    @RequestMapping("/")
    //@ResponseBody // used to tell Spring that the String returned by method below should be used in the webpage's response body
    public String indexPage() {
        return "base";
    }

    @RequestMapping("/usa")
    public String usaPage(ModelMap model) {
        Country usa = new Country("USA", 37600000L,
                                  "Washington, DC",
                                   new String[] {"English", "Spanish"});
        model.put("country", usa);
        return "country-detail";
    }
}
