package partA;

public class PartA
{
  /**
   * Determine if a is a multiple of b.
   */           
  public static boolean isMultiple(long a, long b)
  {
    for (long i = -Math.abs(a); i <= Math.abs(a); i++)
      {
        if ((b * i) == a)
          return true;
      } // for
    return false;
  } // isMultiple(long, long)

  /**
   * Determine if i is odd.
   */
  public static boolean isOdd(int i)
  {
    int value = Math.abs(i);
    int powerValue;
    while (value > 1)
      {
        powerValue = 2;
        while ((powerValue * 2) < value)
          {
            powerValue = powerValue * 2;
          } // while
        value = value - powerValue;
      } // while greater than 1
    if (value == 1)
      {
        return true;
      } // if equal to 1
    return false;
  } // isOdd(int)
  
  
  /**
   * Returns sum of all positive odd numbers less than n.
   */
  public static int oddSumTo(int n)
  {
    if (n<=0)
      {
        return 0;
      } // if pos n
    if (isOdd(n))
      {
        return ((n - 1) / 2) * ((n - 1) / 2);
      } // if odd n
    else
      {
        return n * n / 4;
      } // else if even n
  } // oddSumTo(int)

  /**
   * Determines if any two numbers within the given array ints
   * have an odd product.
   */
  public static boolean isOddProd(int[] ints)
  {
    for (int i = 0; i < ints.length; i++)
      {
        for (int j = i + 1; j < ints.length; j++)
          {
            int valueproduct = ints[i] * ints[j];
            if (PartA.isOdd(valueproduct))
              {
                return true;
              } // if odd
          } // for row 2
      } // for row 1
    return false;
  } // isOddProd(int[])
  
  /**
   * Determine if a given array of integers has any repeated values.
   */
  public static boolean allDistinct(int[] ints)
  {
    for (int i = 0; i < ints.length; i++)
      {
        for (int j = i + 1; j < ints.length; j++)
          {
            if (ints[i]==ints[j])
              {
                return false;
              } // if equal
          } // for row 2
      } // for row 1
    return true; 
  } // allDistinct(int[])
  
  /**
   * Reverse the order of the values in a given array.
   */
  public static int[] reverseInts(int[] ints)
  {
    int i=0;
    int j=ints.length-1;
    int Holder;
    while (i<j)
      {
        Holder=ints[i];
        ints[i]=ints[j];
        ints[j]=Holder;
        i++;
        j--;
      } // while i less than j
    return ints;
  } // reverseInts(int[])
} // PartA
