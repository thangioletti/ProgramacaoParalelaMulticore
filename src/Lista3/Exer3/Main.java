package Lista3.Exer3;

import java.awt.event.*;
import javax.swing.*;

public class Main {

	//inicia o main
	public static void main(String[] args) {
		
	
		 JFrame frame = new JFrame("");
		 FileChooser panel = new FileChooser();
		 
		 frame.addWindowListener(
		   new WindowAdapter() {
			   
		     public void windowClosing(WindowEvent e) {
		       System.exit(0);
		       }
		     }
		   );
		 frame.getContentPane().add(panel);
		 frame.setSize(450, 200);
		 frame.setVisible(true);

			
			
		}

	}
        