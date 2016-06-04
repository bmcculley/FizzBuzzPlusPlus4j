/**
 * A basic FizzBuzz implementation that will allow for unit testing.
 *
 * @author bmcculley
 * @url http://mkdir.info
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {
	@Test
	public void testThree() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		assertEquals("Fizz", fizzbuzz.getResult(3));
	}

	@Test
	public void testFive() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		assertEquals("Buzz", fizzbuzz.getResult(5));
	}

	@Test
	public void testFifteen() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		assertEquals("FizzBuzz", fizzbuzz.getResult(15));
	}

	@Test
	public void testEight() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		assertEquals("8", fizzbuzz.getResult(8));
	}
}