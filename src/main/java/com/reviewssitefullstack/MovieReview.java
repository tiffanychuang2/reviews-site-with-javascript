package com.reviewssitefullstack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class MovieReview {

	@Id
	@GeneratedValue
	private Long id;

	private String imageUrl;
	private String movieTitle;
	private String releaseYear;

	@Lob
	private String myMovieReview;

	@ManyToOne
	private MovieRating rating;

	@ManyToMany
	private Set<Genre> movieGenre;

	// constructors
	protected MovieReview() {
	}

	public MovieReview(String imageUrl, String movieTitle, String releaseYear, String myMovieReview, MovieRating rating,
			Genre... movieGenre) {
		this.imageUrl = imageUrl;
		this.movieTitle = movieTitle;
		this.releaseYear = releaseYear;
		this.myMovieReview = myMovieReview;
		this.rating = rating;
		this.movieGenre = new HashSet(Arrays.asList(movieGenre));
	}

	// getters
	public String getImageUrl() {
		return imageUrl;
	}

	public Long getId() {
		return id;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public String getMyMovieReview() {
		return myMovieReview;
	}

	public MovieRating getRating() {
		return rating;
	}

	public Set<Genre> getMovieGenre() {
		return movieGenre;
	}

	// setters
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public void setMyMovieReview(String myMovieReview) {
		this.myMovieReview = myMovieReview;
	}

	public void setRating(MovieRating rating) {
		this.rating = rating;
	}

	public void setMovieGenre(Set<Genre> movieGenre) {
		this.movieGenre = movieGenre;
	}

	@Override
	public String toString() {
		return imageUrl + " " + movieTitle + " " + releaseYear + " " + myMovieReview + " " + rating + " " + movieGenre;
	}

}
