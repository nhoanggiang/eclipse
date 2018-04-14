package nhoanggiang.ui;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class HocJTabbedPane extends JFrame {
	JTabbedPane tab;
	
	public HocJTabbedPane (String title){
		super(title);
		addControls();
		addEvents();
		
	}
	public void addControls(){
		Container con = getContentPane();
		tab = new JTabbedPane();
		con.add(tab);
		JPanel pnTab1 = new JPanel();
		JPanel pnTab2 = new JPanel();
		JPanel pnTab3 = new JPanel();
		pnTab1.setBackground(Color.RED);
		pnTab2.setBackground(Color.YELLOW);
		pnTab3.setBackground(Color.GREEN);
		pnTab1.add(new JButton("Day la button"));
		pnTab2.add(new JTextField(15));
		tab.add(pnTab1, "Cau hinh");
		tab.add(pnTab2, "Bao mat");
		tab.add(pnTab3, "Phan quyen");
	}
	public void addEvents(){
		
	}
	public void showWindow(){
		this.setSize(600, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
