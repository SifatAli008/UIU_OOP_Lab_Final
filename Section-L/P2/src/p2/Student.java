package p2;

public class Student {
  String name;
 double  tutitionFees; 

    public Student(String name, int tutitionFees) {
        this.name = name;
        this.tutitionFees = tutitionFees;
    }
    
    void printBill(){
        System.out.println("Name : "+name);
        System.out.println("Fees : "+tutitionFees);
    }    
}
