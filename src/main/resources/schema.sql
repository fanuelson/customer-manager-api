CREATE TABLE city
(
    id    BIGINT AUTO_INCREMENT PRIMARY KEY,
    name  VARCHAR    NOT NULL,
    state VARCHAR(5) NOT NULL

);

CREATE TABLE customer
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    full_name  VARCHAR    NOT NULL,
    gender     VARCHAR(5) NOT NULL,
    birth_date DATE       NOT NULL,
    city_id    BIGINT     NOT NULL

);