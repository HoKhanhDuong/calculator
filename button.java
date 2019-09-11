package Button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class button extends JFrame implements ActionListener {
	JTextField taikhoanField;
	JButton dangnhapButton , thoatButton;
	JPasswordField matkhauField;
	JLabel taikhoanJLabel,matJLabel;
	JPanel panel;
	public button(String tieude)
	{
		super(tieude);
		
		taikhoanField = new JTextField("",20);
		dangnhapButton = new JButton("dang nhap");
		thoatButton = new JButton("Thoat");
		matkhauField = new JPasswordField();
		taikhoanJLabel = new JLabel("tai khoan : ");
		matJLabel = new JLabel("mat khau : ");
		panel = new JPanel();
		
		panel.setLayout(null);
		
		taikhoanJLabel.setBounds(10, 10, 100, 20); // vị trí x,y , độ rộng, độ cao
		taikhoanField.setBounds(100, 10, 100, 20);
		matJLabel.setBounds(10, 50, 100, 20);
		matkhauField.setBounds(100, 50, 100, 20);
		dangnhapButton.setBounds(5, 150, 130, 20);
		thoatButton.setBounds(200, 150, 80, 20);
		
		panel.add(taikhoanJLabel);
		panel.add(taikhoanField);
		panel.add(matkhauField);
		panel.add(matJLabel);
		panel.add(dangnhapButton);
		panel.add(thoatButton);
		
		this.add(panel);
		
		dangnhapButton.addActionListener(this);
		thoatButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == dangnhapButton)
		{
			String taikhoanString = taikhoanField.getText().toString();
			String matkhauString = matkhauField.getPassword().toString();
			//char[] c = matkhauField.getPassword();
			//String matkhauString = new String(c);
			JOptionPane.showMessageDialog(null, "tai khoan : "+taikhoanString +"mat khau:"+matkhauString);
		}
		if(e.getSource() == thoatButton)
		{
			System.exit(0);
		}
	}
}
