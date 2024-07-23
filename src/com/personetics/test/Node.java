package com.personetics.test;

import java.util.HashSet;
import java.util.Set;

public abstract class Node {
	abstract boolean isSingle();

	abstract Object getValue();

	abstract boolean isValid();

	protected Set<String> getDependencies() {
		String value = getValue().toString();
		Set<String> dependencies = new HashSet<>();
		for (char c : value.toCharArray()) {
			dependencies.add(String.valueOf(c));
		}
		return dependencies;
	}

	public static Node createNode(Object value) {
		if (value instanceof Integer) {
			return new NumberNode((Integer) value);
		} else if (value instanceof String) {
			return new StringNode((String) value);
		} else {
			throw new IllegalArgumentException("Invalid value type for Node creation");
		}
	}
}
