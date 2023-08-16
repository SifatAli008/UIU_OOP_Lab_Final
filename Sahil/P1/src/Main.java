public class Main {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        
        if(s1==s2){// equal, Becase of == the s1 value commpering with s2 object name
            System.out.println("equal");
        }
        else{
            System.out.println("Not Equal");
        }
        
        if(s1==s3){//not equal, Becase of == the s1 value commpering with s3 object name.
                   // if  you use,equal method it will print s1  and s3 equal.
            System.out.println("equal");
        }
        
        else{
            System.out.println("Not Equal");
        }
    }
  
}
