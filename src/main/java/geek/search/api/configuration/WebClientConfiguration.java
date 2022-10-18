package geek.search.api.configuration;

import io.netty.handler.codec.http.HttpHeaderValues;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

import static geek.search.api.ServiceConstants.SIZE;
import static geek.search.api.ServiceConstants.URL_COUNTRIES;


@Configuration
public class WebClientConfiguration {

    @Bean
    public WebClient webClient(){

        final ExchangeStrategies strategies = ExchangeStrategies.builder()
                .codecs(codecs -> codecs.defaultCodecs().maxInMemorySize(SIZE))
                .build();

        WebClient webClient = WebClient.builder()
                .baseUrl(URL_COUNTRIES)
                .defaultCookie("cookieKey", "cookieValue")
                .exchangeStrategies(strategies)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, HttpHeaderValues.APPLICATION_JSON.toString())
                .build();

        return webClient;
    }
}
