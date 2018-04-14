package nhoanggiang.ui;

import java.awt.Button;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HocBoxLayoutUI extends JFrame{
	public HocBoxLayoutUI(String tieuDe){
		super(tieuDe);
		addControls();
	}
	public void addControls()
	{
		Container con = getContentPane();
		JPanel pn = new JPanel();
		pn.setLayout(new BoxLayout(pn, BoxLayout.Y_AXIS));
		Button bt1 = new Button("Demo button 1");
		Button bt2 = new Button("Demo button 2");
		Button bt3 = new Button("Demo button 3");
		Button bt4 = new Button("Demo button 4");
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
