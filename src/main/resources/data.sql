
-- CITY
INSERT INTO city (id, name, state)
VALUES (1, 'São Paulo', 'SP');

-- CUSTOMER
INSERT INTO customer (full_name, gender, birth_date, city_id)
VALUES ('João Silva', 'MALE', CURRENT_DATE, 1);

-- CUSTOMER
INSERT INTO customer (full_name, gender, birth_date, city_id)
VALUES ('Maria Silva', 'FEMALE', CURRENT_DATE, 1);

