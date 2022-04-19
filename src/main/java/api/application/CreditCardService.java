package api.application;

import api.domain.CreditCard;
import api.domain.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditCardService {

    @Autowired
    private CreditCardRepository creditCardRepository;

    public List<CreditCard> findAll(){
        final List<CreditCard> creditCards = creditCardRepository.findAll();
        return creditCards;
    }
}
