/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2.Exer1;
import java.awt.*;
import java.awt.event.*;
import static java.lang.Thread.sleep;
import java.util.Random;
import javax.swing.*;
import javax.swing.JFrame;

/**
 *
 * @author Rafael Schmidt
 */
public class Main extends JFrame {
	
  
   
   private JTextField tfCount1;
 
   
   
   private int count1 = 0;
   
   Random gerador = new Random();
   
 
  
   public Main() {
	   
      Container cp = getContentPane();
      
      cp.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 8));
      
      
      count1 = gerador.nextInt(100);
      
      
      tfCount1 = new JTextField(count1 + "", 10);
      tfCount1.setEditable(false);
      cp.add(tfCount1);

 
      
      
      JButton btnStart1 = new JButton("Acrescenta");
      cp.add(btnStart1);
      btnStart1.addActionListener(new ActionListener() {
    	   @Override
         public void actionPerformed(ActionEvent evt) {////////thread1
            
            
            // Cria thread
            Thread t1 = new Thread() {
               @Override
               public void run() {  
                  for (int i = 0; i < 1000000; ++i) {
                     
                     tfCount1.setText(count1 + "");
                     ++count1;
                     // sleep faz o delay e deixa o outro thread
                     try {
                        sleep(250);  
                     } catch (InterruptedException ex) {}
                  }
               }
            };
           
            t1.start();  
            
         }});
          
      JButton btnStart2 = new JButton("Decrescenta");
      cp.add(btnStart2);
      btnStart2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {////thread2
            
             
            
             Thread t2 = new Thread() {
                @Override
                public void run() { 
                   for (int i = 0; i < 1000000; ++i) {
                  
                      tfCount1.setText(count1 + "");
                      --count1;
                 
                      try {
                         sleep(250);  
                      } catch (InterruptedException ex) {}
                   }
                }
             };
            
             t2.start(); 
             
         }
         
         
      });
 
     
      
      
      
      
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("Contadores");
      setSize(250, 200);
      setVisible(true);
      
   }
 
  
   public static void main(String[] args) {
     
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new Main();  
         }
      });
   }
}