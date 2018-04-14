package nhoanggiang.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.tree.DefaultMutableTreeNode;

import nhoanggiang.model.KhachHang;
import nhoanggiang.model.NhomKhachHang;

public class QuanLyKhachHangUI extends JFrame {
	DefaultMutableTreeNode root = null;
	JTree treeNhom;
	
	DefaultTableModel dtm;
	JTable tblKhach;
	
	JTextField txtMa, txtTen, txtPhone, txtEmail;
	JButton btnLuu, btnXoa;
	
	ArrayList<NhomKhachHang>dsNhom;
	ArrayList<KhachHang>dsKhach;
	
	NhomKhachHang nhomSelected = null;
	
	public QuanLyKhachHangUI (String title){
	super(title);
	addControls();
	addEvents();
	fakeData();
	}

	private void addControls() {
		Container con = getContentPane();
		JPanel pnLeft = new JPanel();
		pnLeft.setPreferredSize(new Dimension(300, 0));
		JPanel pnRight = new JPanel();
		JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pnLeft, pnRight);
		con.setLayout(new BorderLayout());
		con.add(sp, BorderLayout.CENTER);
		
		pnRight.setLayout(new BorderLayout());
		JPanel pnTopOfRight = new JPanel();
		pnTopOfRight.setPreferredSize(new Dimension(0, 300));
		JPanel pnBotOfRight = new JPanel();
		JSplitPane spRight = new JSplitPane(JSplitPane.VERTICAL_SPLIT, pnTopOfRight, pnBotOfRight);
		pnRight.add(spRight, BorderLayout.CENTER);
		
		pnLeft.setLayout(new BorderLayout());
		root = new DefaultMutableTreeNode("Cong ty Topica");
		treeNhom = new JTree(root);
		JScrollPane scTree = new JScrollPane(treeNhom, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnLeft.add(scTree, BorderLayout.CENTER);
		
		pnTopOfRight.setLayout(new BorderLayout());
		dtm = new DefaultTableModel();
		dtm.addColumn("Ma khach hang");
		dtm.addColumn("Ten khach hang");
		dtm.addColumn("So dien thoai");
		dtm.addColumn("Thu dien tu");
		tblKhach = new JTable(dtm);
		JScrollPane scTable = new JScrollPane(tblKhach, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnTopOfRight.add(scTable, BorderLayout.CENTER);
		
		pnBotOfRight.setLayout(new BoxLayout(pnBotOfRight, BoxLayout.Y_AXIS));
		JPanel pnMa = new JPanel();
		pnMa.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblMa = new JLabel("Ma khach hang");
		txtMa = new JTextField(20);
		pnMa.add(lblMa);
		pnMa.add(txtMa);
		pnBotOfRight.add(pnMa);
		JPanel pnTen = new JPanel();
		pnTen.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblTen = new JLabel("Ten khach hang");
		txtTen = new JTextField(20);
		pnTen.add(lblTen);
		pnTen.add(txtTen);
		pnBotOfRight.add(pnTen);
		JPanel pnPhone = new JPanel();
		pnPhone.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblPhone = new JLabel("So dien thoai");
		txtPhone = new JTextField(20);
		pnPhone.add(lblPhone);
		pnPhone.add(txtPhone);
		pnBotOfRight.add(pnPhone);
		JPanel pnEmail = new JPanel();
		pnEmail.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblEmail = new JLabel("Thu dien tu");
		txtEmail = new JTextField(20);
		pnEmail.add(lblEmail);
		pnEmail.add(txtEmail);
		pnBotOfRight.add(pnEmail);
		
		lblMa.setPreferredSize(lblTen.getPreferredSize());
		lblPhone.setPreferredSize(lblTen.getPreferredSize());
		lblEmail.setPreferredSize(lblTen.getPreferredSize());
		
		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout(FlowLayout.LEFT));
		btnLuu = new JButton("Luu khach hang");
		btnXoa = new JButton("xoa khach hang");
		pnButton.add(btnLuu);
		pnButton.add(btnXoa);
		pnBotOfRight.add(pnButton);
	}
	
	private void addEvents() {
		treeNhom.addMouseListener(new MouseListener() {
			
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
				DefaultMutableTreeNode nodeSelected = (DefaultMutableTreeNode) treeNhom.getLastSelectedPathComponent();
				if (nodeSelected != null && nodeSelected.getLevel() == 1){
				nhomSelected = (NhomKhachHang) nodeSelected.getUserObject();
				hienThiDanhSachKhachHangTheoNhom();
				}
			}
		});
		tblKhach.addMouseListener(new MouseListener() {
			
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
				int rowSelected =tblKhach.getSelectedRow();
				if (rowSelected == -1) return;
				String ma = (String) tblKhach.getValueAt(rowSelected, 0);
				String ten = (String) tblKhach.getValueAt(rowSelected, 1);
				String phone = (String) tblKhach.getValueAt(rowSelected, 2);
				String email = (String) tblKhach.getValueAt(rowSelected, 3);
				txtMa.setText(ma);
				txtTen.setText(ten);
				txtPhone.setText(phone);
				txtEmail.setText(email);
			
			}
		});
		btnLuu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				KhachHang kh = new KhachHang(txtMa.getText(), txtTen.getText(), txtPhone.getText(), txtEmail.getText());
				nhomSelected.themKhachHang(kh);
			}
		});
	}
	protected void hienThiDanhSachKhachHangTheoNhom() {
		// TODO Auto-generated method stub
		dtm.setRowCount(0);
		for (KhachHang kh : nhomSelected.getKhachHangs()){
			Vector<String>vec = new Vector<String>();
			vec.add(kh.getMa());
			vec.add(kh.getTen());
			vec.add(kh.getPhone());
			vec.add(kh.getEmail());
			dtm.addRow(vec);
		}
	}

	public void fakeData(){
		dsNhom = new ArrayList<NhomKhachHang>();
		NhomKhachHang vip = new NhomKhachHang("N1", "Khach hang VIP");
		NhomKhachHang tiemNang = new NhomKhachHang("N2", "Khach hang tiem nang");
		NhomKhachHang khoTinh = new NhomKhachHang("N3", "Khach hang kho tinh");
		dsNhom.add(vip);
		dsNhom.add(tiemNang);
		dsNhom.add(khoTinh);
		
		vip.getKhachHangs().add(new KhachHang("K1", "An", "0901234567", "an@gmail.com"));
		vip.getKhachHangs().add(new KhachHang("K2", "Binh", "0911234567", "binh@gmail.com"));
		vip.getKhachHangs().add(new KhachHang("K3", "Giai", "0921234567", "giai@gmail.com"));
		vip.getKhachHangs().add(new KhachHang("K4", "Thoat", "0931234567", "thoat@gmail.com"));
		
		for(NhomKhachHang nhom : dsNhom){
			DefaultMutableTreeNode nodeNhom = new DefaultMutableTreeNode(nhom); 
			root.add(nodeNhom);
			
			for (KhachHang khach : nhom.getKhachHangs()){
				DefaultMutableTreeNode nodeKhach = new DefaultMutableTreeNode(khach);
				nodeNhom.add(nodeKhach);
			}
		}
		treeNhom.expandRow(0);
	}
	public void showWindow(){
		this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
