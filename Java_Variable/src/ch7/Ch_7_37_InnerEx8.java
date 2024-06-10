package ch7;

import java.awt.*;
import java.awt.event.*;

public class Ch_7_37_InnerEx8 {

	public static void main(String[] args) {
		Button b = new Button("Start");
		

	}

}

class EventHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!");
	}
}
