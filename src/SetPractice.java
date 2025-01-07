import java.util.HashSet;
import java.util.Set;

public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    Set<String> hashy = new HashSet<>();
    // Add 3 elements to the set
    // (It's OK to do it one-by-one)
    hashy.add("metal");
    hashy.add("water");
    hashy.add("air");
    // Check whether the Set contains a given String
    boolean doesIt = hashy.contains("air");
    System.out.println(doesIt);
    // Remove an element from the Set
    hashy.remove("air");
    // Get the size of the Set
    System.out.println(hashy.size());
    // Iterate over the elements of the Set, printing each one on a separate line
    for (String element : hashy) {
      System.out.println(element);
    }
    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
