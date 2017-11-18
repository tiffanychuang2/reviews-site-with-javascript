package com.reviewssitefullstack;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewsSiteController {

	@Resource
	private MovieRatingRepository ratingRepo;

	@Resource
	private MovieReviewRepository reviewRepo;

	@Resource
	private GenreRepository genreRepo;

	@RequestMapping("/")
	public String getAllReviewsIndex(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	}

	@RequestMapping("/reviews")
	public String getAllReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	}

	@RequestMapping("/review")
	public String getOneReview(@RequestParam(value = "id") Long id, Model model) {
		model.addAttribute("review", reviewRepo.findOne(id));
		return "review";
	}

	@RequestMapping("/genres")
	public String getAllGenres(Model model) {
		model.addAttribute("genres", genreRepo.findAll());
		return "genres";
	}

	@RequestMapping("/genre")
	public String getOneGenre(@RequestParam(value = "id") Long id, Model model) {
		model.addAttribute("genre", genreRepo.findOne(id));
		return "genre";
	}

	@RequestMapping("/ratings")
	public String getAllRatings(Model model) {
		model.addAttribute("ratings", ratingRepo.findAll());
		return "ratings";
	}

	@RequestMapping("/rating")
	public String getOneRating(@RequestParam(value = "id") Long id, Model model) {
		model.addAttribute("rating", ratingRepo.findOne(id));
		return "rating";
	}

	@RequestMapping("/add-genre")
	public String addGenre(@RequestParam(value = "id") Long id, String genre, String genreImage) {
		Genre newGenre;
		if (!genreImage.equals("")) {
			newGenre = new Genre(genre, genreImage);
		} else {
			newGenre = new Genre(genre);
		}
		genreRepo.save(newGenre);
		MovieReview review = reviewRepo.findOne(id);
		review.addGenre(newGenre);
		reviewRepo.save(review);
		return "redirect:/review?id=" + id;
	}

	// @RequestMapping("/remove-genre")
	// public String removeGenre(@RequestParam(value = "genreId") Long genreId,
	// @RequestParam(value = "reviewId") Long reviewId) {
	// Genre removedGenre = genreRepo.findOne(genreId);
	// MovieReview review = reviewRepo.findOne(reviewId);
	// review.removeGenre(removedGenre);
	// return "redirect:/review?id=" + reviewId;
	// }

	@RequestMapping("/remove-genre")
	
}
