package geek.search.api.controller;

import geek.search.api.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class CountriesController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/")
    public Flux<?> getCountries(){
        try {
            return countryService.getCountries();
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
