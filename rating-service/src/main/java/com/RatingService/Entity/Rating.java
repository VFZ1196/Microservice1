package com.RatingService.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rating1")
public class Rating {
	
	@Id
	@GeneratedValue
	private int ratingId;
	private String rating;
	
	public Rating() {
		
	}

	public Rating(String rating) {
		super();
		this.rating = rating;
	}

	public int getRatingId() {
		return ratingId;
	}

	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

}
