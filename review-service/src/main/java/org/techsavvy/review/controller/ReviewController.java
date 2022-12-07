package org.techsavvy.review.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.techsavvy.review.entity.Review;
import org.techsavvy.review.service.ReviewService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("review")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping("{id}")
    public List<Review> getReviewByMovieId(@PathVariable int id) {
        log.info("Review Service id - " + id);
        return reviewService.getReviewsByMovieId(id);
    }

    @PostMapping
    public Review save(@RequestBody Review review) {
        return reviewService.save(review);
    }
}
