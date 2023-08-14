package check;

public class Movie {
      String name;
    double imdbRating ;

    public Movie(String name, double imdbRating) {
        this.name = name;
        this.imdbRating = imdbRating;
    }
    
      @Override
    public String toString(){
    return name+" "+imdbRating+" ";
    } 
}
