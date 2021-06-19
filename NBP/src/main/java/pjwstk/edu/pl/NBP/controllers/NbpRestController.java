package pjwstk.edu.pl.NBP.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nbp")
public class NbpRestController {

    @GetMapping("/get/average")
    public String getCurrencyRate(String currency, int daysRange){
        String urlurl = "http://api.nbp.pl/api/exchangerates/rates/a/" + currency + "/last/" + daysRange;
        ResponseEntity<String> forEntity = restTemplate.getForEntity(urlurl, String.class);
        return forEntity.toString();
    }
}
