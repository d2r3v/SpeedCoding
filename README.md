
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

@Test
public void test2() {
	assertEquals(3, FibBase.ySum(1, 2));
}

@Test
public void test3() {
	assertEquals(7, FibBase.ySum(1, 3));
}

@Test
public void test4() {
	assertEquals(12, FibBase.ySum(1, 4));
}

@Test
public void test5() {
	assertEquals(20, FibBase.ySum(1, 5));
}
```
