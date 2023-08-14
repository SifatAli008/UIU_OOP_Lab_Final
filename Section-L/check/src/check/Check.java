package check;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Check {

   
    public static void main(String[] args) {
       
       Movie m1= new Movie("Avatar",8.9);
       Movie m2= new Movie("Harry Potter 1",8.6);
       Movie m3= new Movie("Turning Red",8.2);
       Movie m4= new Movie("Spiderman 2",8.6);
       Movie m5= new Movie("Ironman 1",8.6);
       Movie m6= new Movie("HarryPotter 2",8.7);
         
       ArrayList <Movie> list = new ArrayList<>();
       list.add(m1);
       list.add(m2);
       list.add(m3);
       list.add(m4);
       list.add(m5);
       list.add(m6);
       
       
     Collections.sort(list, new Comparator<Movie>() {
    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.name.compareTo(m2.name);
    }
       });
    
             System.out.println(list);

     }      
        
    }
    

