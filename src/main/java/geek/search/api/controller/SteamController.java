package geek.search.api.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import geek.search.api.models.AppList;
import geek.search.api.models.ResponseSteam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import static geek.search.api.ServiceConstants.FALHA_CHAMADA_SETAM_API;
import static geek.search.api.ServiceConstants.URL_STEAM;

@RestController
@RequestMapping(value = "/")
public class SteamController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/")
    public ResponseEntity<?> getSteamApps(){
        try {
            ResponseSteam responseSteam = new ObjectMapper().readValue(
                    restTemplate.getForObject(URL_STEAM, String.class),
                    ResponseSteam.class);

            return new ResponseEntity<>(responseSteam, HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(FALHA_CHAMADA_SETAM_API, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
