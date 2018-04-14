package nhoanggiang.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class HocBorderVaJTextAreaCheckboxRadioUI extends JFrame{
	JTextField txtTen;
	JTextArea txtDiaChi;
	JButton btnOK;
	JCheckBox chkDiBoi;
	JCheckBox chkDiXemPhim;
	JRadioButton radNam;
	JRadioButton radNu;
	ButtonGroup groupGioiTinh;
	public HocBorderVaJTextAreaCheckboxRadioUI(String title){
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
		borderTitleThongTin.setTitleJustification(TitledBorder.RIGHT);
		pnThongTin.setBorder(borderTitleThongTin);
		
		JPanel pnSoThichGioiTinh = new JPanel();
		//pnSoThichGioiTinh.setLayout(new BoxLayout(pnSoThichGioiTinh, BoxLayout.X_AXIS));
		pnSoThichGioiTinh.setLayout(new GridLayout(1, 2));
		JPanel pnSoThich = new JPanel();
		Border borderSoThich = BorderFactory.createLineBorder(Color.RED);
		TitledBorder borderTileSoThich = new TitledBorder(borderSoThich, "So Thich");
		borderTileSoThich.setTitleColor(Color.PINK);
		pnSoThich.setBorder(borderTileSoThich);
		pnSoThich.setLayout(new BoxLayout(pnSoThich, BoxLayout.Y_AXIS));
		chkDiBoi = new JCheckBox("Di boi");
		chkDiXemPhim = new JCheckBox("Di xem phim");
		pnSoThich.add(chkDiBoi);
		pnSoThich.add(chkDiXemPhim);
		pnSoThichGioiTinh.add(pnSoThich);
		
		JPanel pnGioiTinh = new JPanel();
		//pnGioiTinh.setPreferredSize(new Dimension(200, 100));
		Border borderGioiTinh = BorderFactory.createLineBorder(Color.GREEN);
		TitledBorder borderTitleGioiTinh = new TitledBorder(borderGioiTinh, "Gioi Tinh");
		borderTitleGioiTinh.setTitleColor(Color.ORANGE);
		pnGioiTinh.setBorder(borderTitleGioiTinh);
		pnGioiTinh.setLayout(new BoxLayout(pnGioiTinh, BoxLayout.Y_AXIS));
		radNam = new JRadioButton("Nam");
		radNu = new JRadioButton("Nu");
		groupGioiTinh = new ButtonGroup();
		groupGioiTinh.add(radNam);
		groupGioiTinh.add(radNu);
		pnGioiTinh.add(radNam);
		pnGioiTinh.add(radNu);
		pnSoThichGioiTinh.add(pnGioiTinh);
		pnMain.add(pnSoThichGioiTinh);
		
		JPanel pnOK = new JPanel();
		pnOK.setLayout(new FlowLayout(FlowLayout.RIGHT));
		btnOK = new JButton("OK");
		pnOK.add(btnOK);
		pnMain.add(pnOK);
		
		con.add(pnMain);
		
		lblTen.setPreferredSize(lblDiaChi.getPreferredSize());
	}
	public void addEvents(){
		btnOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				suLyLayThongTin();
			}
		});
	}
	protected void suLyLayThongTin() {
		String msg = txtTen.getText() + "\n";
		msg += txtDiaChi.getText() + "\n";
		String soThich = "";
		if (chkDiBoi.isSelected()){
			soThich += chkDiBoi.getText() + "\n";
		}
		if (chkDiXemPhim.isSelected()){
			soThich += chkDiXemPhim.getText();
		}
		msg += soThich + "\n";
		
		String gioiTinh = "";
		if (radNam.isSelected()){
			gioiTinh += radNam.getText() + "\n";
			
		}
		else{
			gioiTinh += radNu.getText();
		}
		msg += gioiTinh;
		JOptionPane.showMessageDialog(null, msg);
		
	}
	public void showWindow(){
		this.setSize(400, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
