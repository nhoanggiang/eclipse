package nhoanggiang.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HocBorderLayoutUI extends JFrame {
	public HocBorderLayoutUI(String tieuDe)
	{
		super(tieuDe);
		addControls();
	}
	public void addControls()
	{
		Container con = getContentPane();
		JPanel pn = new JPanel();
		pn.setLayout(new BorderLayout());
		
		JPanel pnNorth = new JPanel();
		pnNorth.setBackground(Color.BLUE);
		pn.add(pnNorth, BorderLayout.NORTH);
		pnNorth.setPreferredSize(new Dimension(0, 100));
		
		JPanel pnSouth = new JPanel();
		pnSouth.setBackground(Color.PINK);
		pn.add(pnSouth, BorderLayout.SOUTH);
		pnSouth.setPreferredSize(new Dimension(0, 100));
		
		JPanel pnWest = new JPanel();
		pnWest.setBackground(Color.YELLOW);
		pn.add(pnWest, BorderLayout.WEST);
		pnWest.setPreferredSize(new Dimension(100, 0));
		
		JPanel pnEast = new JPanel();
		pnEast.setBackground(Color.RED);
		pn.add(pnEast, BorderLayout.EAST);
		pnEast.setPreferredSize(new Dimension(100, 0));
		
		JPanel pnCenter = new JPanel();
		pnCenter.setBackground(Color.GREEN);
		pn.add(pnCenter, BorderLayout.CENTER);
		
		con.add(pn);
	}
	public void showWindow()
	{
		this.setSize(600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
