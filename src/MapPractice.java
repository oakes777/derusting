import java.util.HashMap;
import java.util.Map;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> mappy = new HashMap<>();
    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    mappy.put("kitties", 3);
    mappy.put("doggies", 4);
    mappy.put("fishies", 11);
    // Get the value associated with a given key in the Map
    System.out.println(mappy.get("fishies"));
    // Find the size (number of key/value pairs) of the Map
    System.out.println(mappy.size());
    // Replace the value associated with a given key (the size of the Map shoukld not change)
    mappy.replace("kitties", 5);
    // Check whether the Map contains a given key
    boolean qKey = mappy.containsKey("doggies");
    System.out.println(qKey);
    // Check whether the Map contains a given value
    boolean qValue = mappy.containsValue(2);
    System.out.println(qValue);
    // Iterate over the keys of the Map, printing each key
    for (String elementKey : mappy.keySet()) {
      System.out.println(elementKey);
    }
    // Iterate over the values of the map, printing each value
    for (Integer elementValue : mappy.values()) {
      System.out.println(elementValue);
    }
    // Iterate over the entries in the map, printing each key and value
    // Map.Entry<String, Integer> entry I had to ask for help from chatGPT on this part
    for (Map.Entry<String, Integer> entry : mappy.entrySet()) {
      System.out.println("Key: " + entry.getKey() + ", Value: " +
      entry.getValue());
    }
    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
