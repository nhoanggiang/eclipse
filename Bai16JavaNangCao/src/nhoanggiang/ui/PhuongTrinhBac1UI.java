package nhoanggiang.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PhuongTrinhBac1UI extends JFrame {
	JTextField txtHeSoa;
	JTextField txtHeSob;
	JTextField txtKetQua;
	JButton btnGiai;
	JButton btnThoat;
	JButton btnHelp;
	
	ActionListener eventGiai = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			xuLyGiaiPhuongTrinh();
		}
	};
	public PhuongTrinhBac1UI(String tieuDe){
		setTitle(tieuDe);
		addControls();
		addEvents();
	}
	protected void xuLyGiaiPhuongTrinh() {
		// TODO Auto-generated method stub
		String hsa = txtHeSoa.getText();
		String hsb = txtHeSob.getText();
		double a = Double.parseDouble(hsa);
		double b = Double.parseDouble(hsb);
		if (a==0 && b==0){
			txtKetQua.setText("Vo so nghiem!");
		}
		else if (a==0 && b!=0){
			txtKetQua.setText("Vo nghiem!");
		}
		else{
			double x = -b/a;
			txtKetQua.setText("x = " + x);
		}
	}
	public void addEvents(){
		btnThoat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);

			}
		});
		btnGiai.addActionListener(eventGiai);
		
		HelpEvent help = new HelpEvent();
		btnHelp.addActionListener(help);
	}
	public void addControls(){
		Container con = getContentPane();
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		
		JPanel pnTitle = new JPanel();
		pnTitle.setLayout(new FlowLayout());
		JLabel lbTieuDe = new JLabel("Giai phuong trinh bac 1");
		lbTieuDe.setForeground(Color.RED);
		Font fontTieuDe = new Font("arial", Font.BOLD, 20);
		lbTieuDe.setFont(fontTieuDe);
		pnTitle.add(lbTieuDe);
		pnMain.add(pnTitle);
		
		JPanel pnHeSoa = new JPanel();
		pnHeSoa.setLayout(new FlowLayout());
		JLabel lbHeSoa = new JLabel("He so a");
		txtHeSoa = new JTextField(15);
		pnHeSoa.add(lbHeSoa);
		pnHeSoa.add(txtHeSoa);
		pnMain.add(pnHeSoa);
		
		JPanel pnHeSob = new JPanel();
		pnHeSob.setLayout(new FlowLayout());
		JLabel lbHeSob = new JLabel("He so b");
		txtHeSob = new JTextField(15);
		pnHeSob.add(lbHeSob);
		pnHeSob.add(txtHeSob);
		pnMain.add(pnHeSob);
		
		JPanel pnButton	= new JPanel();
		pnButton.setLayout(new FlowLayout());
		btnGiai = new JButton("Giai");
		btnThoat = new JButton("Thoat");
		btnHelp = new JButton("Help");
		btnThoat.setIcon(new ImageIcon("Pictures/power_off.png"));
		pnButton.add(btnGiai);
		pnButton.add(btnThoat);
		pnButton.add(btnHelp);
		pnMain.add(pnButton);
		
		
		JPanel pnKetQua = new JPanel();
		pnKetQua.setLayout(new FlowLayout());
		JLabel lbKetQua = new JLabel("Ket qua");
		txtKetQua = new JTextField(15);
		pnKetQua.add(lbKetQua);
		pnKetQua.add(txtKetQua);
		pnMain.add(pnKetQua);
		
		con.add(pnMain);
	}
	class HelpEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, "Chi tiet hoi bac Google");
		}
		
	}
	public void showWindow(){
		this.setSize(400, 250);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
