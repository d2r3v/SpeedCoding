package fibbase;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionsTest {

	@Test
	public void test1() {
		assertEquals(1, Questions.Divide(1, 1));
	}

	@Test
	public void test2() {
		assertEquals(true, Questions.almostPalindrome("abcbea"));
	}

	@Test
	public void test3() {
		assertEquals(200, Questions.MultiplyStrings("50","4"));
	}
}
