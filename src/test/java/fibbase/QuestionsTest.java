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

}
