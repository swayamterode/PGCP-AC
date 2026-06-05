package com.app.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "book_store")
public class BookStore {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false)
	private String title;

	@Column(nullable = false)
	private String author;

	@Column(nullable = false)
	private double price;

	@Column(nullable = false)
	private int stock;

	public BookStore(String title, String author, double price, int stock) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}
}