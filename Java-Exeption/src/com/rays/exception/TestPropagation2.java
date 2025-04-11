package com.rays.exception;

public class TestPropagation2 {
	public static void main(String[] args) throws ChekedException {

		dad();
	}

	public static void dad() throws ChekedException {
		mom();
	}

	public static void mom() {
		son();
	}

	public static void son() {
		throw new UncheakedException("make a mistake");
	}
}
