package ICSFinalProject;

import java.awt.*;

import javax.swing.JFrame;

public class calculatorDriver {
	public static void main (String[]args){
		calculatorFrame Program = new calculatorFrame();
		Program.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Program.setSize(new Dimension(300, 300));
		Program.pack();
		Program.setVisible(true);
	}
}
