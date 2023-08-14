package p2;

public class GoldenFiveStudent extends Student{
    
    public GoldenFiveStudent(String name, int tutitionFees) {
        super(name, tutitionFees);
    }
    
     void printBill(){
        System.out.println("Name : "+name);
        double waiver = tutitionFees *0.5;
        System.out.println("Fees : "+tutitionFees);
         System.out.println("Waiver : 50%");
    }  
    
}
