package nhoanggiang.ui;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HocFlowLayoutUI extends JFrame {
	public HocFlowLayoutUI(String tieuDe){
		super(tieuDe);
		addControls();
	}
	public void addControls(){
		Container con = getContentPane();
		JPanel pn = new JPanel();
		pn.setLayout(new FlowLayout());
		JButton bt1 = new JButton("Demo butotn 1");
		JButton bt2 = new JButton("Demo butotn 2");
		JButton bt3 = new JButton("Demo butotn 3");
		JButton bt4 = new JButton("Demo butotn4");
		pn.add(bt1);
		pn.add(bt2);
		pn.add(bt3);
		pn.add(bt4);
		con.add(pn);
	
	
	}
	public void showWindow(){
		this.setSize(600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
