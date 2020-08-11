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
	@Test
	public void test4() {
		int[] a1= {1,4,8,9,111,121,300,484};
		int[] a= {4,9,121,484};
		assertArrayEquals(a,Questions.SuperPalindrome(a1));
	}
	@Test
	public void test5() {
		assertEquals(true, Questions.trueorfalse(13));
	}
		@Test
	public void test6() {
		assertEquals(4, Questions.findgcd(12, 16));
	}
	@Test
	public void test7() {
		String a1 = "Harry Potter was a highly unusual boy in many ways. For one thing, he hated the summer holidays more than any other time of year. For another, he really wanted to do his homework, but was forced to do it in secret, in the dead of the night. And he also happened to be a wizard."
		int[] a = {382, 7}
		assertEquals(a, Questions.averagestring(a1));
	}
	@Test
	public void test8() {
		String a1 = "HOW DO YOU DO?"
		String a = "DO DO HOW YOU"
		assertEquals(a, Questions.potential(a1));
	}

}
