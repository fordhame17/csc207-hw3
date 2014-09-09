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
    int remainder = 0;
    if (PartA.isOdd(left))
      {
        if (left!=0)
          remainder=remainder+left/Math.abs(left);
      } // if left odd
    if (PartA.isOdd(right))
      {
        if (right!=0)
          remainder=remainder+right/Math.abs(right);
      } // if right odd
    if (remainder>1)
      {
        average++;
      } // if pos remain
    if (remainder<-1)
      {
        average--;
      } // if neg remain
    if (remainder==1&&average<0)
      {
        average++;
      } // if neg ave
    if (remainder==-1&&average>0)
      {
        average--;
      } // if pos ave
    return average;
  } // average(int,int)
  
  
  /**
   * Our case uses main as a testing domain instead of junit for variety.
   */
  public static void main(String[] args)
  {
    for (int Count1=-10;Count1<=10;Count1++)
      {
        for (int Count2=Count1;Count2<10;Count2++)
          {
            if (Average(Count1,Count2)!=(int)(((long)Count1+(long)Count2)/2))
              {
                System.out.println("Count1="+Count1+" Count2="+Count2);
                System.out.println("We have from Average="+Average(Count1,Count2)+" Long="+(int)(((long)Count1+(long)Count2)/2));
                System.out.println("");
                Count1=Integer.MAX_VALUE;
                Count2=Count1;
              } // if equal
          } // for count2
      } // for count1
  } // main
} // class PartB
