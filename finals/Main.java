package finals;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		Frame myFrame = new Frame(); // creates a new frame
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // stops the program on gui close
		myFrame.pack(); // formats the frame to keep everything inside
		myFrame.setVisible(true); // keeps the frame visible

	}

}
