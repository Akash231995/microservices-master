package org.techsavvy.review.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.techsavvy.review.entity.Review;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review,Integer> {

    public List<Review> findAllByMovieId(int id);
}

