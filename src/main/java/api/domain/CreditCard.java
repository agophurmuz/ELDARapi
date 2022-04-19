package api.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class CreditCard {

    @Id
    @GeneratedValue
    private int id;
    private String brand;
    private String cardNumber;
    @OneToOne
    @JoinColumn(name = "card_holder_id", referencedColumnName = "id")
    private CardHolder cardHolder;
    private LocalDate expirationDate;

    public CreditCard() {
    }

    public CreditCard(final int id, final  String brand, final String cardNumber, final CardHolder cardHolder,
                      final LocalDate expirationDate) {
        this.id = id;
        this.brand = brand;
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
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

    public CardHolder getCardHolder() {
        return cardHolder;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}
