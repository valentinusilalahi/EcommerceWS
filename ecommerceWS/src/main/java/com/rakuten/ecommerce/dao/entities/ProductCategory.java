package com.rakuten.ecommerce.dao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@IdClass(ProductCategoryId.class)
@Table(name="ProductCategory")
public class ProductCategory {

	@Id
	@Column(name = Product.PRODUCT_ID_COL, unique = true, nullable = false)
	private long productId;
	
	@Id
	@Column(name = Category.CATEGORY_ID_COL, unique = true, nullable = false)
	private long categoryId;


	public ProductCategory() {
		// For JPA
	}

	
	public ProductCategory(long productId, long categoryId) {
		this.productId = productId;
		this.categoryId = categoryId;
	}

	public long getProductId() {
		return productId;
	}

	public long getCategoryId() {
		return categoryId;
	}

}