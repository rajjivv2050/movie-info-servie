package io.rajivsingh.movieinfoservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieResource {

	@GetMapping("/{movieId}")
	public Movie getMovie(@PathVariable String movieId)
	{
		return new Movie("An Ugly Mind","AUM");
	}
}
