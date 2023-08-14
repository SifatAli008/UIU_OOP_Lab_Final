package p1;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {
        try {
            File fr = new File("Sample.txt");
            Scanner in = new Scanner(fr);
            FileWriter fw = new FileWriter("Output.txt",true);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                Scanner ls = new Scanner(line);
                while (ls.hasNext()) {
                    if (ls.hasNextInt()) {
                        int number = ls.nextInt();
                        System.out.println(number);
                        fw.write(number + "\n");
                        
                    } else if (ls.hasNextDouble()) {
                        
                        double number = ls.nextDouble();
                         System.out.println(number);
                        fw.write(number + "\n");
                    } else {
                        ls.next();
                    }
                }
                fw.write(System.lineSeparator());
                ls.close();
            }
            in.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
