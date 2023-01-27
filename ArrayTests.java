import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlaceLongerIntArray()
  {
    int[] test = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(test);
    assertArrayEquals(new int[]{5,4,3,2,1}, test);
  }

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedShortArray()
  {
    int[] test = {1};
    ArrayExamples.reversed(test);
    assertArrayEquals(new int[]{1}, test);
  }

  @Test
  public void testAverageWithoutLowest()
  {
    double[] test = {};
    assertEquals((double) 0.0, ArrayExamples.averageWithoutLowest(test),0.00001);
  }

  @Test
  public void testAverageWithoutLowestOneNum()
  {
    double[] test = {1};
    assertEquals((double) 0.0, ArrayExamples.averageWithoutLowest(test),0.000001);
  }

  @Test
  public void testAverageWithoutLowestAtFirst()
  {
    double[] test = {1,3,3,3,3};
    assertEquals((double) 3, ArrayExamples.averageWithoutLowest(test),0.001);
  }

  @Test
  public void testAverageWithoutLowestAtLast()
  {
    double[] test = {3,3,3,3,1};
    assertEquals((double) 3, ArrayExamples.averageWithoutLowest(test),0.001);
  }
   
  @Test
  public void testAverageWithoutLowestAllSame()
  {
    double[] test = {3,3,3,3};
    assertEquals((double) 3, ArrayExamples.averageWithoutLowest(test),0.001);
  }


  @Test
  public void testAverageWithoutLowestTwoNegatives()
  {
    double[] test = {-3,-3,3,3};
    assertEquals((double) 1, ArrayExamples.averageWithoutLowest(test),0.001);
  }
   
}
