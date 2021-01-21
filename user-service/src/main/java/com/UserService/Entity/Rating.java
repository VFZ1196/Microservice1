package com.UserService.Entity;

public class Rating {
	
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
