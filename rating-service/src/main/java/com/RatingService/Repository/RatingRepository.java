package com.RatingService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RatingService.Entity.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer>{

}
