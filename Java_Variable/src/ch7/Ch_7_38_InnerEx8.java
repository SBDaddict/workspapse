package ch7;

import java.awt.*;
import java.awt.event.*;

public class Ch_7_38_InnerEx8 {

	public static void main(String[] args) {
		Button b = new Button("Start");
	
		b.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
			System.out.println("ActionEvent occurred!");
		}}); //Ch_7_37_InnerEx8을 익명 클래스로 변환

	}

}