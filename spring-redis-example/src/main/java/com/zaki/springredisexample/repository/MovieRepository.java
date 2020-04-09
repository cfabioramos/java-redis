package com.zaki.springredisexample.repository;

import com.zaki.springredisexample.model.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie, String> {

    List<Movie> findByTitle(String title);

}
