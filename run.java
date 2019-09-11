package Button;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
public class run {
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				button bor = new button("AHIHI");
				bor.setVisible(true);
				bor.setSize(300, 300);
				bor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
		});
	}
}
