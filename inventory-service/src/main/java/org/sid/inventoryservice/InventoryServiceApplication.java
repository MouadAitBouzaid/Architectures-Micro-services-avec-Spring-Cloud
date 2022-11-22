package org.sid.inventoryservice;

import org.sid.inventoryservice.entities.Product;
import org.sid.inventoryservice.repository.productRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(productRepository productRepository, RepositoryRestConfiguration restConfiguration){
        restConfiguration.exposeIdsFor(Product.class);
        return args -> {

            productRepository.save(new Product(null, "Oridnateur", 788, 12));
            productRepository.save(new Product(null, "SmartWatch", 400, 200));
            productRepository.save(new Product(null, "SmartPhone", 520, 186));
            productRepository.findAll().forEach(p -> {
                System.out.println(p.getName());
            });
        };
    }

    ;
}


