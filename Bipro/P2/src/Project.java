
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Project extends JFrame {

    private Container c;
    private JButton btn;
    private JTextField tf1;
    private Font f;
    private ArrayList<String> list;
    private JPanel panel;
    private JLabel print;
    int i = 0;

    Project() {
        c = this.getContentPane();
        c.setLayout(null);

        JTextField tf1 = new JTextField("Search");
        tf1.setBounds(20, 30, 250, 30);
        //left    top    width   hight
        c.add(tf1);

        JButton btn = new JButton("Search");
        btn.setBounds(290, 30, 150, 30);
        c.add(btn);

        list = new ArrayList<>();
        printFile();

        f = new Font("Arial", Font.PLAIN, 14);
    

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.WHITE);

        for (i = 0; i < list.size(); i++) {
            print = new JLabel(list.get(i));
            print.setFont(f);
            panel.add(print);
        }

        JScrollPane scrollPane = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(50, 100, 450, 400);
        c.add(scrollPane);

        btn.addActionListener((ActionEvent ae) -> {
            String bookname = tf1.getText();

            try {
                File file = new File("Contact.txt");
                Scanner in = new Scanner(file);
                while (in.hasNext()) {
                    String name = in.next();
                    String id = in.next();
                    String AUTHER = in.next();
                    String YEAR = in.next();
                    
                    if (bookname.equalsIgnoreCase(name)) {
                        JFrame f1 = new JFrame();
                        JOptionPane.showMessageDialog(f1, "Found");
                    }
                    
                    else {
                        JFrame f1 = new JFrame();
                        JOptionPane.showMessageDialog(f1, "Not Found");
                    }

                }
            } catch (FileNotFoundException ex) {
                System.out.println(ex);
            }            
        });

    }

    public void printFile() {
        try {
            File file = new File("Contact.txt");
            Scanner in = new Scanner(file);
            while (in.hasNext()) {
                String name = in.next();
                String id = in.next();
                String AUTHER = in.next();
                String YEAR = in.next();
                String str = name + "  " + id + "  " + AUTHER + "   " + YEAR + "   ";
                list.add(str);
            }

            Collections.sort(list, new Comparator<String>() {

                @Override
                public int compare(String s1, String s2) {
                    String YEAR1 = s1.split("  ")[0];
                    String YEAR2 = s2.split("  ")[0];
                    return YEAR1.compareTo(YEAR2);
                }
            });
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        
        Project frame = new Project();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Book Shop");
        frame.setSize(600, 600);
        
    }

}
