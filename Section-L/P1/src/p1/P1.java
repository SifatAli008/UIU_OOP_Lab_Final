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
                Scanner lineScanner = new Scanner(line);
                while (lineScanner.hasNext()) {
                    if (lineScanner.hasNextInt()) {
                        int number = lineScanner.nextInt();
                        System.out.println(number);
                        fw.write(number + "\n");
                        
                    } else if (lineScanner.hasNextDouble()) {
                        
                        double number = lineScanner.nextDouble();
                         System.out.println(number);
                        fw.write(number + "\n");
                    } else {
                        lineScanner.next();
                    }
                }
                fw.write(System.lineSeparator());
                lineScanner.close();
            }
            in.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
