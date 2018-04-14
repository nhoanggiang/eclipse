package nhoanggiang.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import javafx.scene.layout.Border;
import nhoanggiang.model.NhanVien;
import nhoanggiang.model.PhongBan;

public class QuanLyNhanVienUI extends JFrame {
	JComboBox<PhongBan> comboPhongBan;
	JList<NhanVien> listNhanVien;
	JTextField txtMa;
	JTextField txtTen;
	JTextField txtNgayVaoLam;
	JTextField txtNamSinh;
	JButton btnLuu;
	JButton btnXoa;
	JButton btnThoat;
	
	ArrayList<PhongBan> dsPhongBan;
	//Vector<NhanVien> dsNhanVienTheoPhongBan;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
	
	PhongBan pbSelected = null;
	NhanVien nvSelected = null;
	public QuanLyNhanVienUI(String title){
		super(title);
		addControls();
		addEvens();
		fakeData();
	}
	
	public void addControls(){
		Container con = getContentPane();
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		JPanel pnPhongBan = new JPanel();
		pnPhongBan.setLayout(new FlowLayout());
		JLabel lblPhongBan = new JLabel("Chon Phong Ban");
		comboPhongBan = new JComboBox<PhongBan>();
		comboPhongBan.setPreferredSize(new Dimension(200, 25));
		pnPhongBan.add(lblPhongBan);
		pnPhongBan.add(comboPhongBan);
		pnMain.add(pnPhongBan);
		
		
		JPanel pnDanhSachVaChiTiet = new JPanel();
		pnDanhSachVaChiTiet.setLayout(new GridLayout(1, 2));
		pnMain.add(pnDanhSachVaChiTiet);
		JPanel pnDanhSach = new JPanel();
		pnDanhSach.setLayout(new BorderLayout());
		javax.swing.border.Border borderDanhSach = BorderFactory.createLineBorder(Color.RED);
		TitledBorder titleBorderDanhSach = new TitledBorder(borderDanhSach, "Danh Sach Nhan Vien");
		titleBorderDanhSach.setTitleJustification(TitledBorder.CENTER);
		titleBorderDanhSach.setTitleColor(Color.BLUE);
		pnDanhSach.setBorder(titleBorderDanhSach);
		listNhanVien = new JList<NhanVien>();
		JScrollPane scListNhanVien = new JScrollPane(listNhanVien, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnDanhSach.add(scListNhanVien, BorderLayout.CENTER);
		pnDanhSachVaChiTiet.add(pnDanhSach);
		
		JPanel pnChiTiet = new JPanel();
		pnChiTiet.setLayout(new BoxLayout(pnChiTiet, BoxLayout.Y_AXIS));
		javax.swing.border.Border borderChiTiet = BorderFactory.createLineBorder(Color.RED);
		TitledBorder titleBorderChiTiet = new TitledBorder(borderChiTiet, "Thong Tin Chi Tiet");
		titleBorderChiTiet.setTitleJustification(TitledBorder.CENTER);
		titleBorderChiTiet.setTitleColor(Color.BLUE);
		pnChiTiet.setBorder(titleBorderChiTiet);
		pnDanhSachVaChiTiet.add(pnChiTiet);
		JPanel pnMa = new JPanel();
		pnMa.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JLabel lblMa = new JLabel("Ma");
		txtMa = new JTextField(16);
		pnMa.add(lblMa);
		pnMa.add(txtMa);
		pnChiTiet.add(pnMa);
		
		JPanel pnTen = new JPanel();
		pnTen.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JLabel lblTen = new JLabel("Ten");
		txtTen = new JTextField(16);
		pnTen.add(lblTen);
		pnTen.add(txtTen);
		pnChiTiet.add(pnTen);
		
		JPanel pnNgayVao = new JPanel();
		pnNgayVao.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JLabel lblNgayVao = new JLabel("Ngay Vao");
		txtNgayVaoLam = new JTextField(16);
		pnNgayVao.add(lblNgayVao);
		pnNgayVao.add(txtNgayVaoLam);
		pnChiTiet.add(pnNgayVao);
		
		JPanel pnNamSinh = new JPanel();
		pnNamSinh.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JLabel lblNamSinh = new JLabel("Nam Sinh");
		txtNamSinh = new JTextField(16);
		pnNamSinh.add(lblNamSinh);
		pnNamSinh.add(txtNamSinh);
		pnChiTiet.add(pnNamSinh);
		
		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
		javax.swing.border.Border borderButton = BorderFactory.createLineBorder(Color.RED);
		TitledBorder titleBorderButton = new TitledBorder(borderButton, "Chon Chuc Nang");
		titleBorderButton.setTitleJustification(TitledBorder.CENTER);
		titleBorderButton.setTitleColor(Color.BLUE);
		pnButton.setBorder(titleBorderButton);
		btnLuu = new JButton("Luu");
		btnXoa = new JButton("Xoa");
		btnThoat = new JButton("Thoat");
		pnButton.add(btnLuu);
		pnButton.add(btnXoa);
		pnButton.add(btnThoat);
		pnMain.add(pnButton);
		
		con.add(pnMain);
	}
	
	public void fakeData(){
		dsPhongBan = new ArrayList<PhongBan>();
		PhongBan phtgv = new PhongBan();
		phtgv.setMaPhong("P1");
		phtgv.setTenPhong("PHong Hop Tac Giang Vien");
		
		PhongBan pkd = new PhongBan();
		pkd.setMaPhong("P2");
		pkd.setTenPhong("Phong Kinh Doanh");
		
		PhongBan pkt = new PhongBan();
		pkt.setMaPhong("P3");
		pkt.setTenPhong("Phong Ke Toan");
		
		dsPhongBan.add(phtgv);
		dsPhongBan.add(pkd);
		dsPhongBan.add(pkt);
		
		phtgv.themNhanVien(new NhanVien("NV1", "Nguyen Hoang Giang", new Date(2017-1990, 4, 3), new Date(1991-1990, 2, 14)));
		phtgv.themNhanVien(new NhanVien("NV2", "Pham Viet Linh", new Date(2017-1990, 1, 3), new Date(1993-1990, 9, 30)));
		phtgv.themNhanVien(new NhanVien("NV3", "Ho Thi Giai", new Date(2017-1990, 10, 3), new Date(1992-1990, 5, 14)));
		pkd.themNhanVien(new NhanVien("NV4", "Tran Van Thoat", new Date(2015-1990, 4, 23), new Date(1990-1990, 2, 4)));
		
		
		for (PhongBan pb : dsPhongBan){
			comboPhongBan.addItem(pb);
			
		}
	}
	
	public void addEvens(){
		btnThoat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		comboPhongBan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (comboPhongBan.getSelectedIndex() == -1) return;
				pbSelected = (PhongBan) comboPhongBan.getSelectedItem();
				listNhanVien.setListData(pbSelected.getNhanViens());
			}
		});
		listNhanVien.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if (listNhanVien.getSelectedIndex() == -1) return;
				nvSelected = listNhanVien.getSelectedValue();
				txtMa.setText(nvSelected.getMaNhanVien());
				txtTen.setText(nvSelected.getTenNhanVien());
				txtNgayVaoLam.setText(sdf.format(nvSelected.getNgayVaoLamViec()));
				txtNamSinh.setText(sdf.format(nvSelected.getNamSinh()));
			}
		});
		btnLuu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				xuLyLuu();
			}
		});
		btnXoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				xuLyXoa();
			}
		});
	}
	
	protected void xuLyXoa() {
		if (nvSelected != null){
			pbSelected.getNhanViens().remove(nvSelected);
			nvSelected = null;
			listNhanVien.setListData(pbSelected.getNhanViens());
		}
	}

	protected void xuLyLuu() {
		try{
			NhanVien nv = new NhanVien(txtMa.getText(), txtTen.getText(), sdf.parse(txtNgayVaoLam.getText()), sdf.parse(txtNamSinh.getText()));
			if (pbSelected != null){
				pbSelected.themNhanVien(nv);
				listNhanVien.setListData(pbSelected.getNhanViens());
			}
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, ex.toString());
		}

	}

	public void showWindow(){
		this.setSize(550, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
