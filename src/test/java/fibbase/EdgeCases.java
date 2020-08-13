package fibbase;

import org.junit.Test;

import static org.junit.Assert.*;

public class EdgeCases {
    double delta1 = 0.0001;
    @Test
    public void test1() {
        assertEquals(0, Questions.Divide(1, 0));
    }

    @Test
    public void test2() {
        assertEquals(false, Questions.almostPalindrome(""));
        assertEquals(false, Questions.almostPalindrome("abcbea "));

    }

    @Test
    public void test3() {
        assertEquals(0, Questions.MultiplyStrings("",""));
        assertEquals(0, Questions.MultiplyStrings("a","b"));
    }
    @Test
    public void test4() {
        int[] a1= {-1,4,-8,9,-111,-121,300,-484};
        int[] a= {4,9,-121,-484};
        assertArrayEquals(a,Questions.SuperPalindrome(a1));
    }
    @Test
    public void test5() {
        assertEquals(false, Questions.trueorfalse(0));
    }
    @Test
    public void test6() {
        assertEquals(0, Questions.findgcd(0, 16));
    }
    @Test
    public void test7() {
        int[] n = {0};
        assertEquals(n, Questions.averagestring(""));
        assertEquals(n, Questions.averagestring("1234"));
    }
    @Test
    public void test8() {
        assertEquals("invalid", Questions.potential(""));
        assertEquals("invalid", Questions.potential("1234"));
    }
    @Test
    public void test9() {
        int[] n = {0};
        assertEquals(n, Questions.series(-1));
        assertEquals(n, Questions.series(0));
    }
    @Test
    public void test10() {

        assertEquals("invalid", Questions.filename(""));
    }
    @Test
    public void test11() {
        assertEquals(false, Questions.disarium(0));
        assertEquals(false, Questions.disarium(-135));
    }
    @Test
    public void test12() {
        assertEquals(false, Questions.special(40585));
    }
    @Test
    public void test13() {
        int[] a = {};
        int[] b = {5,6,7};
        assertEquals(false, Questions.equalarr(a,b, 0, 3));
    }
    @Test
    public void test14() {
        int[] a = {0};
        assertEquals(a, Questions.prime(0));
    }
    @Test
    public void test15() {
        assertEquals(false, Questions.automorphic(0));
    }
    @Test
    public void test16() {

        assertEquals(false, Questions.alphabetical(""));
        assertEquals(false, Questions.alphabetical(""));
    }
    @Test
    public void test17() {
        char[] a = {};
        assertEquals("invalid", Questions.arrtostr(a));
    }
    @Test
    public void test18() {
        int[] a = {};
        assertEquals(false, Questions.specialarr(a, 0));
    }
    @Test
    public void test19() {
        assertEquals(0, Questions.series1(-1));
        assertEquals(0, Questions.series1(0));
    }
    @Test
    public void test20() {
        assertEquals(false, Questions.anagram("","silent"));
        assertEquals(false, Questions.anagram("",""));
        assertEquals(false, Questions.anagram("4321","1234"));
    }
    @Test
    public void test21() {

        assertEquals(0.0, Questions.netbill(0.0),delta1);
        assertEquals(0.0, Questions.netbill(-10.0),delta1);
    }
    @Test
    public void test22() {

        assertEquals(0, Questions.parcel(0));
        assertEquals(0, Questions.parcel(-10));

    }
    @Test
    public void test23()
    {
        assertEquals("invalid", Questions.vowels("programming", 4));
        assertEquals("invalid", Questions.vowels("", 4));
        assertEquals("invalid", Questions.vowels("programming", 0));
        assertEquals("invalid", Questions.vowels("programming", -1));
    }
    @Test
    public void test24()
    {
        assertEquals('0', Questions.maxfreq(""));
        assertEquals('0', Questions.maxfreq("1234"));
    }
    @Test
    public void test25() {

        assertEquals(0, Questions.lastindex("002002102010"));
        assertEquals(0, Questions.lastindex("0000"));
        assertEquals(0, Questions.lastindex("1111"));
        assertEquals(0, Questions.lastindex("abcd"));
    }
    @Test
    public void test26() {
        assertEquals("invalid", Questions.dashes(0));
        assertEquals("invalid", Questions.dashes(-1));
    }
    @Test
    public void test27() {
        String[] a = {"invalid"};
        assertArrayEquals(a, Questions.permutations(""));
    }
    @Test
    public void test28() {

        assertEquals('0', Questions.repeat("abcd"));
    }
    @Test
    public void test29() {

        assertEquals(0, Questions.singledigit(0));
    }
    @Test
    public void test30()
    {
        assertEquals(false, Questions.happy(0));
        assertEquals(false, Questions.happy(-50));
    }
    @Test
    public void test31()
    {
        assertEquals(0, Questions.series2(0));
        assertEquals(0, Questions.series2(-10));
    }
    @Test
    public void test32() {
        int[] a  = {};
        assertEquals(0, Questions.missingnum(a,0 ));
        int[] b = {1, 2, 12,4,13,5};
        assertEquals(0, Questions.missingnum(b,7 ));
    }
    @Test
    public void test33()
    {
        assertEquals(false, Questions.apocalyptic(0));
    }
    @Test
    public void test34()
    {
        int[] a  = {};
        assertEquals(0, Questions.alternate(a, 0));
        assertEquals(0, Questions.alternate(a, -1));
    }
    @Test
    public void test35() {
        int[] a  = {};
        assertEquals(false, Questions.sorting(a, 0));
        assertEquals(false, Questions.sorting(a, -1));
    }
    @Test
    public void test36() {
        assertEquals("invalid", Questions.encrypt(""));
        assertEquals("invalid", Questions.encrypt("1234"));
    }
    @Test
    public void test37() {
        int[][] m  = {};
        assertEquals(false, Questions.diagonalmatrix(m, 0));
    }
    @Test
    public void test38() {
        assertEquals(false, Questions.armstrong(0));
    }
    @Test
    public void test39() {
        assertEquals(0, Questions.kempner(0));
    }

    @Test
    public void test41() {
        assertEquals(false, Questions.ascending(0));
    }
    @Test
    public void test42() {
        assertEquals(false, Questions.descending(0));
    }
    @Test
    public void test43() {
        String[] a = {};
        String[] b = {"invalid"};
        assertArrayEquals(b, Questions.alphasort(a));
    }
    @Test
    public void test44() {
        assertEquals(0, Questions.doubleletter(""));
        assertEquals(0, Questions.doubleletter("1234"));
    }
    @Test
    public void test45() {
        assertEquals("invalid", Questions.piglatin(""));
        assertEquals("invalid", Questions.piglatin("1234"));
    }
    @Test
    public void test46() {
        assertEquals(false, Questions.semiprime(0));
    }
    @Test
    public void test47() {
        assertEquals(false, Questions.balanced(0));
    }
    @Test
    public void test48() {
        int[][] a = {};
        assertEquals(0, Questions.diagonals(a, 0));
        assertEquals(0, Questions.diagonals(a, -1));
    }
    @Test
    public void test49() {
        assertEquals("invalid", Questions.reverse(""));
    }
    @Test
    public void test50() {
        int[] a = {0};
        assertEquals(a, Questions.triangular(0));
        assertEquals(a, Questions.triangular(-10));
    }
}
