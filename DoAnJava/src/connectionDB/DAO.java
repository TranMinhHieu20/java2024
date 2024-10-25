package connectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	private static final String DB_URL = "jdbc:sqlserver://LAPTOP\\SQLEXPRESS:1433;databaseName=QLBH;integratedSecurity=true;encrypt=true;trustServerCertificate=true";
	private static final String USER_NAME = "sa";
	private static final String PASSWORD = "123456789";

	// Phương thức để tạo kết nối với DB
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			System.err.println("Driver không tìm thấy: " + e.getMessage());
		} catch (SQLException e) {
			System.err.println("Kết nối thất bại: " + e.getMessage());
		}
		return conn;
	}

	// Phương thức để đóng kết nối
	public static void closeConnection(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				System.err.println("Không thể đóng kết nối: " + e.getMessage());
			}
		}
	}
}
