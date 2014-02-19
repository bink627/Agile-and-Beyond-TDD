package tdd.katas.day1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";
	private static final String FIZZBUZZ2 = FIZZ+BUZZ;

	private FizzBuzz fizzBuzz;
	@Before
	public void setUp() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void multiplesOfThreeReturnFizz() {
		assertEquals(FIZZ, fizzBuzz.print(3));
		assertEquals(FIZZ, fizzBuzz.print(6));
		assertEquals(FIZZ, fizzBuzz.print(9));
	}

	@Test
	public void multiplesOfFiveReturnBuzz() {
		assertEquals(BUZZ, fizzBuzz.print(5));
		assertEquals(BUZZ, fizzBuzz.print(10));
		assertEquals(BUZZ, fizzBuzz.print(20));
	}

	@Test
	public void nonMultiplesOfThreeOrFiveReturnThemselves() {
		assertEquals("1", fizzBuzz.print(1));
		assertEquals("2", fizzBuzz.print(2));
		assertEquals("4", fizzBuzz.print(4));
		assertEquals("7", fizzBuzz.print(7));
	}

	@Test
	public void multipleOfThreeAndFiveReturnFizzBuzz() {
		assertEquals(FIZZBUZZ2, fizzBuzz.print(15));
	}

	@Test
	public void testOneThrough100() throws Exception {
		String expectedResults = 
				"12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19BuzzFizz2223FizzBuzz26Fizz2829FizzBuzz3132Fizz34BuzzFizz3738Fizz"
				+ "Buzz41Fizz4344FizzBuzz4647Fizz49BuzzFizz5253FizzBuzz56Fizz5859FizzBuzz6162Fizz64BuzzFizz6768FizzBuzz71Fizz7374Fizz"
				+ "Buzz7677Fizz79BuzzFizz8283FizzBuzz86Fizz8889FizzBuzz9192Fizz94BuzzFizz9798FizzBuzz";
		String actualResults = "";
		for (int number = 1; number <= 100; number++) {
			actualResults += fizzBuzz.print(number);
		}
		
		assertEquals(expectedResults, actualResults);
	}

}
