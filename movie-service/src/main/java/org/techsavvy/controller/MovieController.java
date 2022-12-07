package org.techsavvy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.techsavvy.entity.Movie;
import org.techsavvy.service.MovieService;

import java.util.List;

@RestController
@RequestMapping("movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("{id}")
    public org.techsavvy.model.Movie getMovieById(@PathVariable int id) throws Exception {
        return movieService.getMovieById(id);
    }

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @PostMapping
    public Movie save(@RequestBody Movie movie) {
        return movieService.save(movie);
    }

    @PutMapping
    public Movie update(@RequestBody Movie movie) {
        return movieService.update(movie);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        movieService.delete(id);
    }
}
