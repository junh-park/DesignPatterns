package com.jun.structural.decorator;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import com.jun.reflection.Person;

class Product {
	int id;

	public Product(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

interface IProductRepository {
	Product getProduct(int id);
}

class DbProductRepository implements IProductRepository {
	public DbProductRepository() {
	}

	public Product getProduct(int id) {
		return new Product(id);
	}
}

interface ICache {
	public <T> T get(String key);

	public void set(String key, Object value, String string);
}

class ProductRepositoryCachingDecorator implements IProductRepository {
	private IProductRepository decorateRepository;
	private ICache cache;
	private int ExpirationInHours = 1;

	public ProductRepositoryCachingDecorator(IProductRepository decorateRepository, ICache cache) {
		this.decorateRepository = decorateRepository;
		this.cache = cache;
	}

	@Override
	public Product getProduct(int id) {
		String key = String.valueOf(getKey(id));
		Product product = cache.get(key);
		if (product == null) {
			product = decorateRepository.getProduct(id);
			cache.set(key, product, 			
					DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now())
					);
		}
		return product;
	}

	private int getKey(int id) {
		System.out.println("Product:" + id);
		return id;
	}

}

public class CachingExample {
	public static void main(String[] args) {
		System.out.println(new Date());
	}
}
