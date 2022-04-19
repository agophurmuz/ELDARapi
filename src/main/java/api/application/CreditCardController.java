package api.application;


import api.domain.CreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/creditCard")
public class CreditCardController {

    @Autowired
    private CreditCardService creditCardService;

    @GetMapping("/")
    public ResponseEntity<List<CreditCard>> listCreditcard() {
        return ResponseEntity.ok().body(creditCardService.findAll());
    }
}
