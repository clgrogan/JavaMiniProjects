package com.core.exceptions;

public class UncheckedExceptionalActivity extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UncheckedExceptionalActivity(InterruptedException e) {
		super("An exceptional unchecked activity has occured!\n ....what happened?", e);
	}

}
