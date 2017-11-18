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
	private Set<Genre> movieGenres;

	// constructors
	protected MovieReview() {
	}

	public MovieReview(String imageUrl, String movieTitle, String releaseYear, String myMovieReview, MovieRating rating,
			Genre... movieGenres) {
		this.imageUrl = imageUrl;
		this.movieTitle = movieTitle;
		this.releaseYear = releaseYear;
		this.myMovieReview = myMovieReview;
		this.rating = rating;
		this.movieGenres = new HashSet<Genre>(Arrays.asList(movieGenres));
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

	public Set<Genre> getMovieGenres() {
		return movieGenres;
	}

	public void addGenre(Genre genre) {
		movieGenres.add(genre);
	}

	public void removeGenre(Genre genre) {
		movieGenres.remove(genre);
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

	public void setMovieGenres(Set<Genre> movieGenres) {
		this.movieGenres = movieGenres;
	}

	@Override
	public String toString() {
		return imageUrl + " " + movieTitle + " " + releaseYear + " " + myMovieReview + " " + rating + " " + movieGenres;
	}

}
