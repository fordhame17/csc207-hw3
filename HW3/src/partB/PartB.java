package partB;

import partA.PartA;

public class PartB
{
 
  /**
   * Compute the average of two integers.  Rounds toward zero if the
   * average is not a whole number.
   */
  public static int Average(int left, int right)
  {
    int average=(left/2+right/2);
    /*
    remainder registers the the number of .5
    remainders which are lost in the process of
    diving left, and right by two. Negative values
    represent the remainders of dividing negative
    odd numbers
    */
    int remainder = 0;
    if (PartA.isOdd(left))
      {
        if (left>0)
          {
            remainder++;
          }
        if (left<0)
          {
            remainder--;
          }
      }
    if (PartA.isOdd(right))
      {
        if (right>0)
          {
            remainder++;
          }
        if (right<0)
          {
            remainder--;
          }
      }
      /*
      If both remainders are positive, we increment. If both negative, we decrement, otherwise what
      we do depends on whether remainder and averageare positive or not.
      */
    if (remainder>1)
      {
        average++;
      }
    if (remainder<-1)
      {
        average--;
      }
    if (remainder==1&&average<0)
      {
        average++;
      }
    if (remainder==-1&&average>0)
      {
        average--;
      }
    return average;
  } // average(int,int)
} // class PartB