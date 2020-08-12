
Speed Coding
=========

# General Instructions

+ You have 60 minutes (1h) to complete the assigned tasks.
+ Take your time to read the question.

## Question 1: Almost Palindrome

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given a string, we need to check whether it is possible to make the string a palindrome after removing exactly one character from it.

### Test Cases

```java
@Test
public void test1() {
	assertEquals(true, FibBase.almostPalindrome("abcba"));
}
```
## Question 2: Multiplying Strings

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given two numbers as strings.The task is to find product of these two numbers.

### Test Cases

```java
@Test
public void test2() {
	assertEquals(10000, FibBase.MultiplyStrings(500,20));
}
```
## Question 3: Super Palindrome

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Write a program in Java to input 10 numbers from the user. Check and return the numbers that are super palindrome numbers only. 
A super palindrome number is a palindrome number whose square is also a palindrome.

### Test Cases

```java
@Test
public void test3() {
	int[] a1= {1,2,7,3,11,123,320,32,45,78};
	int[] a= {4,9,121};
	assertEquals(a, FibBase.SuperPalindrome(a1));
}
```
## Question 4: Prime backwards and forwards

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given an integer, check whether that int forms a prime number forwards and backwards.

### Test Cases

```java
@Test
public void test4() {
	assertEquals(true, FibBase.trueorfalse(17));
}
```
## Question 5: Finding the GCD

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given two integers, return their greatest common divisor.

### Test Cases

```java
@Test
public void test5() {
	assertEquals(3, FibBase.findgcd(24,27));
}
```
## Question 6: Average number of letters and sentences per 100 words

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given a string, return the average number of letters per 100 words and the average number of sentences per 100 words.

### Test Cases

```java
@Test
public void test6() {
	int[] a = {464,28};
	assertEquals(a, FibBase.averagestring("Congratulations! Today is your day. You're off to Great Places! You're off and away!"));
}
```
## Question 7: The potential of a word

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given a sentence, arrange the words in ascending order according to their potential. The potential of a word is found by adding the ASCII value of the alphabets.

### Test Cases

```java
@Test
public void test7() {
	assertEquals("YOU LEAP LOOK BEFORE", FibBase.potential("LOOK BEFORE YOU LEAP"));
}
```
## Question 8: Returning a series

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Return the series 0, 3, 8, 15.. Till n terms

### Test Cases

```java
@Test
public void test8() {
	int[] a = {0, 3, 8, 15, 24, 35,48,63};
	assertEquals(a, FibBase.series(8));
}
```
## Question 9: A valid filename

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Determine whether a given string is a valid filename with an extension and if yes, return the correct extension.

### Test Cases

```java
@Test
public void test9() {
	assertEquals(".py", FibBase.filename("hackathon.py"));
}
```
## Question 10: Disarium numbers

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Write a Program in Java to input a number and check whether it is a Disarium Number or not.
Note: A number will be called DISARIUM if the sum of its digits powered with their  respective position is equal to the original number.

### Test Cases

```java
@Test
public void test10() {
	assertEquals(true, FibBase.disarium(135));
}
```
## Question 11: Special numbers

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Write a program to check whether a given number is a special number. 
A special number is one that equals the sum of the factorials of its digits. For example, 145 is a special number as the sum of the factorial of each digit is equal to 145. 

### Test Cases

```java
@Test
public void test11() {
	assertEquals(true, FibBase.special(145));
}
```
## Question 12: Equal arrays

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Determine whether two integer arrays are equal or not.

### Test Cases

```java
@Test
public void test12() {
	int[] a = {43,23,56,54,21,29};
	int[] b = {43,23,56,54,21,29};
	assertEquals(true, FibBase.equalarr(a,b));
}
```
## Question 13: Prime factors

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given an integer, return its prime factorisation.

### Test Cases

```java
@Test
public void test13() {
	int[] a = {2,2,2,3,3};
	assertEquals(a, FibBase.prime(72));
}
```
## Question 14: Automorphic numbers

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Write a Java program check whether a number is an Automorphic number or not.
An automorphic number is a number whose square "ends" in the same digits as the number itself.

### Test Cases

```java
@Test
public void test14() {
	assertEquals(true, FibBase.automorphic(6));
}
```
## Question 15: Alphabetical order

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given a string, check whether the characters are in alphabetical order.

### Test Cases

```java
@Test
public void test15() {
	assertEquals(true, FibBase.alphabetical("aeghjm"));
}
```
## Question 16: Array to string

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given a character array, convert the array into a string and return it.

### Test Cases

```java
@Test
public void test16() {
	char[] a = {'h', 'a', 'c', 'k', 'a', 't', 'h', 'o', 'n'};
	assertEquals("[h, a, c, k, a, t, h, o, n]", FibBase.arrtostr(a));
}
```
## Question 17: Special array

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given an integer array, determine whether it is a special array or not.
An array is special, if every even index contains an even number and every odd index contains an odd number.

