package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Float.parseFloat;

public class calculator {
    public static void GUI() {

      JFrame calculator = new JFrame();
      calculator.setSize(300, 500);
      calculator.getContentPane().setLayout(new FlowLayout(3));

      JButton addiction = new JButton("Add");
      JButton subtraction = new JButton("Subtract");
      JButton division = new JButton("Divide");
      JButton multiplication = new JButton("Multiply");
      JTextField n1 = new JTextField(20);
      JTextField n2 = new JTextField(20);

      addiction.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          float n11 = parseFloat(n1.getText());
          float n22 = parseFloat(n2.getText());
          JOptionPane.showMessageDialog(null, "Result equals to: " + (n11+n22));
        }});

      subtraction.addActionListener((new ActionListener() {
        public void actionPerformed(ActionEvent e){
         float n11 = parseFloat(n1.getText());
         float n22 = parseFloat(n2.getText());
         JOptionPane.showMessageDialog(null, "Result equals to: " + (n11-n22));
        }
      }));

      division.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          float n11 = parseFloat(n1.getText());
          float n22 = parseFloat(n2.getText());
          JOptionPane.showMessageDialog(null, "Result equals to: " + (n11/n22));
        }
      });

      multiplication.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          float n11 = parseFloat(n1.getText());
          float n22 = parseFloat(n2.getText());
          JOptionPane.showMessageDialog(null, "Result equals to: " + (n11*n22));
        }
      });

    calculator.add(n1);
    calculator.add(n2);
    calculator.add(addiction);
    calculator.add(subtraction);
    calculator.add(multiplication);
    calculator.add(division);
    calculator.setVisible(true);



    };
}
