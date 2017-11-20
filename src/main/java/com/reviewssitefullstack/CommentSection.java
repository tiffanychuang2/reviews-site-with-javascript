package com.reviewssitefullstack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class CommentSection {

	@Id
	@GeneratedValue

	private Long id;

	@Lob
	private String commentText;

	@ManyToOne
	private MovieReview review;

	public CommentSection() {
	}

	public CommentSection(MovieReview review, String commentText) {
		this.review = review;
		this.commentText = commentText;
	}

	public Long getId() {
		return id;
	}

	public String getCommentText() {
		return commentText;
	}

	public MovieReview getReview() {
		return review;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	public void setReview(MovieReview review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return commentText;
	}

}