### Test Cases

```java
@Test
public void test17() {
	int[] a = {6,3,4,9,2,5,12};
	assertEquals(true, FibBase.specialarr(a));
}
```
## Question 18: Returning the nth term

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Return the nth term in the series:
3, 7, 15, 31, 63….

### Test Cases

```java
@Test
public void test18() {
	assertEquals(255, FibBase.series1(7));
}
```
## Question 19: Anagrams

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Determine whether two given strings are anagrams or not.

### Test Cases

```java
@Test
public void test19() {
	assertEquals(true, FibBase.anagram("triangle", "integral"));
}
```
## Question 20: Calculating the net bill

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Return the net bill to be paid by a consumer. The net bill to be paid by a consumer includes a rent of Rs. 250 charged by a consumer. 

Units ---- Charge per Unit

First 100 ----- 40 p

Next 200 ----- 60 p

Above 300 ----- Rs 1


### Test Cases

```java
@Test
public void test20() {
	assertEquals(640.0, FibBase.netbill(530));
}
```
## Question 21: Courier service rates

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

A courier service provides a speed service for any letter/parcel to Mumbai which delivers on the same day as per the rates given below:

Up to 100 grams:                               	        	= Rs. 80/-

For each additional 100 gram or part thereof    		= Rs. 40/-

Return the net bill to be paid.

### Test Cases

```java
@Test
public void test21() {
	assertEquals(280, FibBase.parcel(520));
}
```
## Question 22: Finding vowels

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Return the first n vowels in a given string.

### Test Cases

```java
@Test
public void test22() {
	assertEquals("aao", FibBase.vowels("hackathon", 3));
}
```
## Question 23: Maximum frequency of a character

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given a string, return the first character with maximum frequency.

### Test Cases

```java
@Test
public void test23() {
	assertEquals('t', FibBase.maxfreq("tests"));
}
```
## Question 24: Finding the last index

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given a string consisting only '0's and '1's,  return the last index of the '1' present in it.

### Test Cases

```java
@Test
public void test24() {
	assertEquals(7, FibBase.lastindex("010010010"));
}
```
## Question 25: Number to dashes

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Convert the given integer into a string of dashes of that number and return the string.

### Test Cases

```java
@Test
public void test25() {
	assertEquals("-----", FibBase.dashes(5));
}
```
## Question 26: Finding permutations

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given a string, return all of its possible permutations.

### Test Cases

```java
@Test
public void test26() {
	String[] a = {"cde", "ced", "dce", "dec", "ecd", "edc"};
	assertEquals(a, FibBase.permutations("cde"));
}
```
## Question 27: First repeating character

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given a string, return the first character that repeats.

### Test Cases

```java
@Test
public void test27() {
	assertEquals('a', FibBase.repeat("gandalf"));
}
```
## Question 28: Converting to a single digit

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given an integer, find the sum of the digits of the number until it becomes a single digit. Return the single digit.

### Test Cases

```java
@Test
public void test28() {
	assertEquals(1, FibBase.singledigit(1234));
}
```
## Question 29: Happy numbers

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given an integer, check whether it is a happy number or not.
A happy number is one in which the number which eventually reaches 1 when replaced by the sum of the square of each digit.

### Test Cases

```java
@Test
public void test29() {
	assertEquals(true, FibBase.happy(19));
}
```
## Question 30: Sum of series

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Return the sum of the series up till n terms:
3+33+333…


### Test Cases

```java
@Test
public void test30() {
	assertEquals(37035, FibBase.series2(5));
}
```
## Question 31: Missing number

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given a list of n-1 integers in the range of 1 to n, there is one integer missing from the list. Return the missing integer.
Note: There are no duplicates in the list.

### Test Cases

```java
@Test
public void test31() {
	int[] a = {10,11,16,13,12,15,17,18,19};
	assertEquals(14, FibBase.missingnum(a));
}
```
## Question 32: Apocalyptic number

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Determine whether a number is apocalyptic or not.
A number n is apocalyptic if 2^n contains a string of 3 consecutive 6s.

### Test Cases

```java
@Test
public void test32() {
	assertEquals(true, FibBase.apocalyptic(192));
}
```
## Question 33: Alternating positions

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given an array, determine whether the the elements at alternate positions are positive and negative, respectively.

### Test Cases

```java
@Test
public void test33() {
	int[] a = {-10,11,-16,13,-12,15,-17,18,-19};
	assertEquals(true, FibBase.alternate(a));
}
```
## Question 34: Almost-sorted array

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given an array, determine whether the it is an almost sorted array.
An almost-sorted sequence is a sequence that is strictly increasing if you remove a single element from the array (no more, no less).

### Test Cases

