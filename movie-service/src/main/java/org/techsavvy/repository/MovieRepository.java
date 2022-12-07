package org.techsavvy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.techsavvy.entity.Movie;


public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
