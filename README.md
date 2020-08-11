
Speed Coding
=========

# General Instructions

+ You have 60 minutes (1h 5m) to complete the assigned tasks.
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
## Question 3: Prime backwards and forwards

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given an integer, check whether that int forms a prime number forwards and backwards.

### Test Cases

```java
@Test
public void test3() {
	assertEquals(true, FibBase.trueorfalse(17));
}
```
## Question 4: Average number of letters and sentences per 100 words

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given a string, print the average number of letters per 100 words and the average number of sentences per 100 words.

### Test Cases

```java
@Test
public void test4() {
	assertEquals({464, 28}, FibBase.averagestring("Congratulations! Today is your day. You're off to Great Places! You're off and away!"));
}
```
## Question 5: The potential of a word

> The skeleton source code for this question is in the package `fibbase`. You may import the provided code as a Gradle project in Eclipse.

Given a sentence, arrange the words in ascending order according to their potential. The potential of a word is found by adding the ASCII value of the alphabets.

### Test Cases

```java
@Test
public void test5() {
	assertEquals("YOU LEAP LOOK BEFORE", FibBase.potential("LOOK BEFORE YOU LEAP"));
}
```