```java
@Test
public void test34() {
	int[] a = {2,5,7,8,3,10,13,14};
	assertEquals(true, FibBase.sorting(a));
}
```
## Question 35: Encryption

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given a word, return its changed form according to the following steps:
Reverse the word 
Replace each vowel with its ASCII value, do integer division and divide it by two. 
Add “aca” to the end of the word 

### Test Cases

```java
@Test
public void test35() {
	assertEquals("50d55caca", FibBase.sorting("code"));
}
```
## Question 36: Diagonal matrix

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given a matrix, determine whether it is a diagonal matrix or not.
A matrix is said to be diagonal if all elements M[i][j] with i different from j (i.e., that are not on the main diagonal) are equal to 0

### Test Cases

```java
@Test
public void test36() {
	int[][] a = {{4,0},{0,3}};
	assertEquals(true, FibBase.diagonalmatrix(a));
}
```
## Question 37: Armstrong numbers

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given an integer, check whether it is an armstrong number or not.
An armstrong number is one that is equal to the sum of cubes of its digits.

### Test Cases

```java
@Test
public void test37() {
	assertEquals(true, FibBase.armstrong(1634));
}
```
## Question 38: Kempner numbers

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Return the kempner number of a particular number n.
A kempner number for a particular number n may be defined as the smallest number s, such that s! Is divisible by n

### Test Cases

```java
@Test
public void test38() {
	assertEquals(5, FibBase.kempner(10));
}
```
## Question 39: Rearrange letters

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given two arrays, one containing the scrambled word and the other containing the correct positions, form the new word.

### Test Cases

```java
@Test
public void test39() {
	char[] a = {'e', 'c', 'o', 'd'};
	int[] b = {3,0,1,2};
	assertEquals("code", FibBase.rearrange(a,b));
}
```
## Question 40: Ascending and repeating digits

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Determine whether a given number’s digits are in ascending order and if they are repeating.

### Test Cases

```java
@Test
public void test40() {
	assertEquals(true, FibBase.ascending(113335566));
}
```
## Question 41: Descending and repeating digits

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Determine whether a given number’s digits are in descending order and if they are repeating.

### Test Cases

```java
@Test
public void test41() {
	assertEquals(true, FibBase.descending(77443322111));
}
```
## Question 42: Alphabetical order

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given an array of words, arrange them in alphabetical order and return them.

### Test Cases

```java
@Test
public void test42() {
	String[] a = {"hackathon", "coding", "programming" ,"files"};
	String[] b = {"coding", "files", "hackathon", "programming"};
	assertEquals(b, FibBase.alphasort(a));
}
```
## Question 43: Double letters

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given a string, return the number of double letter sequences that exist in the string.

### Test Cases

```java
@Test
public void test43() {
	assertEquals(2, FibBase.sorting("She needs the door to be opened"));
}
```
## Question 44: Pig latin

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Return a given word's pig latin translation. 
If a word starts with a consonant, move the first letter(s) of the word, till you reach a vowel, to the end of the word and add "ay" to the end. 
If a word starts with a vowel add "yay" to the end of the word. 

### Test Cases

```java
@Test
public void test44() {
	assertEquals("ateyay", FibBase.piglatin("ate"));
}
```
## Question 45: Semi prime numbers

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Determine whether a given number is a semi prime one.
A semiprime is a composite number that is the product of two primes. Apart from these two primes, its only other proper (non-self) divisor is 1. The two prime factors of a semiprime can be the same number or two distinct prime factors. 

### Test Cases

```java
@Test
public void test45() {
	assertEquals(true, FibBase.semiprime(15));
}
```
## Question 46: Primal strength

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Determine whether a given number is balanced.
A prime number is balanced if it is equidistant from the prime before it and the prime after it.

### Test Cases

```java
@Test
public void test46() {
	assertEquals(true, FibBase.balanced(53));
}
```

## Question 47: Even dominant

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Determine whether an array contains more even numbers than odd.

### Test Cases

```java
@Test
public void test47() {
	int[] a = {1, 2, 4, 6, 8, 14, 18, 3};
	assertEquals(true, FibBase.even(15));
}
```
## Question 48: Sum of diagonals

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given a matrix, return the sum of the primary and secondary diagonal.

### Test Cases

```java
@Test
public void test48() {
	int[][] a = {{1,3,5},{7,9,8},{6,4,2}};
	assertEquals(32, FibBase.diagonals(a));
}
```
# Question 49: Reversing a string

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given a string, reverse each word and return the new formed string.

### Test Cases

```java
@Test
public void test49() {
	assertEquals("sredoc ,olleh", FibBase.reverse("hello, coders"));
}
```
# Question 50: Triangular number sequence.

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Return the triangular number sequence till n.
A triangular number is a figurative number that can be represented in the form of an equilateral triangular grid of elements such that every subsequent row contains an element more than the previous one.

### Test Cases

```java
@Test
public void test50() {
	int[] a = {1, 3, 6, 10, 15};
	assertEquals(a, FibBase.triangular(5));
}
```
