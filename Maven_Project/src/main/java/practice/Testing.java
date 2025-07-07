package practice;

import java.util.HashMap;
import java.util.HashSet;

public class Testing {

	 public static void main(String[] args) {

	        String str = "automation";

	        HashMap<Character, Integer> countMap = new HashMap<>();

	        for (char c : str.toCharArray()) {

	            countMap.put(c, countMap.getOrDefault(c, 0) + 1);

	        }

	        System.out.println(countMap);

	    }

	}