package partD;
import java.lang.String;

public class PartD
{
  //We go through some test runs
  public static void main(String[] args)
  {
    NameGame("William");
    NameGame("Haddi");
    NameGame("Eileen");
    NameGame("Sam");
  }
  
  
  /*
   * This method prints a poem poking fun at the person whos name is given
   * by distorting the persons name and using it in a nonsensical context
   * Preconditions:
   * Name must have at least one vowel
   * Postconditions:
   * A poem will be printed
   * -Poem composed by Shirley Ellis
   */
  public static void NameGame(String name)
  {
    String usedVowels = "aeiouy";
    int firstVowelPosition = name.length()+1;
    /*
     * We loop through each vowel. We find the first occurrence of the vowel in the
     * name given. We then find the earliest occurrence of any vowel from among the
     * results of our looping
     */
    for (int vowelIterator = 0; vowelIterator < usedVowels.length(); vowelIterator++)
      {
        int foundVowel = name.indexOf(usedVowels.charAt(vowelIterator));  
        if (foundVowel > -1 && foundVowel < firstVowelPosition)
          {
            firstVowelPosition = foundVowel;
          }
      }
    //We take the substring and print the poem
    String endOfName = name.substring(firstVowelPosition);
    System.out.println(name+"!");
    System.out.println(name+", "+name+" bo B"+endOfName+" Bonana fanna fo F"+endOfName);
    System.out.println("Fee fy mo M"+endOfName+", "+name+"!");
  }

}
