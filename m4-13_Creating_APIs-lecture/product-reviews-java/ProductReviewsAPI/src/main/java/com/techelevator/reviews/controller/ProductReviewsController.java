package com.techelevator.reviews.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.reviews.dao.IProductReviewDao;
import com.techelevator.reviews.exception.ProductReviewNotFoundException;
import com.techelevator.reviews.model.ProductReview;

@RestController
@CrossOrigin
@RequestMapping("/api/reviews")
public class ProductReviewsController {
	
	@Autowired
	private IProductReviewDao productReviewDao;
	
	@GetMapping
	public List<ProductReview> list() {
		return productReviewDao.list();
	}
	
	// Defining the path after /api/reviews
	@GetMapping("/{id}")
	public ProductReview read(@PathVariable int id) {
		ProductReview productReview = productReviewDao.read(id);
		if (productReview != null) {
			return productReview;
		} else {
			throw new ProductReviewNotFoundException(id, "Product Review Not Found");
		}
	}
	
	// Receive Data - Do Update
	// Shortcut for get Post
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ProductReview create(@RequestBody ProductReview productReview) {
		return productReviewDao.create(productReview);
	}
	
	// 1. we create mapping
	@PutMapping("/{id}")
	public ProductReview update(@RequestBody ProductReview productReview, @PathVariable int id) {
		// 2. Find out if the product exists
		ProductReview requestedReview = productReviewDao.read(id);
		if (requestedReview != null) {
			return productReviewDao.update(productReview);
		} else {
			throw new ProductReviewNotFoundException(id, "Product Review Not Found");
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		ProductReview requestedReview = productReviewDao.read(id);
		if (requestedReview != null) {
			productReviewDao.delete(id);
		} else {
			throw new ProductReviewNotFoundException(id, "Product Review Not Found");
		}
	}
	
	
}