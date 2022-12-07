package org.techsavvy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techsavvy.client.ReviewFeignClient;
import org.techsavvy.entity.Movie;
import org.techsavvy.model.Review;
import org.techsavvy.repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private ReviewFeignClient reviewFeignClient;

    public org.techsavvy.model.Movie getMovieById(int id) throws Exception{
        Movie movie = movieRepository.findById(id).orElseThrow(Exception::new);
        List<Review> reviews = reviewFeignClient.getReviewByMovieId(movie.getId());
        return org.techsavvy.model.Movie.builder()
                .id(movie.getId())
                .name(movie.getName())
                .rating(movie.getRating())
                .genre(movie.getGenre())
                .reviews(reviews).build();
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie update(Movie movie) {
        return movieRepository.save(movie);
    }

    public void delete(int id) {
        movieRepository.deleteById(id);
    }
}
