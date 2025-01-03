public class NumberPractice {
  public static void main(String[] args) {
    // Create a float with a negative value and assign it to a variable
    float floater = -7.77f;
    // Create an int with a positive value and assign it to a variable
    int winter = 12;
    // Use the modulo % operator to find the remainder when the int is divided by 3
    int modRemain = winter % 3;
    System.out.println("Remainder when divided by 3: " + modRemain);
    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.
    if (winter % 2 == 0) {System.out.println("Even");} 
      else {System.out.println("Odd");}
    // Divide the number by another number using integer division
    int newResult = winter / 5; // Example: divide winter by 5
    System.out.println("Integer division result: " + newResult);


    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}

