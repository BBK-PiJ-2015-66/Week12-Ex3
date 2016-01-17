import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Person2Test {


	/**
	 * Test with empty string assigned as full name
	 */
	@Test
	public void testFullName1() {
		Person2 person2 = new Person2();
		String input = "";
		String output = person2.getInitials(input);
		String expected = "";
		assertEquals(output, expected);
	}

	/**
	 * Test with NULL assigned as full name
	 */
	@Test
	public void testNULLName2() {
		Person2 person2 = new Person2();
		String input = null;
		String output = person2.getInitials(input);
		String expected = "";
		assertEquals(output, expected);
	}


	/**
	 * Test with one word assinged as full name
	 */
	@Test
	public void testFullName3() {
		Person2 person2 = new Person2();
		String input = "DereckRobertYssirt";
		String output = person2.getInitials(input);
		String expected = "D";
		assertEquals(output, expected);
	}

	/**
	 * Test with lower cases assigned as initials
	 */
	@Test
	public void testFullName4() {
		Person2 person2 = new Person2();
		String input = "dereck robert yssirt";
		String output = person2.getInitials(input);
		String expected = "DRY";
		assertEquals(output, expected);
	}

	/**
	 * Test with multiple blank spaces in between
	 */
	@Test
	public void testFullName5() {
		Person2 person2 = new Person2();
		String input = "Dereck          Robert          Yssirt";
		String output = person2.getInitials(input);
		String expected = "DRY";
		assertEquals(output, expected);
	}

	/**
	 * Test with more than three names as fullname
	 */
	@Test
	public void testFullName6() {
		Person2 person2 = new Person2();
		String input = "Dereck Robert Yssirt Thomas Dave";
		String output = person2.getInitials(input);
		String expected = "DRYTD";
		assertEquals(output, expected);
	}
	/**
	 * Test for first, middle, last names with 1 space in between 
	 * and the initials in Capital 
	 */
	@Test
	public void testFullName7() {
		Person2 person2 = new Person2();
		String input = "Dereck Robert Yssirt";
		String output = person2.getInitials(input);
		String expected = "DRY";
		assertEquals(output, expected);
	}

}