public class MediaLib {
  private Book book;
  private Movie movie;
  private Song song;

  private static int numEntries = 0;
  private static int numBooks = 0;
  private static int numMovies = 0;
  private static int numSongs = 0;  

  public void addBook(String t, String a) {
    this.book = new Book(t, a);
    numEntries++;
    numBooks++;
  }
  public void addMovie(String t, double r) {
    this.movie = new Movie(t, r);
    numEntries++;
    numMovies++;
  }
  public void addSong(String t) {
    this.song = new Song(t);
    numEntries++;
    numSongs++;
  }
  public String toString() {
    String info = "";
    if (book != null) {
      info += "Book: " + book + "\n";
    }
    if (movie != null) {
      info += "Movie: " + movie + "\n";
    }
    if (song != null) {
      info += "Song: " + song + "\n";
    }
    return info;
  }
  public int getNumEntries() {
    return numEntries;
  }
  public int getNumBooks() {
    return numBooks;
  }
  public int getNumMovies() {
    return numMovies;
  }
  public int getNumSongs() {
    return numSongs;
  }


}