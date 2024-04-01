package Java1.lesson1_8.Homework;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowApp extends JFrame {
    private int value;
    private JLabel labelTwo;

    private int maxValue = 10;

    public WindowApp() {
        setTitle("Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 500, 300);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("The window has closed");
            }
        });
        Font font = new Font("Arial", Font.BOLD, 30);
        Font font2 = new Font("Arial", Font.BOLD, 10);
        JLabel label = new JLabel(String.valueOf(value));
        label.setFont(font);
//        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setBounds(235, 110, 50, 50);
        add(label);


        setLayout(null);


        JButton decrementButton = new JButton("<");
        JButton incrementBUtton = new JButton(">");
        JButton incrementButtonUP = new JButton(">>");
        JButton decrementButtonDown = new JButton("<<");
        decrementButton.setFont(font);
        incrementBUtton.setFont(font);
        incrementButtonUP.setFont(font);
        decrementButtonDown.setFont(font);
        incrementButtonUP.setBounds(405, 0, 80, 265);
        incrementBUtton.setBounds(325, 0, 80, 265);
        decrementButtonDown.setBounds(0, 0, 80, 265);
        decrementButton.setBounds(80, 0, 80, 265);
        add(incrementBUtton);
        add(decrementButton);
        add(incrementButtonUP);
        add(decrementButtonDown);
        labelTwo = new JLabel();
        labelTwo.setFont(font2);

        labelTwo.setBounds(235, 80, 50, 50);
        add(labelTwo);
        decrementButtonDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = value - 10;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });
        incrementButtonUP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = value + 10;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });


        incrementBUtton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });
        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                label.setText(String.valueOf(value));
                validateRange();

            }
        });





        setVisible(true);


    }

    private void validateRange() {
        if (Math.abs(value) > maxValue) {
            if (Math.abs(value) > (maxValue + 50)) {
                labelTwo.setText("Crazy?");
            } else {
                labelTwo.setText("OVER");
            }


        } else {
            labelTwo.setText("");
        }


    }

    public static void main(String[] args) {
        new WindowApp();


    }


}


