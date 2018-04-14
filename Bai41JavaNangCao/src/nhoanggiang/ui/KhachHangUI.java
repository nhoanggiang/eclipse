package nhoanggiang.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;

public class KhachHangUI extends JFrame {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
	DefaultTableModel dtmKhachHang;
	JTable tblKhachHang;

	Connection conn = null;
	Statement statement = null;
	ResultSet result = null;

	JButton btnFirt, btnLast, btnNext, btnPrevious;

	JTextArea txtThongTin;

	JTextField txtMa, txtTen, txtNamSinh;
	JButton btnLuu;

	int position;
	public KhachHangUI(String title){
		super(title);
		addControls();
		addEvents();
		ketNoiCoSoDuLieu("PHAMVIETLINH", "dbKhachHang");
		hienThiToanBoKhachHang();

	}

	private void hienThiToanBoKhachHang() {
		// TODO Auto-generated method stub
		try {
			String sql="select * from KhachHang";
			result=statement.executeQuery(sql);
			dtmKhachHang.setRowCount(0);
			while(result.next()) //Trong khi con du lieu de doc
			{
				String ma = result.getString("MaKH");
				String ten = result.getString("TenKH");
				Date namSinh = result.getDate("NamSinh");
				Vector<Object> vec = new Vector<Object>();
				vec.add(ma);
				vec.add(ten);
				vec.add(sdf.format(namSinh));
				dtmKhachHang.addRow(vec);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void ketNoiCoSoDuLieu(String strServer,String strDatabase) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectionUrl=
					"jdbc:sqlserver://"+strServer+":1433;databaseName="+strDatabase+";integratedSecurity=true;";
			conn= DriverManager.getConnection(connectionUrl);
			//statement = conn.createStatement(); //Chi duy chuyen toi, khong quay lui, khong di chuyen toi dong bat ky
			statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			if(conn != null){
				System.out.println("Ket noi CSDL thanh cong");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		//return conn;
	}

	private void showDetail(ResultSet rs){
		try{
			txtMa.setText(rs.getString(1));
			txtTen.setText(rs.getString(2));
			txtNamSinh.setText(rs.getDate("NamSinh").toString());
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		btnLast.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				goToLast();

			}
		});
		btnFirt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					result.first();
					showDetail(result);
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
			}
		});
		btnNext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					position++;
					if(result.isLast()  == true){
						position = 1;
					}
					result.absolute(position);
					showDetail(result);
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
			}
		});
		btnPrevious.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					position--;
					if(result.isFirst() == true){
						goToLast();
						position = result.getRow();
					}
					result.absolute(position);
					showDetail(result);
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
			}
		});
		btnLuu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyLuuKhachHang();
			}
		});
	}
	public boolean kiemTraMaTonTai(String ma){
		try{
			String sql = "select * from KhachHang where maKH = '"+ma+"'";
			ResultSet rs = statement.executeQuery(sql);
			if(rs.next()){
				return true;
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return false;
	}

	protected void xuLyLuuKhachHang() {
		try{
			if(kiemTraMaTonTai(txtMa.getText())){
				int ret = JOptionPane.showConfirmDialog(null, "Ma ["+txtMa.getText()+"] da ton tai, ban co muon cap nhat khong?", 
						"Thong bao trung ma", JOptionPane.YES_NO_OPTION);
				if(ret == JOptionPane.NO_OPTION)
					return;
				String sql = "update KhachHang set TenKH = N'"+txtTen.getText()+"', NamSinh = '"+txtNamSinh.getText()+"' where MaKH = '"+txtMa.getText()+"'";	
				int x = statement.executeUpdate(sql);
				if(x > 0){
					hienThiToanBoKhachHang();
				}
				return;
			}

			String sql = "insert into KhachHang " + "values('"+txtMa.getText()+"','"+txtTen.getText()+"','N1','"+txtNamSinh.getText()+"')";
			int x = statement.executeUpdate(sql);
			if(x > 0){
				hienThiToanBoKhachHang();
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

	protected void goToLast() {
		try{
			result.last();
			showDetail(result);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}

	}

	private void addControls() {
		// TODO Auto-generated method stub
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		JPanel pnManin = new JPanel();
		pnManin.setLayout(new BorderLayout());
		dtmKhachHang = new DefaultTableModel();
		dtmKhachHang.addColumn("Ma khach hang");
		dtmKhachHang.addColumn("Ten khach hang");
		dtmKhachHang.addColumn("Nam sinh");
		tblKhachHang = new JTable(dtmKhachHang);
		JScrollPane scTable = new JScrollPane(tblKhachHang, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnManin.add(scTable);

		JPanel pnNorth = new JPanel();
		pnNorth.setLayout(new BorderLayout());
		pnManin.add(pnNorth, BorderLayout.NORTH);
		JPanel pnNorthOfNorth = new JPanel();

		btnFirt = new JButton("|<");
		btnPrevious = new JButton("<<");
		btnNext = new JButton(">>");
		btnLast = new JButton(">|");
		pnNorthOfNorth.add(btnFirt);
		pnNorthOfNorth.add(btnPrevious);
		pnNorthOfNorth.add(btnNext);
		pnNorthOfNorth.add(btnLast);
		pnNorth.add(pnNorthOfNorth, BorderLayout.NORTH);

		JPanel pnThongTinChiTiet = new JPanel();
		pnThongTinChiTiet.setLayout(new BoxLayout(pnThongTinChiTiet, BoxLayout.Y_AXIS));
		JPanel pnMa = new JPanel();
		pnMa.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblMa = new JLabel("Ma:");
		txtMa = new JTextField(20);
		pnMa.add(lblMa);
		pnMa.add(txtMa);
		pnThongTinChiTiet.add(pnMa);
		JPanel pnTen = new JPanel();
		pnTen.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblTen = new JLabel("Ten:");
		txtTen = new JTextField(20);
		pnTen.add(lblTen);
		pnTen.add(txtTen);
		pnThongTinChiTiet.add(pnTen);
		JPanel pnNamSinh = new JPanel();
		pnNamSinh.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblNamSinh = new JLabel("Nam Sinh:");
		txtNamSinh = new JTextField(20);
		pnNamSinh.add(lblNamSinh);
		pnNamSinh.add(txtNamSinh);
		pnThongTinChiTiet.add(pnNamSinh);
		JPanel pnButtonChiTiet = new JPanel();
		pnButtonChiTiet.setLayout(new FlowLayout(FlowLayout.LEFT));
		btnLuu = new JButton("Luu");
		pnButtonChiTiet.add(btnLuu);
		pnThongTinChiTiet.add(pnButtonChiTiet);
		lblMa.setPreferredSize(lblNamSinh.getPreferredSize());
		lblTen.setPreferredSize(lblNamSinh.getPreferredSize());
		pnManin.add(pnThongTinChiTiet, BorderLayout.SOUTH);
		con.add(pnManin, BorderLayout.CENTER);


	}
	public void showWindow(){
		this.setSize(600, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
