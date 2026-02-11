public class Song {
    private String title;
    private int rating;
    
    public Song(String t, int r){
        this.title = t;
        this.rating = r;
    }
    public Song(String t) {
        this(t, 0);
    }

    public String getTitle(){
        return title;
    }
    public int getRating(){
        return rating;
    }
    public void setTitle(String t){
        this.title = t;
    }
    public void setRating(int r){
        this.rating = r;
    }
    public String toString() {
        return "Title: " + title + ", Rating: " + rating;
    }
    
    public boolean equals(Object s) {
     if (s instanceof Song) {
       Song otherSong = (Song) s;
       return title.equals(otherSong.title) && rating == otherSong.rating;
      }
    return false;
     }
}
