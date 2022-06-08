CREATE TABLE currency
(
    id            BIGINT       NOT NULL,
    description   VARCHAR(255) NOT NULL,
    is_deleted    BOOLEAN,
    updated       BIGINT,
    currency_name VARCHAR(255),
    CONSTRAINT pk_currency PRIMARY KEY (id)
);

ALTER TABLE currency
    ADD CONSTRAINT uc_currency_description UNIQUE (description);

CREATE TABLE sublimit
(
    id                     UUID NOT NULL,
    application_id         UUID,
    author                 UUID,
    sublimit_dictionary_id INTEGER,
    sublimit_sum           DECIMAL,
    currency_id            BIGINT,
    sublimit_sum_to_rub    DECIMAL,
    sublimit_period        INTEGER,
    CONSTRAINT pk_sublimit PRIMARY KEY (id)
);

CREATE TABLE sublimit_dictionary
(
    id          INTEGER NOT NULL,
    description VARCHAR(255),
    is_deleted  BOOLEAN,
    updated     BIGINT,
    CONSTRAINT pk_sublimit_dictionary PRIMARY KEY (id)
);

INSERT INTO sublimit_dictionary (id, description)
VALUES (1, 'ДО'),
       (2, 'Кредитование'),
       (3, 'Лизинг'),
       (4, 'МФ'),
       (5, 'Факторинг'),
       (6, 'Для обратной совместимости');

INSERT INTO currency (id, description)
VALUES (1, 'RUR'),
       (2, 'USD'),
       (3, 'EUR');

ALTER TABLE sublimit
    ADD CONSTRAINT FK_SUBLIMIT_ON_CURRENCY FOREIGN KEY (currency_id) REFERENCES currency (id);

ALTER TABLE sublimit
    ADD CONSTRAINT FK_SUBLIMIT_ON_SUBLIMIT_DICTIONARY FOREIGN KEY (sublimit_dictionary_id) REFERENCES sublimit_dictionary (id);
