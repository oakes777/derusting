import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String stringy = "apple";
    // Find the length of the string
    System.out.println(stringy.length());
    // Concatenate (add) two strings together and reassign the result
    String kitty = "cinder" + "block";
    // Find the value of the character at index 3
    System.out.println(kitty.charAt(3));
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    boolean sub = kitty.contains("abc");
    System.out.println(sub);
    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < kitty.length(); i++) {
      System.out.println(kitty.charAt(i));
    }
    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> listy = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
    listy.add("kitty");
    listy.add("doggy");
    listy.add("birdy");
    listy.add("horsy");
    listy.add("piggy");
    listy.add("donkey");
    listy.add("cow");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joined = String.join(",", listy);
    // Check whether two strings are equal
    boolean equal = kitty.equals(joined);
    System.out.println(equal);
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
