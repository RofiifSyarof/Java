package Semester_2.Pemrograman_2.Minggu_Ke8;

/*
 * Muhammad Rofiif Syarof Nur Aufaa
 * 22537141014
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RofiifMyGUI implements ActionListener {
    public static void main(String[] args) {
        RofiifMyGUI gui = new RofiifMyGUI();
    }

    // fields
    private JFrame frame;
    private JTextField text;
    private JButton button;
    private JLabel cLabel, fLabel;

    public RofiifMyGUI() {
        // "contaniner" - holds the other components
        frame = new JFrame();
        frame.setTitle("My first frame");
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        text = new JTextField(12);

        button = new JButton();
        button.setText("Convert");
        button.addActionListener(this);

        cLabel = new JLabel("Celsius");
        fLabel = new JLabel("Fahrenheit");

        frame.setLayout(new GridLayout(2, 2));
        frame.add(text);
        frame.add(cLabel);
        frame.add(button);
        frame.add(fLabel);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        double tempC = Double.parseDouble(text.getText());
        double tempF = 9 * tempC /  5 + 32;
        fLabel.setText("Fahrenheit: " + tempF);
    }
}
