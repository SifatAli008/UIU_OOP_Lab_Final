import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
         
        int num = -5;
        
        try {
            testMethod(num);
        } catch (IllegalParameterException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
     
        public static void testMethod(int num) throws IllegalParameterException {
        if (num < 0) {
            throw new IllegalParameterException("Number cannot be negative");
        } else if (num % 3 == 0) {
            System.out.println(num + " is a multiple of 3");
        } else {
            System.out.println(num + " is not a multiple of 3");
        }
    }
        
}
