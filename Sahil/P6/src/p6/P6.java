
package p6;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class P6 extends JFrame {
    private Container c;
    private JTextField JF;
    private JButton count, clear;
    int num=0;
 
    P6(){
    c=this.getContentPane();
    c.setLayout(null);
    
    JF = new JTextField();
    JF.setBounds(90,20,220,40);
     c.add(JF);

     count= new JButton("Count");
     count.setBounds(90,80,100,40);
     c.add(count);
     
     clear= new JButton("Count");
     clear.setBounds(230,80,100,40);
     c.add(clear);
        ActionListener ActionEvent;
     
     count.addActionListener((ActionEvent a)->{
      num++;
       JF.setText(Integer.toString(num));
         System.out.println(num);
    });
     
     clear.addActionListener((ActionEvent a)->{
         num=0;
       JF.setText("0");
    });
     
    
    }
    public static void main(String[] args) {
    P6 frame = new P6();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420,220);
    }
    
}
