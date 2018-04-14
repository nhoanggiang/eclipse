package nhoanggiang.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class HocBorderVaJTextAreaUI extends JFrame{
	JTextField txtTen;
	JTextArea txtDiaChi;
	JButton btnOK;
	public HocBorderVaJTextAreaUI(String title){
		super(title);
		addControls();
		addEvents();
	}
	public void addControls(){
		Container con = getContentPane();
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		JPanel pnThongTin = new JPanel();
		pnThongTin.setLayout(new BoxLayout(pnThongTin, BoxLayout.Y_AXIS));
		JPanel pnTen = new JPanel();
		pnTen.setLayout(new FlowLayout());
		JLabel lblTen = new JLabel("Nhap ten");
		txtTen = new JTextField(19);
		pnTen.add(lblTen);
		pnTen.add(txtTen);
		pnThongTin.add(pnTen);
		JPanel pnDiaChi = new JPanel();
		pnDiaChi.setLayout(new FlowLayout());
		JLabel lblDiaChi = new JLabel("Nhap dia chi");
		txtDiaChi = new JTextArea(5, 18);
		txtDiaChi.setWrapStyleWord(true);
		txtDiaChi.setLineWrap(true);
		JScrollPane sc = new JScrollPane(txtDiaChi, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnDiaChi.add(lblDiaChi);
		pnDiaChi.add(sc);
		pnThongTin.add(pnDiaChi);
		pnMain.add(pnThongTin);
		
		Border borderThongTin = BorderFactory.createLineBorder(Color.BLUE);
		TitledBorder borderTitleThongTin = new TitledBorder(borderThongTin, "Thong Tin");
		borderTitleThongTin.setTitleColor(Color.RED);
		borderTitleThongTin.setTitleJustification(TitledBorder.CENTER);
		pnThongTin.setBorder(borderTitleThongTin);
		
		JPanel pnOK = new JPanel();
		pnOK.setLayout(new FlowLayout(FlowLayout.RIGHT));
		btnOK = new JButton("OK");
		pnOK.add(btnOK);
		pnMain.add(pnOK);
		
		con.add(pnMain);
		
		lblTen.setPreferredSize(lblDiaChi.getPreferredSize());
	}
	public void addEvents(){
		
	}
	public void showWindow(){
		this.setSize(400, 250);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
