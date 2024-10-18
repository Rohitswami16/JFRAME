package gui;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField input1Field, input2Field, resultField;
    private JButton addButton, subButton, mulButton, divButton;

    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SimpleCalculator frame = new SimpleCalculator();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    
    public SimpleCalculator() {
    	setAutoRequestFocus(false);
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 624, 428);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        
        contentPane.setLayout(new GridLayout(5, 2, 5, 5));  
        
        JLabel label1 = new JLabel("First Number:");
        label1.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 16));
        contentPane.add(label1);
        input1Field = new JTextField();
        contentPane.add(input1Field);
        
        JLabel label2 = new JLabel("Second Number:");
        label2.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 16));
        contentPane.add(label2);
        input2Field = new JTextField();
        contentPane.add(input2Field);
        
        JLabel resultLabel = new JLabel("Result :");
        resultLabel.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 16));
        contentPane.add(resultLabel);
        resultField = new JTextField();
        resultField.setBackground(new Color(255, 255, 255));
        resultField.setEditable(false);  
        contentPane.add(resultField);
        
        addButton = new JButton("Add");
        addButton.setFont(new Font("Georgia", Font.BOLD, 16));
        contentPane.add(addButton);

        subButton = new JButton("Subtract");
        subButton.setFont(new Font("Georgia", Font.BOLD, 16));
        contentPane.add(subButton);

        mulButton = new JButton("Multiply");
        mulButton.setFont(new Font("Georgia", Font.BOLD, 16));
        contentPane.add(mulButton);

        divButton = new JButton("Divide");
        divButton.setFont(new Font("Georgia", Font.BOLD, 16));
        contentPane.add(divButton);

        addButton.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
                calculateResult("add");
            }
        });

        subButton.addActionListener(new ActionListener() {
  
            public void actionPerformed(ActionEvent e) {
                calculateResult("subtract");
            }
        });

        mulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateResult("multiply");
            }
        });

        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateResult("divide");
            }
        });
    }

    private void calculateResult(String operation) {
        try {

            double num1 = Double.parseDouble(input1Field.getText());
            double num2 = Double.parseDouble(input2Field.getText());
            double result = 0;

            
            switch (operation) {
                case "add":
                    result = num1 + num2;
                    break;
                case "subtract":
                    result = num1 - num2;
                    break;
                case "multiply":
                    result = num1 * num2;
                    break;
                case "divide":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        resultField.setText("Error: Division by zero");
                        return;
                    }
                    break;
            }

          
            resultField.setText(String.valueOf(result));

        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input");
        }
    }
}
