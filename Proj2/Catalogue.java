/* 
 * AP CS A
 * PROJ 02: OOP ~ L.M.S.
 * SFHS ~ Mrs. Vollucci
 * 
 * Replace with Partner A's Full Name
 * Replace with Partner B's Full Name
 * Replace with Period #
 */

import java.util.ArrayList;

class Catalogue {
  
  // Instance variables (given)
  private ArrayList<Book> books = new ArrayList<Book>();
  private ArrayList<Integer> bookCounts = new ArrayList<Integer>();
  
  // Write the constructor - no inputs needed (Phase B)
  public Catalogue() {

  }
  // Write getters for both ArrayLists (Phase B)
  // Create getBooks() here
  public Arraylist<Book> getBooks() {
    return books;
  }  
  // Create getBookCounts() here
  public Arraylist<Integer> getBookCounts() {
    return bookCounts;
  }
  /* Fill in this method (Phase B)
   * Adjust the quantity available of a Book by a specified amount.
   * Return true if the action was successful and false if not.
   */
  
  public boolean adjustQuantity(Book book, int amount)
  {
   	for (int i=0; i<this.books.size(); i++) {
      if(this.books.get(i).equals(book)) {
        this.bookCounts.set(i, this.bookCounts.get(i)+amount);
        return true;
      }
    }
    return false;
  }
  
  /* Fill in this method (Phase B)
   * Add a Book to the list.
   */
  
  public void addBook(Book book)
  {
    if(!adjustQuantity(book, 1)) {
      books.add(book);
      bookCounts.add(1);
    }
  }
  
  /* Fill in this method (Phase B)
   * Find Books from the list based on the ff. categories:
   * (1) title, (2) author, (3) genre, (4) ISBN 
   * in addition to the user's query.
   *
   * Edit this method (Phase H)
   * Handle case for Textbooks with multiple authors.
   */
  
  public ArrayList<Book> findBook(int category, String query)
  {
    ArrayList<Book> res = new ArrayList<Book>();
    for(Book b: this.books) {
      if(category==1){
        if(b.getTitle().equals(query)){
          res.add(b);
        }
      }
      else if (category==2){
        if(b.getAuthor().equals(query) || b.getAuthor().contains(query)){
          res.add(b);
        }
      }
      else if (category==3){
        if(b.getGenre().equals(query)){
          res.add(b);
        }
      }
      else if (category==4){
        if(b.getISBN().equals(query)){
          res.add(b);
        }
      }
    }
    if (res.isEmpty()) {
      System.out.println("No results found.");
    }
    return res;
    
  }
  public String toString() {
    String res = "* BOOK CATALOGUE: *";
    for(int i=0; i<books.size(); i++) {
      res+=books.get(i).toString()+"Quantity: "+bookCounts.get(i)+"\n";
      if(i!=books.size()-1) {
        res+=",\n"
      }
    }
    return res; 
  }
  
  /* Fill in this method (Phase F)
   * Pull out the available quantity of books via a specified book.
   * If the book is not found, return -1.
   */
  public int getBookCount(Book book)
  {
    ArrayList<Book> res = findBook(4, book.getISBN());
    if (res.isEmpty()) {
      return -1;
    }
    return bookCounts.get(books.indexOf(res.get(0)));
  }
  
  /* Write this function (Phase I)
   * Return a list of all Books mentioning a specified word in the title.
   * You may assume that keyword is separated by a space from other words.
   */
  public ArrayList<Book> findKeywordBook(String keyword)
  {
    return null; // replace this line
  }
  
  // Fill in the toString() method (Phase B)
  public String toString()
  {
    // Return catalogue with book quantity included for each entry
    // Your code here
    return null; // replace this line
  }
}
