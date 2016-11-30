package com.lyb.java.java_learn;

import java.util.function.Function;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Function<String, Object> toInteger = Integer::valueOf;
		toInteger.apply("123");
		System.out.println(toInteger);
	}
}
