# 1. Створити базу даних mini_models_shop
# 2. Створити таблицю products із полями
# 	- id
# 	- name
# 	- description
# 	- category
# 	- code
# 	- scale
# 	- qty_in_stock
# 	- price
# 	- created_at
CREATE DATABASE IF NOT EXISTS mini_models_shop;
USE mini_models_shop;
CREATE TABLE products
(
    id           INT NOT NULL AUTO_INCREMENT,
    name         VARCHAR(50),
    description  TEXT,
    category     VARCHAR(20),
    code         INT,
    scale        FLOAT,
    qty_in_stock INT,
    price        FLOAT,
    created_at   DATETIME,
    PRIMARY KEY (id)
);

INSERT INTO products (name, description, category, code, scale, qty_in_stock, price, created_at)
    VALUE
    ('Canabis', 'Medical', 'medicine', 2022, 20.5, 1000, 89, '2022-06-08 19:34'),
    ('Salt', 'Kitchen', 'NaCl', 667, 20.5, 1000, 89, '2022-02-08 19:34'),
    ('Petrol', 'GAS', 'gas', 780, 10000, 999, 89, '2022-05-08 19:34');

INSERT INTO products(name, code)
    VALUE ('Test1', 10),
    ('Test1', 10);

