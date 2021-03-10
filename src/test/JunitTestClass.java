package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestClass {

	@Test
	public void test() {

		TestClass testClass = new TestClass();
		String str = "おはよう";
		String result = testClass.testMethod(str);
		assertEquals(result, "朝");
	}
	@Test
	public void testFail() {
		TestClass testClass = new TestClass();
		String str = "おはよう";
		String result = testClass.testMethod(str);
		assertEquals(result, "昼");
	}
	@Test
	public void test_hiru() {
		TestClass testClass = new TestClass();
		String str = "こんにちは";
		String result = testClass.testMethod(str);
		assertEquals(result, "昼");
	}
	@Test
	public void test_yoru() {
		TestClass testClass = new TestClass();
		String str = "こんばんは";
		String result = testClass.testMethod(str);
		assertEquals(result, "夜");
	}
	@Test
	public void test_err() {
		TestClass testClass = new TestClass();
		String str = "あいうえお";
		String result = testClass.testMethod(str);
		assertEquals(result, "エラー");
	}

}
