package com.RatingService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RatingService.Entity.Rating;
import com.RatingService.Repository.RatingRepository;

@Service
public class RatingService {
	
	@Autowired
	private RatingRepository ratingRepo;

	public Rating saveRating(Rating rating) {
		return ratingRepo.save(rating);
	}

	public Rating getRatingById(Integer ratingId) {
		return ratingRepo.findById(ratingId).get();
	}
	

}
