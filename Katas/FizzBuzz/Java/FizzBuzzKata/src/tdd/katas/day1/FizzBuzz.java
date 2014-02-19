package tdd.katas.day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FizzBuzz {

	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";
	
	private static Map<Integer, String> multiples = new HashMap<Integer, String>();
	
	static {
		multiples.put(3, FIZZ);
		multiples.put(5, BUZZ);
	}
	
	public String print(int number) {
		return isValidMultiple(number) ? printFizzBuzz(number) : printTheNumber(number);
	}

	private boolean isValidMultiple(int number) {
		for (Entry<Integer, String> multiple : multiples.entrySet()) {
			if(number % multiple.getKey() == 0) {
				return true;
			}
		}
		return false;
	}

	private String printTheNumber(int number) {
		return String.valueOf(number);
	}

	private String printFizzBuzz(int number) {
		StringBuilder stringToPrint = new StringBuilder();
		for (Entry<Integer, String> multiple : multiples.entrySet()) {
			if(number % multiple.getKey() == 0) {
				stringToPrint.append(multiple.getValue());
			}
		}
		return stringToPrint.toString();
	}
}
