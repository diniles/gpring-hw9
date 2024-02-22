package ru.gb.productsservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Методы для работы с продуктами
}

