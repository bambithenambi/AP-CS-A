/* 
 * AP CS A
 * PROJ 02: OOP ~ L.M.S.
 * SFHS ~ Mrs. Vollucci
 * 
 * Abhijit Nambiar
 * Steve Matthew
 * Period 7
 */

class Book {
  
  // instance variables (given) (Phase A)
  protected String title;
  protected String author;
  protected String genre;
  protected String ISBN;
  protected double fee = 0.50;
  
  
  // Fill in this constructor (Phase A)
  public Book(String title, String author, String genre, String ISBN) {
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.ISBN = ISBN;

  }
  
  // No setters (the attributes should stay the same)
  
  // Fill in the getters for all attributes (Phase A)
  
  public String getTitle()
  {
    return title;
  }
  
  public String getAuthor()
  {
    return author;
  }
  
  public String getGenre()
  {
    return genre;
  }
  
  public String getISBN()
  {
    return ISBN;
  }
  
    
  /* Fill in this method (Phase A)
   * Override the built-in equals() method for specific 
   * Book object functionality. 
   *
   * Two books are equal if they have the same ISBN #. 
   */
  public boolean equals(Book book)
  {
    return this.ISBN.equals(book.ISBN);
  }
  
  /* Fill in this method (Phase G)
   * Return the book fee.
   */
  public double getFee()
  {
    return this.fee; // replace this line
  }
  
  // Fill in the toString() method (Phase A)
  
  public String toString()
  {
    String res = "";
    res+= "{Title: "+title+"}\n";
    res+= "Author: "+author+"\n";
    res+= "Genre: "+genre+"\n";
    res+= "ISBN #: "+ISBN+"\n";
    return res;
  }
}
