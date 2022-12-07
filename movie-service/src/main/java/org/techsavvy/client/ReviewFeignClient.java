package org.techsavvy.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.techsavvy.model.Review;

import java.util.List;

@FeignClient("review-service")
public interface ReviewFeignClient {

    @GetMapping("{id}")
    public List<Review> getReviewByMovieId(@PathVariable int id);
}
