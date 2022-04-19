package api.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class CreditCard {

    @Id
    @GeneratedValue
    private int id;
    private String brand;
    private String cardNumber;
    private String cardHolderName;
    private String cardHolderLastName;
    private LocalDate expirationDate;

    public CreditCard() {
    }

    public CreditCard(final int id, final  String brand, final String cardNumber, final String cardHolderName, final String cardHolderLastName,
                      final LocalDate expirationDate) {
        this.id = id;
        this.brand = brand;
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cardHolderLastName = cardHolderLastName;
        this.expirationDate = expirationDate;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCardHolderLastName() {
        return cardHolderLastName;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}
