package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import code_coverage_4.code_coverage_4.Triangle_classification.Triangle_Types;

/*
 * פיראס דוירי - 214225021 
 * טארק סאלח – 316448588
 * */

public class Test_weak_method_1_a 
{
	Triangle_classification test = new Triangle_classification();

	@Test
	public void Test_01() {
		String Expected_result = "Nottriangle";
		int a = 4, b = 6, c = 12;
		String actual_result = Triangle_classification.classifyTriangle(a, b, c);
		assertEquals(actual_result, Expected_result);
		System.out.println("Test 1 : " + Expected_result);
	}

	@Test
	public void Test_02() {
		String Expected_result = "Nottriangle";
		int a = 2, b = 16, c = 4;
		String actual_result = Triangle_classification.classifyTriangle(a, b, c);
		assertEquals(actual_result, Expected_result);
		System.out.println("Test 2 : " + Expected_result);
	}

	@Test
	public void Test_03() {
		String Expected_result = "Nottriangle";
		int a = 5, b = 1, c = 1;
		String actual_result = Triangle_classification.classifyTriangle(a, b, c);
		assertEquals(actual_result, Expected_result);
		System.out.println("Test 3 : " + Expected_result);
	}

	@Test
	public void Test_04() {
		String Expected_result = "equilateral";
		int a = 9, b = 9, c = 9;
		String actual_result = Triangle_classification.classifyTriangle(a, b, c);
		assertEquals(actual_result, Expected_result);
		System.out.println("Test 4 : " + Expected_result);
	}

	@Test
	public void Test_05() {
		String Expected_result = "isosceles";
		int a = 7, b = 7, c = 6;
		String actual_result = Triangle_classification.classifyTriangle(a, b, c);
		assertEquals(actual_result, Expected_result);
		System.out.println("Test 5 : " + Expected_result);
	}

	@Test
	public void Test_06() {
		String Expected_result = "isosceles";
		int a = 9, b = 6, c = 9;
		String actual_result = Triangle_classification.classifyTriangle(a, b, c);
		assertEquals(actual_result, Expected_result);
		System.out.println("Test 6 : " + Expected_result);
	}

	@Test
	public void Test_07() {
		String Expected_result = "isosceles";
		int a = 6, b = 8, c = 8;
		String actual_result = Triangle_classification.classifyTriangle(a, b, c);
		assertEquals(actual_result, Expected_result);
		System.out.println("Test 7 : " + Expected_result);
	}

	@Test
	public void Test_08() {
		String Expected_result = "Scalene";
		int a = 3, b = 4, c = 5;
		String actual_result = Triangle_classification.classifyTriangle(a, b, c);
		assertEquals(actual_result, Expected_result);
		System.out.println("Test 8 : " + Expected_result);
	}


}
