
public class Person {

    private static int count = 0;

    public Person() throws Exception {
        getInstance();
    }

    public static Person getInstance() throws Exception {
        if (count <2) {
            count++;
            System.out.println(" Object " + count + " created " );
            return new Person();
            
        } else {
            throw new Exception("Cannot create more than two instances of this class.");
        }
        
    }
}
