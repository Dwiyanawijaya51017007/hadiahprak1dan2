/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hadiahprak2;

import java.awt.event.*;

import javax.swing.*;

public class Hadiahprak2 implements ActionListener {

    private static void createAndSgowGUI() {

        // make frame..

        JFrame frame = new JFrame("I am a JFrame");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setBounds(20, 30, 300, 100);

        frame.getContentPane().setLayout(null);

        // make a button..

        JButton butt = new JButton("Click Me");

        frame.getContentPane().add(butt);

        butt.setBounds(20, 20, 200, 20);

        

        // instantiate an application object

        Hadiahprak2 app = new Hadiahprak2();

        // make the label

        app.label = new JLabel("Nama Tidak Terdeteksi");

        app.label.setBounds(20, 40, 200, 20);

        frame.getContentPane().add(app.label);

        

        // set the application object to be the thing which

        // listens to the button

        butt.addActionListener(app);

        frame.setVisible(true);

    }

        public void actionPerformed(ActionEvent e) {

         

        // Ini akan dieksekusi ketika button diklik

        clickCount+=2;

        label.setText("Click = "+clickCount);

    }

        public static void main(String[] args) {

            // Memulai Swing GUI

            SwingUtilities.invokeLater(new Runnable() {

                public void run() {

                    createAndSgowGUI();

            }

        });

    }

// Application object fields

int clickCount=5;

JLabel label;  

}