import java.util.ArrayList;

/* CSA: PROJ 01: Activity 0
 *
 * 1. Edit code in Sublime.
 * 2. Save your own copy somewhere accessible (i.e. Desktop).
 * 3. Run code in Terminal:
 * - Navigate to correct directory: cd Desktop
 * - Compile code: javac <file name>
 * - Run code: java <class name>
 * 4. Analyze output in the Terminal. 
 * 5. Edit code & save all changes.
 * 
 * Repeat steps 3-5 as needed.
 * Remember: Save each time you make changes before running it.
 */

// There are 7 problems.

class UsingStrChar {
  public static void main(String[] args) {
    
    /*
     * SECTION I: Casting & ASCII
     * Use casting in the following problems.
     * Reference the ASCII table in the PROJ 01 
     * WD 01 slides or find one online.
     */
    
    // 1. Get the ASCII value of 'Z'
    int bigz = (int) 'Z';
    System.out.println(bigz);
    // 2. Get the ASCII value of 'z'
    int lilz = (int) 'z';
    System.out.println(lilz);
    // 3. How many characters back is 'r' from 'o'?
    int back = (int) ('r' - 'o');
    System.out.println(back);
    // 4. Show that 'Z' is 25 characters back from 'A'
    //    by adding a letter to an int.
    System.out.println((char) (25+'A'));
    
    
    /*
     * SECTION II: Escape Sequences
     */
    
    // 1. Use escape sequences to print out the haiku on new lines 
    //    using only one print statement:
    // 		Character and char
    // 		So similar yet different
    //		Object, primitive
    System.out.println("Character and char\nSo similar yet different\nObject, primitive");
    // 2. Use escape sequences to print out the following
    //    as shown (with quotes, tabs, & new lines) using
    //    only one print statement:
    //    "Essential Haiku"
    //	  		Edited by: Robert Hass
    // 	  		A poet's must-read
    System.out.println("\"Essential Haiku\"\n\tEdited by: Robert Hass\n\tA poet's must-read");
    System.out.println(flipper("Bro is insane"));

  }
  
    /*
     * SECTION III: Character methods
     */
    
    // Create a method (& test it) which takes in a String
    // and converts every uppercase to lowercase & vice
    // versa. Return the modified String.
  public static String flipper(String s) {
    String res = "";
    for(int i=0; i<s.length(); i++){
      char c = s.charAt(i);
      if (c<=90 && c>=65) {
        res+=(char) (c+32);
      }
      else if (c<=122 && c>=97) {
        res+=(char) (c-32);
      }
      else {
        res+=c;
      }
    }
    return res;
  }
  public static int canYouEven(ArrayList<Integer> problemSet) {
    int count = 0;
    for (int brick: problemSet){
      if (brick%2==0) {
        count++;
      }
    }
    return count;
  }
}