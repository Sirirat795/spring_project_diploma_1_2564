package com.Sirirat.pizza_system14.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="productpizza")

public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	public int id;
	
	@Column(name="product_name")
	public String product_name;
	
	@Column(name="product_description")
	public String product_description;
	
	@Column(name="product_price")
	public double product_price;
	
	@Column(name="product_image")
	public String product_image;

	public Product() {}
	
	public Product(int id, String product_name, String product_description, double product_price, String product_image) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.product_description = product_description;
		this.product_price = product_price;
		this.product_image = product_image;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getproduct_name() {
		return product_name;
	}

	public void setproduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getproduct_description() {
		return product_description;
	}

	public void setproduct_description(String product_description) {
		this.product_description = product_description;
	}

	public double getproduct_price() {
		return product_price;
	}

	public void setproduct_price(double product_price) {
		this.product_price = product_price;
	}

	public String getproduct_image() {
		return product_image;
	}

	public void setproduct_image(String product_image) {
		this.product_image = product_image;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", rank_name=" + product_name + ", rank_description=" + product_description
				+ ", rank_price=" + product_price + ", rank_image=" + product_image + "]";
	}

}
