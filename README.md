
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

