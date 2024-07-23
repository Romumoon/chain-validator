package com.personetics.test;

public class NumberNode extends Node {
	private final Integer value;

	public NumberNode(Integer value) {
		this.value = value;
	}

	@Override
	public boolean isSingle() {
		return value.toString().length() == 1;
	}

	@Override
	public Integer getValue() {
		return value;
	}

	@Override
	boolean isValid() {
		return !(value < 0 || value > 99);
	}

}
