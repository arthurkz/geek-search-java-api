package geek.search.api.service;

import geek.search.api.models.CountriesResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import static geek.search.api.ServiceConstants.*;

@Service
public class CountryService {

    @Autowired
    WebClient webClient;

    private static final Logger log = LogManager.getLogger(CountryService.class);

    public Flux<CountriesResponse> getCountries() {
        return webClient.get()
                .uri(URL_COUNTRIES)
                .retrieve()
                .bodyToFlux(CountriesResponse.class)
                .doOnError(throwlable -> log.error(FALHA_CHAMADA_SETAM_API, throwlable));
    }
}
