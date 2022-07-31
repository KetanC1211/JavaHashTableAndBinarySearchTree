package com.brideglabz;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class FindFrequency {
// Java Program to find the occurrence
// of words in a String using HashMap.

	public static void main(String[] args)	{

		// Declaring the String
		String str = "To be or not to be";
		String givenString = str.toLowerCase();
		// Declaring a HashMap of <String, Integer>
		Map<String, Integer> hashMap = new HashMap<>();

		// Splitting the words of string
		// and storing them in the array.
		String[] words = givenString.split(" ");

		for (String word : words) {

			// Asking whether the HashMap contains the
			// key or not. Will return null if not.
			Integer integer = hashMap.get(word);

			if (integer == null)
				// Storing the word as key and its
				// occurrence as value in the HashMap.
				hashMap.put(word, 1);

			else {
				// Incrementing the value if the word
				// is already present in the HashMap.
				hashMap.put(word, integer + 1);
			}
		}
		System.out.println(hashMap);
	}


}
