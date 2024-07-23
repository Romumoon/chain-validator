package com.personetics.test;

public class StringNode extends Node {
	private final String value;

	public StringNode(String value) {
		this.value = value;
	}

	@Override
	public boolean isSingle() {
		return value.length() == 1;
	}

	@Override
	public String getValue() {
		return value;
	}

	@Override
	boolean isValid() {
		return !(value.isBlank() || value.isEmpty());
	}
}
