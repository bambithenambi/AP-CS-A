/* 
 * AP CS A ~ Mrs. Vollucci
 * Lab 1.2B: Control & Strings
 */
import java.util.Arrays;
import java.util.Comparator;
class Lab1_2PartB {
  public static void main(String[] args) {
    
    /* 
     * Put your solutions for Exercise 0 here.
     *
     * Also, write your own tests here. You should
     * write a minimum of 2 tests per question.
     */
    System.out.println("S");
    System.out.println("F");
    System.out.println("H");
    System.out.println("S");

    System.out.print("S");
    System.out.println("F");
    System.out.print(" H");
    System.out.println("S");

    System.out.println("S");
    System.out.print("F");
    System.out.println("H");
    System.out.println("S");
    
    Ex1(5);
    Ex1(6);
    System.out.print(Ex2(2));
    System.out.print(Ex2(3));
    Ex3(4, 2);
    Ex3(6, 4);
    System.out.println(Ex4("Rivet", "Cow", "Farm"));
    System.out.println(Ex4("abcde", "ab", "a"));
    System.out.println(Ex5(5, 7, 6));
    System.out.println(Ex5(1, 2, 3));
    System.out.println(Ex5(6, 2, 3));
  }

  /*
   * Exercise 0: Royal Prints
   *
   * Use println &/or print as needed to get the 
   * following outputs. 
   *
   * Be sure you understand the distinction
   * between the 2 types of prints. Test it out in 
   * the main() method if you are unsure.
   *
   * IMPORTANT: Each letter should have print() or 
   * println() - i.e. do not use one print to 
   * print out 2 letters at the same time.
   *
   * (i) S
   *     F
   *     H
   *     S
   *
   *
   * (ii) SF
   *       HS
   *
   * (iii) S
   *       FH
   *       S
   */

  /*
   * Exercise 1: Print Triangle of Stars
   *
   * Write a method called triStars which PRINTS
   * out a triangle design where the number of
   * stars in a row is its row number.
   *
   * @param numRows The number of rows in the 
   *           triangle design
   * @return (none)  This method prints the
   *           triangle design
   *
   * REQUIREMENT: You must use some form of
   * iterative loop in your implementation.
   *
   * Example of input, output:
   * When numRows is equal to 5, the
   * design printed out looks like this:
   *              *
   *              **
   *              ***
   *              ****
   *              *****
   */
  public static void Ex1(int numRows) {
    for(int i=1; i<=numRows; i++) {
      for(int j=0; j<i; j++) {
        System.out.print("*");
      }
      System.out.println();
    } 
  }
 
  /*
   * Exercise 2: Return Triangle of Stars
   *
   * Write a method called fullTriangle which 
   * RETURNS a triangle design where the number 
   * of stars in a row is its row number.
   *
   * @param numRows  The number of rows in the 
   *              triangle design
   * @return triangle   This method returns the
   *              triangle design
   *
   * REQUIREMENT: You must use some form of
   * iterative loop in your implementation.
   *
   * Example of input, output:
   * When numRows is equal to 5, the
   * design returned looks like this:
   *              *
   *              **
   *              ***
   *              ****
   *              *****
   *
   * Hint: "\n" is an escape sequence which lets
   *     you add a new line to a String. Look
   *     up documentation on how to use it.
   */
  public static String Ex2(int numRows) {
    String pain = new String();
    for(int i=1; i<=numRows; i++) {
      for(int j=0; j<i; j++) {
        pain+="*";
      }
      pain+="\n";
    }
    return pain; 
  }
  /*
   * Exercise 3: Simple Calculator [LEC 1.1 Connection]
   *
   * Create a method which prints out the sum, product, 
   * difference, quotient, & remainder of two integer 
   * inputs num1 & num2. The behavior should be as follows:
   *
   * @param    First input integer
   * @param   Second input integer
   * @return   String of operation results
   * 
   * Example: Inputs: 4, 2
   * Output:
   * Sum of 4, 2: 6
   * Product of 4, 2: 8
   * Difference of 4, 2: 2
   * Quotient of 4, 2: 2 // You can assume no ZeroDivisionError.
   * Remainder of 4, 2: 0 
   */
  public static void Ex3(int a, int b) {
    int sum = a+b;
    int product = a*b;
    int difference = a-b;
    int quotient = a/b;
    int remainder = a%b;
    System.out.println("Sum of "+ a + ", "+ b +": "+sum);
    System.out.println("Product of "+ a + ", "+ b +": "+product);
    System.out.println("Difference of "+ a + ", "+ b +": "+difference);
    System.out.println("Quotient of "+ a + ", "+ b +": "+quotient);
    System.out.println("Remainder of "+ a + ", "+ b +": "+remainder);
  }
  /*
   * Exercise 4: Shortest to Longest
   *
   * Write a method which takes 3 Strings as input
   * and returns a single concatenated String
   * of the 3 inputs sorted from shortest to
   * longest & separated by commas.
   *
   * Look up String method documentation as
   * needed.
   *
   * @param    First input String
   * @param    Second input String
   * @param    Third input String
   * @return   A single String of the 3 inputs
   *        separated by commas sorted from
   *        shortest -> longest String
   *
   * Example input: "Donald", "Sora", "Goofy"
   * Example output: "Sora, Goofy, Donald"
   * Explanation:    Sora is 4 letters long, Goofy
   * is 5 letters long, & Donald is 6 letters long.
   */
  public static String Ex4(String a, String b, String c) {
    String listOfPain[] = new String[3];
    listOfPain[0] = a;
    listOfPain[1] = b;
    listOfPain[2] = c;
    Arrays.sort(listOfPain, Comparator.comparingInt(String::length));
    return listOfPain[0]+", "+listOfPain[1]+", "+listOfPain[2];
  }
  /*
   * Exercise 5: Maxed Out
   *
   * Given three input integer values, return the 
   * maximum value. Use conditionals.
   * 
   * If all 3 are the same, then simply return one 
   * of the inputs.
   *
   * Example inputs: 5, 6, -9
   * Example output: 6
   */
  public static int Ex5(int a, int b, int c) {
    if (a==b && b==c) {
      return a;
    }
    if (a>b) {
      if (a>c) {
        return a;
      }
      else {
        return c;
      }
    }
    else if (b>c) {
      return b;
    }
    else {
      return c;
    }
  }
}