package calculator;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class calculator extends JFrame implements ActionListener {
	JTextArea textArea;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	JButton congButton,truButton,nhanButton,chiaButton,bangButton;
	JPanel mainJPanel;
	String tinhString = "";

	public calculator(String tieude)
	{
		super(tieude);
		
		ImageIcon icon = new ImageIcon("/home/korose/eclipse-workspace/java3/icon/ahihi.png");
		setIconImage(icon.getImage());
		textArea = new JTextArea("",400,70);
		textArea.setLineWrap(true);
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		congButton = new JButton("+");
		truButton = new JButton("-");
		nhanButton = new JButton("*");
		chiaButton = new JButton("/");
		bangButton = new JButton("=");
		mainJPanel = new JPanel();
		
		mainJPanel.setLayout(null);
		
		textArea.setBounds(0, 0, 400, 70);	
		Font font = new Font("Segoe Script", Font.BOLD, 20);
		textArea.setFont(font);
		b0.setBounds(0, 400, 100, 100);
		b1.setBounds(0, 300, 100, 100);
		b4.setBounds(0, 200, 100, 100);
		b7.setBounds(0, 100, 100, 100);
		b2.setBounds(100, 300, 100, 100);
		b5.setBounds(100, 200, 100, 100);
		b8.setBounds(100, 100, 100, 100);
		b3.setBounds(200, 300, 100, 100);
		b6.setBounds(200, 200, 100, 100);
		b9.setBounds(200, 100, 100, 100);
		congButton.setBounds(300, 400, 100, 100);
		truButton.setBounds(300, 300, 100, 100);
		nhanButton.setBounds(300, 200, 100, 100);
		chiaButton.setBounds(300, 100, 100, 100);
		bangButton.setBounds(100, 400, 200, 100);

		mainJPanel.add(textArea);
		mainJPanel.add(b0);
		mainJPanel.add(b1);
		mainJPanel.add(b2);
		mainJPanel.add(b3);
		mainJPanel.add(b4);
		mainJPanel.add(b5);
		mainJPanel.add(b6);
		mainJPanel.add(b7);
		mainJPanel.add(b8);
		mainJPanel.add(b9);
		mainJPanel.add(congButton);
		mainJPanel.add(truButton);
		mainJPanel.add(nhanButton);
		mainJPanel.add(chiaButton);
		mainJPanel.add(bangButton);

		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		congButton.addActionListener(this);
		truButton.addActionListener(this);
		nhanButton.addActionListener(this);
		chiaButton.addActionListener(this);
		bangButton.addActionListener(this);
		
		this.add(mainJPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b0)
		{
			textArea.append("0");
			tinhString+="0";
		}
		if(e.getSource() == b1)
		{
			textArea.append("1");
			tinhString+="1";
		}if(e.getSource() == b2)
		{
			textArea.append("2");
			tinhString+="2";
		}if(e.getSource() == b3)
		{
			textArea.append("3");
			tinhString+="3";
		}if(e.getSource() == b4)
		{
			textArea.append("4");
			tinhString+="4";
		}if(e.getSource() == b5)
		{
			textArea.append("5");
			tinhString+="5";
		}if(e.getSource() == b6)
		{
			textArea.append("6");
			tinhString+="6";
		}if(e.getSource() == b7)
		{
			textArea.append("7");
			tinhString+="7";
		}if(e.getSource() == b8)
		{
			textArea.append("8");
			tinhString+="8";
		}if(e.getSource() == b9)
		{
			textArea.append("9");
			tinhString+="9";
		}
		if(e.getSource() == congButton)
		{
			textArea.append("+");
			tinhString+="+";
		}if(e.getSource() == truButton)
		{
			textArea.append("-");
			tinhString+="-";
		}if(e.getSource() == nhanButton)
		{
			textArea.append("*");
			tinhString+="*";
		}if(e.getSource() == chiaButton)
		{
			textArea.append("/");
			tinhString+="/";
		}
		if(e.getSource() == bangButton)
		{
			textArea.append("=");
			tinhString+="+";
			textArea.append(dapan());
		}
	}
	public String dapan()
	{
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		ArrayList<Character> dauArrayList = new ArrayList<Character>();
		int so = 0;
		int dem =0;
		int ketqua=0;
		try {
			for(int i=0; i<tinhString.length(); i++)
			{
				if(Character.isDigit(tinhString.charAt(i)))
				{
					so = so*10 + Integer.valueOf(tinhString.charAt(i)) - 48;
				}
				else {
					int doi = so;
					so =0;
					arrayList.add(doi);
					dauArrayList.add(tinhString.charAt(i));
					dem++;
				}
			}
			dem--;
			while(dem >=0)
			{
				int i = dauArrayList.indexOf('*');
				if(i!= -1)
				{
					dauArrayList.remove(i);
					int a = arrayList.get(i)*arrayList.get(i+1);
					arrayList.remove(i);
					arrayList.remove(i);
					arrayList.add(i, a);
					dem--;
				}
				else {
					i= dauArrayList.indexOf('/');
					if(i != -1) {
						dauArrayList.remove(i);
						int a = arrayList.get(i)/arrayList.get(i+1);
						arrayList.remove(i);
						arrayList.remove(i);
						arrayList.add(i, a);
						dem--;
					}
					else {
						for(;dem>=0;dem--)
						{
							if(dauArrayList.get(dem).equals('+'))
							{
								ketqua = ketqua + arrayList.get(dem);
							}
							else {
								ketqua = arrayList.get(dem) - ketqua;
							}
						}
					}
				}
			}
		}catch (Exception e) {
			System.out.println("Co loi" +e);
		}
		return String.valueOf(ketqua);
	}
}
