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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
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
					txtThongTin.setText(result.getString(2));
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
					txtThongTin.setText(result.getString(2));
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
					txtThongTin.setText(result.getString("TenKH"));
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
			}
		});
	}

	protected void goToLast() {
		try{
			result.last();
			txtThongTin.setText(result.getString(2));
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

		txtThongTin = new JTextArea(5, 20);
		JScrollPane scThongTin = new JScrollPane(txtThongTin, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnNorth.add(scThongTin, BorderLayout.CENTER);
		con.add(pnManin, BorderLayout.CENTER);


	}
	public void showWindow(){
		this.setSize(600, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
