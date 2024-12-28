package com.example.E_Commerce;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.E_Commerce.models.Product;
import com.example.E_Commerce.repositories.ProductRepository;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        if (productRepository.count() == 0) {
            List<Product> products = Arrays.asList(
                new Product(
                    "Samsung Galaxy S23",
                    69999.00,
                    "Latest model with 256GB storage, 8GB RAM, Snapdragon 8 Gen 2 processor, and a stunning AMOLED display.",
                    4.5,
                    "Mobile Phone",
                    "Samsung Store",
                    150,
                    420
                ),
                new Product(
                    "Apple iPhone 15",
                    129999.00,
                    "Flagship phone with 128GB storage, A17 Bionic chip, Dynamic Island, and advanced camera system.",
                    4.8,
                    "Mobile Phone",
                    "Apple Store",
                    100,
                    530
                ),
                new Product(
                    "Casio G-Shock",
                    9999.00,
                    "Shock-resistant digital watch with 200m water resistance, stopwatch functionality, and LED backlight.",
                    4.6,
                    "Watch",
                    "Casio India",
                    300,
                    210
                ),
                new Product(
                    "Fossil Gen 6 Smartwatch",
                    22999.00,
                    "Smartwatch with heart rate monitoring, built-in GPS, AMOLED display, and voice assistant support.",
                    4.2,
                    "Watch",
                    "Fossil Store",
                    120,
                    190
                ),
                new Product(
                    "Nike Dri-FIT T-Shirt",
                    1999.00,
                    "Comfortable sports t-shirt with sweat-wicking fabric and breathable design for active lifestyles.",
                    4.4,
                    "T-Shirt",
                    "Nike Store",
                    500,
                    150
                ),
                new Product(
                    "Adidas Originals T-Shirt",
                    1799.00,
                    "Casual wear t-shirt with iconic 3-stripe design, premium cotton material, and regular fit.",
                    4.3,
                    "T-Shirt",
                    "Adidas Store",
                    400,
                    130
                ),
                new Product(
                    "OnePlus Nord CE 3",
                    25999.00,
                    "Mid-range phone with 128GB storage, 12GB RAM, 120Hz AMOLED display, and triple-camera setup.",
                    4.3,
                    "Mobile Phone",
                    "OnePlus Store",
                    200,
                    300
                ),
                new Product(
                    "Sony WH-1000XM5 Headphones",
                    29999.00,
                    "Premium noise-canceling wireless headphones with 30 hours of battery life and superior audio quality.",
                    4.9,
                    "Headphones",
                    "Sony Store",
                    80,
                    150
                ),
                new Product(
                    "Dell XPS 13 Laptop",
                    119999.00,
                    "Ultrabook with 13.4-inch InfinityEdge display, Intel Core i7 processor, and 16GB RAM for seamless performance.",
                    4.7,
                    "Laptop",
                    "Dell Store",
                    50,
                    100
                ),
                new Product(
                    "ASUS ROG Strix G17",
                    149999.00,
                    "High-performance gaming laptop with AMD Ryzen 9, RTX 3080 GPU, and 300Hz refresh rate display.",
                    4.8,
                    "Laptop",
                    "ASUS Store",
                    30,
                    75
                ),
                new Product(
                    "Fitbit Charge 5",
                    11999.00,
                    "Fitness tracker with built-in GPS, stress management tools, and daily readiness score.",
                    4.5,
                    "Fitness Tracker",
                    "Fitbit Store",
                    150,
                    240
                ),
                new Product(
                    "Sony PlayStation 5",
                    49999.00,
                    "Next-generation gaming console with ultra-fast SSD, ray tracing support, and DualSense controller.",
                    4.9,
                    "Gaming Console",
                    "Sony Store",
                    50,
                    200
                ),
                new Product(
                    "Bose SoundLink Revolve+ II",
                    19999.00,
                    "Portable Bluetooth speaker with 360-degree sound, water resistance, and up to 17 hours of battery life.",
                    4.6,
                    "Speaker",
                    "Bose Store",
                    120,
                    180
                ),
                new Product(
                    "Canon EOS 1500D",
                    34999.00,
                    "DSLR camera with 24.1MP sensor, Wi-Fi connectivity, and full HD video recording.",
                    4.4,
                    "Camera",
                    "Canon Store",
                    100,
                    90
                ),
                new Product(
                    "Mi Smart Band 7",
                    3999.00,
                    "Affordable fitness tracker with AMOLED display, SpO2 tracking, and 120+ sports modes.",
                    4.2,
                    "Fitness Tracker",
                    "Xiaomi Store",
                    500,
                    300
                )
            );

            productRepository.saveAll(products);
            System.out.println("Demo data seeded");
        }
    }
}
