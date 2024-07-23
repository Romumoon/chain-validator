package com.personetics.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ChainValidator {
	public boolean validate(List<Node> nodes) {
		Set<String> singleValues = new HashSet<>();
		Set<String> multiValues = new HashSet<>();

		Class<?> expectedType = nodes.get(0).getClass();

		for (Node node : nodes) {
			if (!node.getClass().equals(expectedType) || !node.isValid()) {
				return false;
			}
			String value = node.getValue().toString();
			if (node.isSingle()) {
				singleValues.add(value);
			} else {
				multiValues.add(value);
			}
		}

		for (Node node : nodes) {
			Set<String> dependencies = node.getDependencies();
			if (!singleValues.containsAll(dependencies)) {
				return false;
			}
		}

		return true;
	}
}
