package com.RatingService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RatingService.Entity.Rating;
import com.RatingService.Service.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@Autowired
	private RatingService ratingSer;
	
	@PostMapping("/")
	public Rating saveRating(@RequestBody Rating rating) {
		return ratingSer.saveRating(rating);
	}
	
	@GetMapping("/{id}")
	public Rating getRatingById(@PathVariable("id") Integer ratingId) {
		return ratingSer.getRatingById(ratingId);
	}

}