import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter number of integers: ");
    int len = in.nextInt();
    ArrayList<Integer> elements = new ArrayList<>();
    ArrayList<Integer> counts = new ArrayList<>();
    for (int i = 0; i< len; i++)
    {
      System.out.print("Enter integer: ");
      elements.add(in.nextInt());
    }
    for (int j = 0; j<len; j++)
    {
      counts.add(Collections.frequency(elements,elements.get(j)));
    }
    for (int k = 0; k<len; k++)
    {
      if (Collections.max(counts) == counts.get(k))
      {
        if (elements.get(k) !=elements.get(k+1))
        {
          System.out.print("There is no mode.");
          break;
        } 
      }
      else
      {
        System.out.print("The mode is: " + elements.get(counts.indexOf(Collections.max(counts))));
        break; 
      }
    }
  }
}
