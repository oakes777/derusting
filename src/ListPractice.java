import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    List<String> aList = new ArrayList<>();
    // Add 3 elements to the list (OK to do one-by-one)
    aList.add("apple");
    aList.add("orange");
    aList.add("banana");
    // Print the element at index 1
    System.out.println(aList.get(1));
    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    aList.set(1, "cumquat");
    // Insert a new element at index 0 (the length of the list will change)
    aList.add(0, "grapes");
    // Check whether the list contains a certain string
    if (aList.contains("avocado")) {
      System.out.println("The list contains 'avocado'.");
    } else {
      System.out.println("The list does not contain 'avocado'.");
    }
    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for (int i = 0; i < aList.size(); i++) {
      System.out.println("Index: " + i + ", Value: " + aList.get(i));
    }
    // Sort the list using the Collections library
    Collections.sort(aList);
    // Iterate over the list using a for-each loop
    // Print each value on a second line
    for (String element : aList) {
      System.out.println(element);
    }

    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}