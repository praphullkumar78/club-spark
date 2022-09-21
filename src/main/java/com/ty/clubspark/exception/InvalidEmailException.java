package com.ty.clubspark.exception;

public class InvalidEmailException extends RuntimeException {

	private String message = "Given email is invalid";

	public InvalidEmailException(String message) {
		this.message = message;
	}

	public InvalidEmailException() {
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}

}
