package nhoanggiang.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CDDVDUI extends JFrame {
	JTextField txtMa, txtTen, txtLoai, txtNamXuatBan;
	JButton btnLuu, btnXoa, btnTimKiem;

	DefaultTableModel dtmCD;
	JTable tblCD;

	Connection conn = null;
	PreparedStatement preStatement = null;
	ResultSet result = null;

	public CDDVDUI(String title){
		super(title);
		addControls();
		addEvents();
		ketNoiCoSoDuLieu("PHAMVIETLINH", "dbQuanLyCDDVD");
		hienThiToanBoCDDVD();
	}
	private void hienThiToanBoCDDVD() {
		try{
			String sql = "select * from CDDVDCollection";
			preStatement = conn.prepareStatement(sql);
			result = preStatement.executeQuery();
			dtmCD.setRowCount(0);
			while(result.next()){
				Vector<Object> vec = new Vector<Object>();
				vec.add(result.getString("Ma"));
				vec.add(result.getString(2));
				vec.add(result.getString("LoaiDia"));
				vec.add(result.getString("NamXuatBan"));
				dtmCD.addRow(vec);
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
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
			//preStatement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
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

	}

	private void addControls() {
		Container con = getContentPane();
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BorderLayout());
		JPanel pnThongTin = new JPanel();
		pnThongTin.setLayout(new BoxLayout(pnThongTin, BoxLayout.Y_AXIS));
		pnMain.add(pnThongTin, BorderLayout.NORTH);

		JPanel pnMa = new JPanel();
		pnMa.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblMa = new JLabel("Ma Dia");
		txtMa = new JTextField(20);
		pnMa.add(lblMa);
		pnMa.add(txtMa);
		pnThongTin.add(pnMa);

		JPanel pnTen = new JPanel();
		pnTen.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblTen = new JLabel("Ten Dia");
		txtTen = new JTextField(20);
		pnTen.add(lblTen);
		pnTen.add(txtTen);
		pnThongTin.add(pnTen);

		JPanel pnLoai = new JPanel();
		pnLoai.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblLoai = new JLabel("Loai Dia");
		txtLoai = new JTextField(20);
		pnLoai.add(lblLoai);
		pnLoai.add(txtLoai);
		pnThongTin.add(pnLoai);

		JPanel pnNamXuatBan = new JPanel();
		pnNamXuatBan.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblNamXuatBan = new JLabel("Nam Xuat Ban");
		txtNamXuatBan = new JTextField(20);
		pnNamXuatBan.add(lblNamXuatBan);
		pnNamXuatBan.add(txtNamXuatBan);
		pnThongTin.add(pnNamXuatBan);

		lblMa.setPreferredSize(lblNamXuatBan.getPreferredSize());
		lblTen.setPreferredSize(lblNamXuatBan.getPreferredSize());
		lblLoai.setPreferredSize(lblNamXuatBan.getPreferredSize());

		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout(FlowLayout.LEFT));
		btnLuu = new JButton("Luu");
		btnXoa = new JButton("Xoa");
		btnTimKiem = new JButton("Tim Kiem");
		pnButton.add(btnLuu);
		pnButton.add(btnXoa);
		pnButton.add(btnTimKiem);
		pnThongTin.add(pnButton);

		dtmCD = new DefaultTableModel();
		dtmCD.addColumn("Ma Dia");
		dtmCD.addColumn("Ten Dia");
		dtmCD.addColumn("LoaiDia");
		dtmCD.addColumn("Nam Xuat Ban");
		tblCD = new JTable(dtmCD);
		JScrollPane scTable = new JScrollPane(tblCD, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnMain.add(scTable, BorderLayout.CENTER);

		con.add(pnMain, BorderLayout.CENTER);
	}
	public void showWindow(){
		this.setSize(500, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
