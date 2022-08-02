package com.example.springcache.entity;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private BigDecimal price;

	public Item() {
	}

	public Item(final String name, final BigDecimal price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
}
