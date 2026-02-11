
public class Book
{
  private String title;
  private String author;
  
  /*** Constructor ****/
  public Book(String t, String a)
  {
    this.title = t;
    this.author = a;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    this.title = t;
  }

  public void setAuthor(String a) {
    author = a;
  }
  public String toString() {
    return "Title: " + title + ", Author: " + author;
  }
  public boolean equals(Object b) {
    if (b instanceof Book) {
      Book otherBook = (Book) b;
      return title.equals(otherBook.title) && author.equals(otherBook.author);
    }
    return false;
  }
  
  }
