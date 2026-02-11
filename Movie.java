public class Movie {
    private String title;
    private double rating;
    
    public Movie(String t, double r){
        this.title = t;
        this.rating = r;
    }
    public String getTitle(){
        return title;
    }
    public double getRating(){
        return rating;
    }
    public void setTitle(String t){
        this.title = t;
    }
    public void setRating(double r){
        this.rating = r;
    }
    public String toString() {
        return "Title: " + title + ", Rating: " + rating;
    }
    
    public boolean equals(Object m) {
     if (m instanceof Movie) {
       Movie otherMovie = (Movie) m;
       return title.equals(otherMovie.title) && rating == otherMovie.rating;
      }
    return false;
     }
    }

