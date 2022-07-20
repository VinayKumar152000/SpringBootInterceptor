package com.example.demo.controllers;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Product;

@RestController
@RequestMapping("/products")
public class ProductServiceController {
	
	static List<Product> products =new ArrayList<>();

	static {
		products.add(new Product("33","Almonds"));
		products.add(new Product("48","Almonds"));
	}
	
	
	@GetMapping
	public List<Product> getAllProducts(){
		return products;
	}
}
