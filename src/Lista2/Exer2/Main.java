/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2.Exer2;
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
	
   private boolean pause1 = false;
   private boolean pause2 = false;
   
   
   private JTextField tfCount1;
   private JTextField tfCount2;
   private int CountRandom;
   
   private JSlider slider1 = new JSlider(JSlider.HORIZONTAL,FPS_MIN1, FPS_MAX1, FPS_INIT1);////////
	
	static final int FPS_MIN1 = 0;/////////
	static final int FPS_MAX1 = 1000;////////
	static final int FPS_INIT1 = 0;///////////  
	
	private JSlider slider2 = new JSlider(JSlider.HORIZONTAL,FPS_MIN2, FPS_MAX2, FPS_INIT2);////////
	
	static final int FPS_MIN2 = 0;/////////
	static final int FPS_MAX2 = 1000;////////
	static final int FPS_INIT2 = 0;///////////
	
   
   
   private int count1 = 0;
   private int count2 = 0;
   
   Random gerador = new Random();
 
  
   public Main() {
	   
      final Container cp = getContentPane();
      
      cp.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 40));
      

     
 
  	slider1.setPreferredSize(new Dimension(900, 25));
	slider1.setBounds(650, 35, 230, 45);
  
    slider1.setPaintLabels(true);	
	cp.add(slider1);
	
	
  	slider2.setPreferredSize(new Dimension(900, 25));////////////
	slider2.setBounds(650, 35, 230, 45);////////
      ////////
  
    slider2.setPaintLabels(true);		/////////
	cp.add(slider2);///////
	
      
      
      JButton btnStart1 = new JButton("3...2...1... VAI!");
      cp.add(btnStart1);
      btnStart1.addActionListener(new ActionListener() {
    	   @Override
         public void actionPerformed(ActionEvent evt) {////////thread1
    		   
    		   
    		   
            pause1 = false;
            
            // Cria thread
            Thread t1 = new Thread() {
               @Override
               public void run() {  
                  for (int i = 0; i < 1000000; ++i) {
                   
                     
                     CountRandom = gerador.nextInt(50);
                     count1 = CountRandom + count1;
                     if(count1 >= 1000 || pause2){
                    	 pause1 = true;
                    	 
                    	 break;
                    	
                     }/*
                     if (pause1 == true && pause2 == false) {
                    	 
                    	 cp.add(new JLabel("CORREDOR 1 GANHOU!"));
                    	 pause2 = true;
                    	 break;
                     }*/
                     slider1.setValue(count1);
                   
                     // sleep faz o delay e deixa o outro thread
                     try {
                        sleep(250);  
                     } catch (InterruptedException ex) {}
                  }
               }
            };
           
            t1.start();  
            
            
            
            
            Thread t2 = new Thread() {
                @Override
                public void run() { 
                   for (int i = 0; i < 1000000; ++i) {
                   
                      
                      CountRandom = gerador.nextInt(50);
                      count2 = CountRandom + count2;
                      if(count2 >= 1000 || pause1){
                     
                     	 pause2 = true;
                     	 
                     	 break;
                     	 
                      }/*
                      if (pause2 == true && pause1 == false) {
                     	 
                     	 cp.add(new JLabel("CORREDOR 2 GANHOU!"));
                     	 pause1 = true;
                     	 break;
                      }*/
                      slider2.setValue(count2);
                 
                      try {
                         sleep(250);  
                      } catch (InterruptedException ex) {}
                   }
                }
             };
            
             t2.start(); 
            
            
            
            
            
         }});
          
 


      
      
      
      
      
      
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("Corrida zica demais");
      setSize(1000, 300);
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