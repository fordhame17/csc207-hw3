package partA;

import static org.junit.Assert.*;

import org.junit.Test;

public class PartATestFirstAttempt
{

  @Test
  public void test_isOdd()
    throws Exception
  {
    long counter = 0;
    for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE; i++)
      {
        if (counter == 0)
          {
            assertEquals("Test Even", false, PartA.isOdd(i));
            counter = 1;
          } // if true
        else
          {
            assertEquals("Test Odd", true, PartA.isOdd(i));
            counter = 0;
          } // else
      } // for
  } // test_isOdd

  @Test
  public void test_isMultiple()
    throws Exception
  {
    for (long i=-20;i<20;i++)
      {
        for (long j=-20;j<20;j++)//i=j*k
          {
            boolean isMultiple=false;
            for (long k=-20;k<21;k++)
              {
                if (i==j*k)
                  {
                  isMultiple=true;
                  }
              }
            if (isMultiple!=PartA.isMultiple(i, j))
              {
                System.out.println("Bad news, i"+i+" j="+j);
              }
            assertEquals("Test General Multiples",isMultiple,PartA.isMultiple(i, j));
          }
      }
  } // test_isMultiple

  @Test
  public void test_oddSumTo()
    throws Exception
  {
    int testNumber = -20;
    while (testNumber < 25)
      {
        int sum = 0;
        for (int count = 1; count < testNumber; count = count + 2)
          {
            sum = sum + count;
          }
        assertEquals("Test Various Numbers", sum, PartA.oddSumTo(testNumber));
        testNumber++;
      }
  } // test_oddSumTo

  @Test
  public void test_isOddProd()
    throws Exception
  {
    assertEquals("Empty Array", false, PartA.isOddProd(new int[]{}));
    assertEquals("Single Value Array", false, PartA.isOddProd(new int[]{4}));
    assertEquals("Even And Odd Values Double Array", false, PartA.isOddProd(new int[]{4,3}));
    assertEquals("Array with two odds, one even", true, PartA.isOddProd(new int[]{4, 3, 3}));
    assertEquals("Array with two odds, two evens", true, PartA.isOddProd(new int[]{4, 3, 3, 2}));
    assertEquals("Array with many evens", false, PartA.isOddProd(new int[]{8, 6, 4, 2}));
    assertEquals("Array with many evens and one odd", false, PartA.isOddProd(new int[]{8, 6, 4, 2, 7}));
  } // test_isOddProd
  
  @Test
  public void test_allDistinct()
    throws Exception
  {
    assertEquals("Empty Array", true, PartA.allDistinct(new int[]{}));
    assertEquals("One value Array", true, PartA.allDistinct(new int[]{1}));
    assertEquals("Two value Array", true, PartA.allDistinct(new int[]{1, 2}));
    assertEquals("3 value Array, one repeat", false, PartA.allDistinct(new int[]{1, 2, 1}));
    assertEquals("4 value Array, two repeats", false, PartA.allDistinct(new int[]{1, 2, 1, 1}));
    assertEquals("4 value Array, two separate repeats", false, PartA.allDistinct(new int[]{1, 2, 1, 2}));
    assertEquals("Last values repeats", true, PartA.allDistinct(new int[]{1, 2, 3, 7}));
  } // test_allDistinct

  @Test
  public void test_reverseInts()
    throws Exception
  {
    for (int i = 0; i < 10; i++)
      {
        int[] arrayToTest = new int[i];
        int[] arrayToTestReverse = new int[i];
        for (int j = 0; j < i; j++)
          {
            arrayToTest[j] = j;
            arrayToTestReverse[i - j - 1] = j;
          } // for
        assertArrayEquals(arrayToTestReverse, PartA.reverseInts(arrayToTest));
      }  // for
  }// test_reverseInts 

}