package com.reviewssitefullstack;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Genre {

	@Id
	@GeneratedValue
	private Long id;

	private String genreImage;
	private String genre;

	@ManyToMany(mappedBy = "movieGenre")
	private Set<MovieReview> genresForMovies;

	// constructors
	protected Genre() {
	}

	public Genre(String genreImage, String genre) {
		this.genreImage = genreImage;
		this.genre = genre;
	}

	// getters
	public Long getId() {
		return id;
	}

	public String getGenreImage() {
		return genreImage;
	}

	public String getGenre() {
		return genre;
	}

	// public MovieReview getReview() {
	// return review;
	// }

	public Set<MovieReview> getGenresForMovies() {
		return genresForMovies;
	}

	// setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setGenreImage(String genreImage) {
		this.genreImage = genreImage;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	// public void setReview(MovieReview review) {
	// this.review = review;
	// }

	public void setGenresForMovies(Set<MovieReview> genresForMovies) {
		this.genresForMovies = genresForMovies;
	}

	@Override
	public String toString() {
		return genre;
	}

}
