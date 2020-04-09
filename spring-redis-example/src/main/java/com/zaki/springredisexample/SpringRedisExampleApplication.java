package com.zaki.springredisexample;

import com.zaki.springredisexample.model.Movie;
import com.zaki.springredisexample.model.User;
import com.zaki.springredisexample.repository.MovieRepository;
import com.zaki.springredisexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import reactor.core.publisher.Flux;

import java.util.Map;

@SpringBootApplication
public class SpringRedisExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRedisExampleApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private MovieRepository movieRepository;

	@EventListener(ApplicationReadyEvent.class)
	public void run() {
//		User userOne = new User(1, "Fábio Ramos", 10000D);
		User userTwo = new User(2, "Jão da Silva", 5000D);
//		User userThree = new User(3, "Roberto Mauro", 2400D);

//		this.userRepository.save(userOne);
		this.userRepository.save(userTwo);
//		this.userRepository.save(userThree);
//
//		this.movieRepository.save(new Movie("1", "Titanic", userTwo));

		System.out.println(this.userRepository.findAll());
//		System.out.println(this.movieRepository.findByTitle("Titanic"));
	}

}