package nhoanggiang.ui;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class CuaSoCuaToi extends JFrame {
	public CuaSoCuaToi (String tieuDe){
		//super(tieuDe);
		this.setTitle(tieuDe);
		addControls();
	}
	public void addControls(){
		// Lay lop chua cua so
		Container con = getContentPane();
		// Tao 1 lop chua control
		JPanel pn = new JPanel();
		pn.setBackground(Color.GREEN);
		JButton bt = new JButton("Day la nut lenh");
		pn.add(bt);
		con.add(pn);


	}
	public void showWindow(){
		this.setSize(500, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
