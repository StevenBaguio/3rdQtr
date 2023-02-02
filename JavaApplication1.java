/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.*;
import java.awt.*;


/**
 *
 * @author PHOTON
 */
public class JavaApplication1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Exercise 11");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 380);
        frame.setVisible(true);
        
        JButton button = new JButton("Next");
        button.setSize(200,100);
        frame.add(button);
        

        
        Subject math = new Subject("Math", "math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "computer science.png", 1, 1.5);
        Subject displayedSubject = math;
        
        
        displayedSubject = math;
        

        JLabel label = new JLabel();
        frame.add(label);
        
        label.setText(displayedSubject.getName() + "\n" + String.valueOf(displayedSubject.getUnits()) + "\n" + String.valueOf(displayedSubject.getGrade()));

    }
    
}
