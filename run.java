package calculator;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class run {
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				calculator cal = new calculator("Calculator");
				cal.setVisible(true);
				cal.setSize(400, 500);
				cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
		});
	}
}

