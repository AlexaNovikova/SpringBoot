package ru.geekbrains.spring.one.repositories;

import org.springframework.stereotype.Component;
import ru.geekbrains.spring.one.model.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class ProductRepository {
    private List<Product> products;

    @PostConstruct
    public void init() {
       products = new ArrayList<>(Arrays.asList(
               new Product(1L, "Product 1", 2000),
               new Product(2L, "Product 2", 3000),
               new Product(3L, "Product 3", 4500),
               new Product(4L, "Product 4", 1300),
               new Product(5L, "Product 5", 4300)
        ));
    }

    public List<Product> findAll() {
        return products;
    }

    public void save(Product product) {
        products.add(product);
    }

    public Optional<Product> findOneById(Long id) {
        for (Product p: products) {
            if (p.getId().equals(id)) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }
}
