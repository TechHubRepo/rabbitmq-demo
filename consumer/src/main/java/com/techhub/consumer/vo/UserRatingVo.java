package com.techhub.consumer.vo;

import java.io.Serializable;

public class UserRatingVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer ratingId;

	private Integer bookId;

	private String userId;

	private Integer rating;

	private String review;

	public UserRatingVo() {
		super();
	}

	public UserRatingVo(Integer ratingId, Integer bookId, String userId, Integer rating, String review) {
		super();
		this.ratingId = ratingId;
		this.bookId = bookId;
		this.userId = userId;
		this.rating = rating;
		this.review = review;
	}

	public Integer getRatingId() {
		return ratingId;
	}

	public void setRatingId(Integer ratingId) {
		this.ratingId = ratingId;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "UserRating [ratingId=" + ratingId + ", bookId=" + bookId + ", userId=" + userId + ", rating=" + rating + ", review=" + review + "]";
	}
}
