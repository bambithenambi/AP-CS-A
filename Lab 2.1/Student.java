/* Abhijit Nambiar
 * Nathan Lo
 * Period 7
 *   
 * Make sure to fill in the Student class
 * & test code as you implement methods
 * in the StudentTester.
 *
 */

import java.util.*;


public class Student {

	// Instance vars typically are set to private
	private String firstName;
	private String lastName;
	private int gradeLevel;
	/* Initialize other instance variables here.
	 * As you write the class code, add them as needed.
     * You should initialize 3 others (2 ArrayLists & one double).
     */
	private ArrayList<String> subjects = new ArrayList<>();
	private ArrayList<Double> grades = new ArrayList<>();;	
	private double GPA;
	// Fill in the Student constructor below.
	public Student(String first, String last, int grade, String favSubject, double curGrade) {
		// Take the first 3 input parameters & set them to the instance fields
		// The first one is dne for you.
		firstName = first;
		lastName = last;
		gradeLevel = grade;
		
		/* For the last 2 input parameters:
		 * Add favSubject to the subjects AL.
		 * Add curGrade to the grades AL.
		 */
		subjects.add(favSubject);
		grades.add(curGrade);
	}

	public String getFirstName() {
		return firstName;
	}
	// Create other getters for the following: lastName, gradeLevel, & GPA
	public String getLastName() {
		return lastName;
	}
	public int getGradeLevel() {
		return gradeLevel;
	}
	public double getGPA() {
		return GPA;
	}
	
	// Create a setter for the GPA
	public void setGPA(double newGPA) {
		this.GPA = newGPA;
	}

	// Fill in the addClass method below such that the subject & grade
	// are added to their corresponding ArrayLists.
	public void addClass(String subject, double grade) {
		subjects.add(subject);
		grades.add(grade);
	}

	/* Fill in the dropClass method below such that the subject & grade
	 * are removed from their corresponding ArrayLists.
	 * 
	 * Hint: The subject & grade should be in the same position in
	 * each ArrayList. Use this in writing your iterative loop.
	 */
	public void dropClass(String subject, double grade) {
		for (int i=0; i<subjects.size(); i++) {
			if (subjects.get(i).equals(subject)) {
				subjects.remove(i);
				grades.remove(i);
			}
		}
	}

	/* Fill in the updateGrade method below such that the inputted grade
	 * is updated for the subject in the subjects ArrayList.
	 * 
	 * Hint: The subject & grade should be in the same position in
	 * each ArrayList. Use this in writing your iterative loop.
	 */
	public void updateGrade(String subject, double grade) {
		for (int i=0; i<subjects.size(); i++) {
			if (subjects.get(i).equals(subject)) {
				grades.set(i, grade);
			}
		}
	}

	/* Fill in the getGradeRecord() method below such that all subjects
	 * with their corresponding grades are returned in a readable format.
	 * 
	 * Hint: The subject & grade should be in the same position in
	 * each ArrayList. Use this in writing your iterative loop.
	 * 
	 * Format Example:
	 * AP CS A: 95.2
	 * AP CS Principles: 97.5
	 * AP Calculus BC: 90.12
	 * (new line)
	 * Hint: Escape sequences are your friend.
	 */
	public String getGradeRecord() {
		String gradeRecord = "";
		for (int i=0; i<subjects.size(); i++) {
			gradeRecord += (subjects.get(i) + ": " + grades.get(i) + "\n");
		}
		return gradeRecord;
	}

	/* Fill in the toString() method below such that the Student's
	 * profile is returned in a readable format.
	 * 
	 * Hint: Maintain abstraction! Use several getters in your
	 * implementation for toString().
	 * 
	 * Format Example:
	 * Name: Ada Lovelace
	 * Grade Level: 12
	 * GPA: 4.0
	 * Grade Record: 
	 * AP CS A: 95.2
	 * AP CS Principles: 97.5
	 * AP Calculus BC: 90.12
	 * (new line)
	 * Hint: Escape sequences are your friend.
	 */
	public String toString() {
		String profile = "";
		profile += "Name: "+getFirstName() +" "+ getLastName() + "\n";
		profile += "Grade Level: "+getGradeLevel() + "\n";
		profile += "GPA: "+getGPA()+"\n";
		profile += "Grade Record:\n"+getGradeRecord();
		return profile;
	}
}