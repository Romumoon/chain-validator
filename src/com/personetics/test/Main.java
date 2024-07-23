package com.personetics.test;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
        ChainValidator validator = new ChainValidator();

        List<Node> validNumbers = Arrays.asList(
                Node.createNode(36),
                Node.createNode(6),
                Node.createNode(24),
                Node.createNode(4),
                Node.createNode(47),
                Node.createNode(7),
                Node.createNode(2),
                Node.createNode(3),
                Node.createNode(27)
        );
        
        List<Node> invalidNumbers = Arrays.asList(
        	    Node.createNode(36),
        	    Node.createNode(6),
        	    Node.createNode(24),
        	    Node.createNode(4),
        	    Node.createNode(47),
        	    Node.createNode(7),
        	    Node.createNode(2),
        	    Node.createNode(3),
        	    Node.createNode(27),
        	    Node.createNode(123)
        	);

        List<Node> validWords = Arrays.asList(
        	    Node.createNode("p"),
        	    Node.createNode("aba"),
        	    Node.createNode("a"),
        	    Node.createNode("b"),
        	    Node.createNode("perso"),
        	    Node.createNode("o"),
        	    Node.createNode("r"),
        	    Node.createNode("e"),
        	    Node.createNode("s")
        	);
        
        List<Node> invalidWords = Arrays.asList(
        	    Node.createNode("p"),
        	    Node.createNode("aba"),
        	    Node.createNode("a"),
        	    Node.createNode("b"),
        	    Node.createNode("perso"),
        	    Node.createNode("o"),
        	    Node.createNode("r"),
        	    Node.createNode("e"),
        	    Node.createNode("s"),
        	    Node.createNode("abcde")
        	);

        List<Node> differentTypes = Arrays.asList(
        	    Node.createNode(36),
        	    Node.createNode("ab"),
        	    Node.createNode(24)
        	);

        System.out.println("Valid Numbers: " + validator.validate(validNumbers));
        System.out.println("Invalid Numbers: " + validator.validate(invalidNumbers));
        System.out.println("Valid Words: " + validator.validate(validWords));
        System.out.println("Invalid Words: " + validator.validate(invalidWords));
        System.out.println("Different Types: " + validator.validate(differentTypes));
	}

}
