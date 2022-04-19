DROP TABLE IF EXISTS credit_card;
DROP TABLE IF EXISTS card_holder;

CREATE TABLE IF NOT EXISTS card_holder(
    id SERIAL,
    name VARCHAR,
    last_name VARCHAR,
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS credit_card(
   id INTEGER PRIMARY KEY,
   brand VARCHAR NOT NULL,
   card_number VARCHAR NOT NULL,
   card_holder_id INTEGER NOT NULL,
   expiration_date DATE NOT NULL,
   FOREIGN KEY (card_holder_id) REFERENCES card_holder (id)
);