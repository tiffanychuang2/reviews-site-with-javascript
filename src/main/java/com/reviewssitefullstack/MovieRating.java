package com.reviewssitefullstack;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class MovieRating {

	@Id
	@GeneratedValue
	private Long id;

	private String rating;

	@OneToMany(mappedBy = "rating")
	private Set<MovieReview> ratingForMovie;

	// constructors
	protected MovieRating() {
	}

	public MovieRating(String rating) {
		this.rating = rating;
	}

	// getters
	public Long getId() {
		return id;
	}

	public String getRating() {
		return rating;
	}

	public Set<MovieReview> getRatingForMovie() {
		return ratingForMovie;
	}

	// setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public void setRatingForMovie(Set<MovieReview> ratingForMovie) {
		this.ratingForMovie = ratingForMovie;
	}

	@Override
	public String toString() {
		return rating;
	}

}
