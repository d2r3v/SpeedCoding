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
		String a1 = "Harry Potter was a highly unusual boy in many ways. For one thing, he hated the summer holidays more than any other time of year. For another, he really wanted to do his homework, but was forced to do it in secret, in the dead of the night. And he also happened to be a wizard.";
		int[] a = {382, 7};
		assertEquals(a, Questions.averagestring(a1));
	}
	@Test
	public void test8() {
		String a1 = "HOW DO YOU DO?";
		String a = "DO DO HOW YOU";
		assertEquals(a, Questions.potential(a1));
	}
	@Test
	public void test9() {
		int[] a = {0, 3, 8, 15, 24, 35};
		assertEquals(a, Questions.series(6));
	}
	@Test
	public void test10() {

		assertEquals(".java", Questions.filename("helloworld.java"));
	}
	@Test
	public void test11() {
		assertEquals(true, Questions.disarium(89));
	}
	@Test
	public void test12() {
		assertEquals(true, Questions.special(40585));
	}
	@Test
	public void test13() {
		int[] a = {51,42,23,74};
		int[] b = {51,42,23,74};
		assertEquals(true, Questions.equalarr(a,b));
	}
	@Test
	public void test14() {
		int[] a = {2,2,2,3};
		assertEquals(a, Questions.prime(24));
	}
	@Test
	public void test15() {
		assertEquals(true, Questions.automorphic(76));
	}
	@Test
	public void test16() {

		assertEquals(true, Questions.alphabetical("abdef"));
	}
	@Test
	public void test17() {
		char[] a = {'c', 'o', 'd', 'i', 'n', 'g'};
		assertEquals("[c, o, d, i, n, g]", Questions.arrtostr(a));
	}
	@Test
	public void test18() {
		int[] a = {4,5,8,11,14,25,18};
		assertEquals(true, Questions.specialarr(a));
	}
	@Test
	public void test19() {
		assertEquals(127, Questions.series1(6));
	}
	@Test
	public void test20() {
		assertEquals(true, Questions.anagram("listen","silent"));
	}
	@Test
	public void test21() {

		assertEquals(560.0, Questions.netbill(450.0));
	}
	@Test
	public void test22() {

		assertEquals(200, Questions.parcel(320));
	}
	@Test
	public void test23()
	{
		assertEquals("oa", Questions.vowels("programming", 2));
	}
	@Test
	public void test24()
	{
		assertEquals('h', Questions.maxfreq("hackathon"));
	}
	@Test
	public void test25() {

		assertEquals(8, Questions.lastindex("0010010010"));
	}
	@Test
	public void test26() {
		assertEquals("---", Questions.dashes(3));
	}
	@Test
	public void test27() {
		String[] a = {"ABC", "ACB", "BAC", "BCA","CBA", "CAB"};
		assertEquals(a, Questions.permutations("ABC"));
	}
	@Test
	public void test28() {

		assertEquals('l', Questions.repeat("legolas"));
	}
	@Test
	public void test29() {

		assertEquals(3, Questions.singledigit(147));
	}
	@Test
	public void test30()
	{
		assertEquals(true, Questions.happy(203));
	}
	@Test
	public void test31()
	{
		assertEquals(3702, Questions.series2(4));
	}
	@Test
	public void test32() {
		int[] a  = {1,2,4,6,3,7,8};
		assertEquals(5, Questions.missingnum(a));
	}
	@Test
	public void test33()
	{
		assertEquals(true, Questions.apocalyptic(109));
	}
	@Test
	public void test34()
	{
		int[] a  = {-1,2,-4,6,-3,7,-8};
		assertEquals(5, Questions.alternate(a));
	}
	@Test
	public void test35() {
		int[] a  = {1,3,5,9,11,80,15,33,37,41};
		assertEquals(true, Questions.sorting(a));
	}
	@Test
	public void test36() {
		assertEquals("50lpp48aca", Questions.encrypt("apple"));
	}
	@Test
	public void test37() {
		int[][] m  = {{2,0},{0,4}};
		assertEquals(true, Questions.diagonalmatrix(m));
	}
	@Test
	public void test38() {
		assertEquals(true, Questions.armstrong(153));
	}
	@Test
	public void test39() {
		assertEquals(5, Questions.kempner(5));
	}
	@Test
	public void test40() {
		int[] a = {1,2,4,6,5,8,10,3};
		assertEquals(true, Questions.positive(a));
	}
	@Test
	public void test41() {
		assertEquals(true, Questions.ascending(114455777));
	}
	@Test
	public void test42() {
		assertEquals(true, Questions.descending(998887755));
	}
	@Test
	public void test43() {
		String[] a = {"Delhi", "Bangalore", "Agra", "Mumbai"};
		String[] b = {"Agra", "Bangalore", "Delhi", "Mumbai"};
		assertEquals(b, Questions.alphasort(a));
	}
	@Test
	public void test44() {
		assertEquals(4, Questions.doubleletter("She was feeding the little rabbit with an apple"));
	}
	@Test
	public void test45() {
		assertEquals("avehay", Questions.piglatin("have"));
	}
	@Test
	public void test46() {
		assertEquals(true, Questions.semiprime(49));
	}
	@Test
	public void test47() {
		assertEquals(true, Questions.balanced(5));
	}
	@Test
	public void test48() {
		int[][] a = {{1,2,3,4}, {4,3,2,1}, {7,8,9,6}, {6,5,4,3}};
		assertEquals(36, Questions.diagonals(a));
	}
	@Test
	public void test49() {
		assertEquals("gnimmargorP ssalC", Questions.reverse("Programming Class"));
	}
	@Test
	public void test50() {
		int[] a = {1, 3, 6, 10, 15, 21, 28, 36, 45, 55};
		assertEquals(a, Questions.triangular(10));
	}
}
