/**
 * A basic FizzBuzz implementation that will allow for unit testing.
 *
 * @author bmcculley
 * @url http://mkdir.info
 */

public class FizzBuzz {

	/**
	 * The method getResult accepts an integer value and will return
	 * "FizzBuzz", "Fizz", "Buzz" or a string of the integer. This all 
	 * depends on the integers divisibility of 3 and 5 or both.
	 *
	 * @param val expects a valid integer value to be passed.
	 * 
	 * @return String will pass back a string value, "FizzBuzz" if divisible
	 * by 3 and 5, "Fizz" if only divisible by 3, "Buzz" if only divisible by
	 * 5 or a string of the integer.
	 *
	 */
	public static String getResult(int val) {
		String returnVal = "";

		if (val % 3 == 0 && val % 5 == 0) {
			returnVal += "FizzBuzz";
		}
		else if (val % 3 == 0) {
			returnVal += "Fizz";
		}
		else if (val % 5 == 0) {
			returnVal += "Buzz";
		}
		else {
			returnVal += String.valueOf(val);
		}
		return returnVal;
	}

	/**
     * The main method of our class, so we can run the whole shebang.
     *
     * @param args this is unused in our implementation.
     *
     */
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println(getResult(i));
		}
	}
}