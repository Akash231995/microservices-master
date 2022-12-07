package org.techsavvy.review.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techsavvy.review.entity.Review;
import org.techsavvy.review.repository.ReviewRepository;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> getReviewsByMovieId(int id) {
        return reviewRepository.findAllByMovieId(id);
    }

    public Review save(Review review) {
        return reviewRepository.save(review);
    }
}
