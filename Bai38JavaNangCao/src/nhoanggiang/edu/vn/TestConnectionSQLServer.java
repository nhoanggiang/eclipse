package nhoanggiang.edu.vn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnectionSQLServer {
	public static Connection getConnect(String strServer,String strDatabase)
	{
		Connection conn=null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectionUrl=
					"jdbc:sqlserver://"+strServer+":1433;databaseName="+strDatabase+";integratedSecurity=true;";
			conn= DriverManager.getConnection(connectionUrl);
		} catch (SQLException e) {
			System.out.println("SQL Exception: "+ e.toString());
		} catch (ClassNotFoundException cE) {
			System.out.println("Class Not Found Exception: "+ cE.toString());
		}
		return conn;
	}


	public static void main(String[] args) {
		Connection conn = getConnect("PHAMVIETLINH", "dbKhachHang");
		if (conn != null){
			System.out.println("Da ket noi toi CSDL SQL Server thanh cong");
		}
		else{
			System.out.println("Da ket noi toi CSDL SQL Server that bai");
		}
	}

}
