/* Abhijit Nambiar
 * Nathan Lo
 * Period 7
 *  
 * Make sure you save this in the same folder 
 * as Student.java in order to be able to
 * test your code.
 */

class StudentTester {
  public static void main(String[] args) {
    
    // Create the ada object using the 5-argument constructor
    Student ada = new Student("ada", "lovelace", 11, "science", 95.9);
    // Set ada's GPA to 4.0
    ada.setGPA(4.0);
    // Get ada's GPA
    ada.getGPA();
    // Get ada's last name
    ada.getLastName();
    // Add AP CS Principles to ada's class list. She currently has a 97.5.
    ada.addClass("AP CS Principles", 97.5);
    // Add AP Calculus BC to ada's class list. She currently has a 90.12.
    ada.addClass("AP Calculus BC", 90.12);
    // Add AP Literature to ada's class list. She currently has an 89.23.
    ada.addClass("AP Literature", 89.23);
    // Drop ada's AP Literature class
    ada.dropClass("AP Literature", 89.23);
    // Print out the ada object. This will test your toString() method...
    // ... without you having to call on the toString() method!
    System.out.println(ada);

    // Create a Student object for you!
    Student nathan = new Student("nathan", "lo", 11, "religion", 99.9);
    // Set your GPA (or your dream GPA...)
    nathan.setGPA(4.8);
    // Get your GPA
    nathan.getGPA();
    // Add a course to your class list with a grade of your choice.
    nathan.addClass("AP Calculus AB", 98.8);
    // Add another course to your class list with a grade of your choice.
    nathan.addClass("Physics", 92.8);
    // Print out your Student object
    System.out.println(nathan);

    // Create a Student object for your partner!
    Student abhijit = new Student("abhijit", "nambiar", 11, "AP Calculus BC", 98.9);
    // Set your GPA (or your dream GPA...)
    abhijit.setGPA(4.6);
    // Get your GPA
    abhijit.getGPA();
    // Add a course to your class list with a grade of your choice.
    abhijit.addClass("AP Psychology", 100.0);
    // Add another course to your class list with a grade of your choice.
    abhijit.addClass("Brit Lit", 96.8);
    // Print out your Student object
    System.out.println(abhijit);
  }
}
