package fibbase;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionsTest {

	@Test
	public void test1() {
		assertEquals(1, Questions.Divide(1, 1));
		assertEquals(10, Questions.Divide(50, 5));
	}

	@Test
	public void test2() {
		assertEquals(1, Questions.almostPalindrome("abcbea"));
		assertEquals(0, Questions.almostPalindrome("abcdaaa"));
	}

	@Test
	public void test3() {
		assertEquals(200, Questions.MultiplyStrings("50","4"));
		assertEquals(300, Questions.MultiplyStrings("150","2"));
	}
	@Test
	public void test4() {
		int[] a1= {1,2,8,3,11,121,300,22};
		int[] a= {2,3,11,22};
		assertArrayEquals(a,Questions.SuperPalindrome(a1));
		int[] b1= {101,4,8,9,111,121,300,22};
		int[] b= {101,111,121,22};
		assertArrayEquals(b,Questions.SuperPalindrome(b1));
	}
	@Test
	public void test5() {
		assertEquals(1, Questions.trueorfalse(13));
		assertEquals(0, Questions.trueorfalse(23));
	}
		@Test
	public void test6() {
		assertEquals(4, Questions.findgcd(12, 16));
		assertEquals(250, Questions.findgcd(250, 1000));
	}
	@Test
	public void test7() {
		String a1 = "Harry Potter was a highly unusual boy in many ways. For one thing, he hated the summer holidays more than any other time of year. For another, he really wanted to do his homework, but was forced to do it in secret, in the dead of the night. And he also happened to be a wizard.";
		int[] a = {382, 7};
		assertEquals(a, Questions.averagestring(a1));
		String b1 = "The best things in an artist’s work are so much a matter of intuition, that there is much to be said for the point of view that would altogether discourage intellectual inquiry into artistic phenomena on the part of the artist. Intuitions are shy things and apt to disappear if looked into too closely. And there is undoubtedly a danger that too much knowledge and training may supplant the natural intuitive feeling of a student, leaving only a cold knowledge of the means of expression in its place. For the artist, if he has the right stuff in him ...";
		int[] b = {448, 4};
		assertEquals(b, Questions.averagestring(b1));
	}
	@Test
	public void test8() {
		String a1 = "HOW DO YOU DO?";
		String a = "DO DO HOW YOU";
		assertEquals(a, Questions.potential(a1));
		String b1 = "THE SKY IS THE LIMIT.";
		String b = "IS THE THE SKY LIMIT";
		assertEquals(b, Questions.potential(b1));
	}
	@Test
	public void test9() {
		int[] a = {0, 3, 8, 15, 24, 35};
		assertEquals(a, Questions.series(6));
		int[] b = {0, 3, 8, 15, 24, 35,48,63,80};
		assertEquals(b, Questions.series(9));
	}
	@Test
	public void test10() {

		assertEquals(".java", Questions.filename("helloworld.java"));
		assertEquals("Not a file name", Questions.filename("helloworld"));
	}
	@Test
	public void test11() {
		assertEquals(1, Questions.disarium(89));
		assertEquals(0, Questions.disarium(311));
	}
	@Test
	public void test12() {
		assertEquals(1, Questions.special(40585));
		assertEquals(0, Questions.special(147));
	}
	@Test
	public void test13() {
		int[] a = {51,42,23,74};
		int[] b = {51,42,23,74};
		assertEquals(1, Questions.equalarr(a,b, 4, 4));
		int[] c = {51,42,23,74};
		int[] d = {5,2,23,4,45,98};
		assertEquals(0, Questions.equalarr(c,d, 4, 6));
	}
	@Test
	public void test14() {
		int[] a = {2,2,2,3};
		assertEquals(a, Questions.prime(24));
		int[] b = {2,2,5,13};
		assertEquals(b, Questions.prime(260));
	}
	@Test
	public void test15() {
		assertEquals(1, Questions.automorphic(76));
		assertEquals(0, Questions.automorphic(147));
	}
	@Test
	public void test16() {

		assertEquals(1, Questions.alphabetical("abdef"));
		assertEquals(0, Questions.alphabetical("WCBAFGD"));
	}
	@Test
	public void test17() {
		char[] a = {'c', 'o', 'd', 'i', 'n', 'g'};
		assertEquals("[c, o, d, i, n, g]", Questions.arrtostr(a, 6));
		char[] b = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i','n','g'};
		assertEquals("[p, r, o, g, r, a, m, m, i, n, g]", Questions.arrtostr(b, 11));
	}
	@Test
	public void test18() {
		int[] a = {2,3,4,5,8,3,10};
		assertEquals(1, Questions.specialarr(a,7 ));
		int[] b = {2,4,5,1,9};
		assertEquals(0, Questions.specialarr(b,5 ));
	}
	@Test
	public void test19() {
		assertEquals(127, Questions.series1(6));
		assertEquals(511, Questions.series1(8));
	}
	@Test
	public void test20() {
		assertEquals(1, Questions.anagram("school master","the classroom"));
		assertEquals(0, Questions.anagram("toss","shot"));
	}
	@Test
	public void test21() {

		assertEquals(560.0, Questions.netbill(450.0), 0.00001);
		assertEquals(460.0, Questions.netbill(350.0), 0.00001);
	}
	@Test
	public void test22() {

		assertEquals(200, Questions.parcel(320));
		assertEquals(280, Questions.parcel(560));
	}
	@Test
	public void test23()
	{
		assertEquals("oa", Questions.vowels("programming", 2));
		assertEquals("eai", Questions.vowels("learning", 3));
	}
	@Test
	public void test24()
	{
		assertEquals('h', Questions.maxfreq("hackathon"));
		assertEquals('c', Questions.maxfreq("cbbbbccc"));
	}
	@Test
	public void test25()
	{
		assertEquals(8, Questions.lastindex("0010010010"));
		assertEquals(9, Questions.lastindex("1001000001"));
	}
	@Test
	public void test26() {
		assertEquals("---", Questions.dashes(3));
		assertEquals("-", Questions.dashes(1));
	}
	@Test
	public void test27() {
		String[] a = {"ABC", "ACB", "BAC", "BCA","CBA", "CAB"};
		assertArrayEquals(a, Questions.permutations("ABC"));
		String[] b = {"AABC", "AACB", "ABAC", "ABCA", "ACAB", "ACBA", "BAAC", "BACA", "BCAA", "CAAB", "CABA" ,"CBAA"};
		assertArrayEquals(b, Questions.permutations("AABC"));
	}
	@Test
	public void test28() {

		assertEquals('l', Questions.repeat("legolas"));
		assertEquals('a', Questions.repeat("abcdabcd"));
	}
	@Test
	public void test29() {

		assertEquals(3, Questions.singledigit(147));
		assertEquals(9, Questions.singledigit(2880));
	}
	@Test
	public void test30()
	{
		assertEquals(1, Questions.happy(203));
		assertEquals(0, Questions.happy(2880));
	}
	@Test
	public void test31()
	{
		assertEquals(3702, Questions.series2(4));
		assertEquals(370368, Questions.series2(6));
	}
	@Test
	public void test32() {
		int[] a  = {1,2,4,6,3,7,8};
		assertEquals(5, Questions.missingnum(a, 8));
		int[] b  = {1,2,3,4,5,7,8,9,10};
		assertEquals(6, Questions.missingnum(b, 10));
	}
	@Test
	public void test33()
	{
		assertEquals(1, Questions.apocalyptic(157));
		assertEquals(0, Questions.apocalyptic(217));
	}
	@Test
	public void test34()
	{
		int[] a  = {-1,2,-4,6,-3,7,-8};
		assertEquals(1, Questions.alternate(a,7 ));
		int[] b  = {1,2,-4,-6,3,-7,-8};
		assertEquals(0, Questions.alternate(b,7 ));
	}
	@Test
	public void test35() {
		int[] a  = {1,3,5,9,11,8,15,33,37,41};
		assertEquals(1, Questions.sorting(a, 10));
		int[] b  = {1,3,5,2,11,8,15,3,7,41};
		assertEquals(0, Questions.sorting(b, 10));
	}
	@Test
	public void test36() {
		assertEquals("50lpp48aca", Questions.hashing("apple"));
		assertEquals("GN36KC32Haca", Questions.hashing("HACKING"));
	}
	@Test
	public void test37() {
		int[][] a  = {{2,0},{0,4}};
		assertEquals(1, Questions.diagonalmatrix(a, 2));
		int[][] b  = {{3,1,0},{1,2,4}, {2,5,6}};
		assertEquals(0, Questions.diagonalmatrix(b, 3));
	}
	@Test
	public void test38() {
		assertEquals(1, Questions.armstrong(153));
		assertEquals(0, Questions.armstrong(1253));
	}
	@Test
	public void test39() {
		assertEquals(5, Questions.kempner(5));
		assertEquals(3, Questions.kempner(3));
	}
	@Test
	public void test40() {
		char[] a = {'e', 't', 's', 't'};
		int[] b = {1, 3, 2, 0};
		assertEquals("test", Questions.rearrange(a,b, int n));
		char[] c = {'A', 'O', 'R', 'P', 'R', 'M', 'G'};
		int[] d = {5,2,4,0,1,6,3};
		assertEquals("PROGRAM", Questions.rearrange(c,d, int n));
	}
	@Test
	public void test41() {
		assertEquals(1, Questions.ascending(114455777));
		assertEquals(0, Questions.ascending(1433772));
	}
	@Test
	public void test42() {
		assertEquals(1, Questions.descending(998887755));
		assertEquals(0, Questions.descending(1433772));
	}
	@Test
	public void test43() {
		String[] a = {"Delhi", "Bangalore", "Agra", "Mumbai"};
		String[] b = {"Agra", "Bangalore", "Delhi", "Mumbai"};
		assertArrayEquals(b, Questions.alphasort(a, 4));
		String[] c = {"speed", "coding", "can", "be", "solved", "in", "sixty", "minutes"};
		String[] d = {"be", "can", "coding", "in", "minutes", "sixty", "solved", "speed"};
		assertArrayEquals(d, Questions.alphasort(c, 8));
	}
	@Test
	public void test44() {
		assertEquals(4, Questions.doubleletter("She was feeding the little rabbit with an apple"));
		assertEquals(2, Questions.doubleletter("She broke her knee due to her fast speed"));
	}
	@Test
	public void test45() {
		assertEquals("avehay", Questions.piglatin("have"));
		assertEquals("odingcay", Questions.piglatin("coding"));
	}
	@Test
	public void test46() {
		assertEquals(1, Questions.semiprime(49));
		assertEquals(0, Questions.semiprime(24));
	}
	@Test
	public void test47() {
		assertEquals(1, Questions.balanced(5));
		assertEquals(0, Questions.balanced(23));
	}
	@Test
	public void test48() {
		int[] a = {20, 22, 24, 3, 26, 2, 1};
		assertEquals(1, Questions.even(a, 7));
		int[] b = {21, 23, 27, 3, 29, 2, 1};
		assertEquals(0, Questions.even(b, 7));
	}
	@Test
	public void test49() {
		int[][] a = {{1,2,3,4}, {4,3,2,1}, {7,8,9,6}, {6,5,4,3}};
		assertEquals(36, Questions.diagonals(a, 4));
		int[][] b = {{4,9,2}, {3,5,7}, {8,1,6}};
		assertEquals(30, Questions.diagonals(b, 3));
	}
	@Test
	public void test50() {
		assertEquals("gnimmargorP ssalC", Questions.reverse("Programming Class"));
		assertEquals("snoitseuq 05 sah gnidoc deepS", Questions.reverse("Speed coding has 50 questions"));
	}
	@Test
	public void test51() {
		int[] a = {1, 3, 6, 10, 15, 21, 28, 36, 45, 55};
		assertEquals(a, Questions.triangular(10));
		int[] b = {1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91, 105, 120, 136, 153};
		assertEquals(b, Questions.triangular(17));
	}
}
