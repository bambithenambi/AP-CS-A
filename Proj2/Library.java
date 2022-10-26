/* 
 * AP CS A
 * PROJ 02: OOP ~ L.M.S.
 * SFHS ~ Mrs. Vollucci
 * 
 * Replace with Partner A's Full Name
 * Replace with Partner B's Full Name
 * Replace with Period #
 */

import java.util.Arrays;
import java.util.ArrayList;

class Library {
  // instance variables (given)
  private String name;
  private int numVisitors;
  private Catalogue myCatalogue;
  private ArrayList<Member> myMembers;
  private ArrayList<Double> memberFees;
  
  // Fill in this constructor (Phase D)
  public Library(String name)
  {
    this.name = name;
    this.numVisitors = 0;
    myMembers = new ArrayList<>();
    memberFees = new ArrayList<>();
    myCatalogue = new Catalogue();
  }
  
  // getters (given)
  public String getName()
  {
    return name;
  }
  
  public Catalogue getCatalogue()
  {
    return this.myCatalogue;
  }
  
  public ArrayList<Member> getMembers()
  {
    return myMembers;
  }

  public ArrayList<Double> getFees()
  {
    return memberFees;
  }

  public int getVisitorCount()
  {
    return numVisitors;
  }
  
  // Additional methods
  
  /* Fill in this method (Phase D)
   * Find a member by their email. 
   * Return null otherwise.
   */
  public Member findMemberByEmail(String email)
  {
    for (Member m: myMembers) {
      if (m.getEmail().equals(email)) {
        return m;
      }
    }
    return null;
  }
  
  /* Fill in this method (Phase D)
   * Add new member to the list along with no fees (0 dollars & 0 cents).
   * This library is now that member's library.
   * Emails are unique identifiers so a user may not be added with the same email.
   * Returns true only if successful as members can only be a member of one library.
   */
  
  public boolean addMember(Member newMember)
  {
    if (findMemberByEmail(newMember.getEmail())==null && newMember.addMemberToLibrary(this)) {
      myMembers.add(newMember);
      memberFees.add(0.0);
      return true;
    }
    return false;
  }
    
  /* Fill in this method (Phase D)
   * Increase visitor count.
   */
  public void increaseVisitorCount()
  {
    numVisitors++;
  }

  /* Fill in this method (Phase D)
   * Decrease visitor count.
   */
  public void decreaseVisitorCount()
  {
    numVisitors--;
  }

  /* Fill in this method (Phase E)
   * Updates the fee associated with member a specified amount and 
   * returns the new amount. If there is no member, return null.
   */
  
  public Double adjustFee(String email, Double amount)
  {
    Member m = findMemberByEmail(email);
    if (m==null) {
      return null;
    }
    double Newfee = findFee(email)+amount;
    memberFees.set(myMembers.indexOf(m), Newfee);
    return Newfee;
  }
  
  /* Fill in this method (Phase E)
   * Find the fee associated with member found via their email. 
   * If there is no member, return null.
  */
  public Double findFee(String email)
  {
    Member m = findMemberByEmail(email);
    if (m==null) {
      return null;
    }
    return memberFees.get(myMembers.indexOf(m));
  }
  
  
  /* Fill in this method (Phase E)
   * Find all members with a specified last name. 
   * If none, return an empty list.
   */
  public ArrayList<Member> findMembersByLastName(String lastName) {
    ArrayList<Member> res = new ArrayList<>();
    for (Member m: myMembers) {
      if (m.getLastName().equals(lastName)) {
        res.add(m);
      }
    }
    return res;
  }

  
  // toString() method (given)
  public String toString()
  {
    return  name + "[Number of visitors: " + numVisitors + "]";
  }
  
}
