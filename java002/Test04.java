package java002;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test04 {
	public static void main(String[] args) throws Exception {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection conn = DriverManager.getConnection("jdbc:odbc:xytest");
		String sql = "select  学号，姓名，性别，生日，单位  from table";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		String no = null;
		String name = null;
		String sex = null;
		String bir = null;
		String danwei = null;
		// while (rs.next()) {
		no = rs.getString(1);
		name = rs.getString(2);
		sex = rs.getString(3);
		bir = rs.getString(4);
		danwei = rs.getString(5);
		System.out.println(no + "," + name + "," + sex + "," + bir + ","
				+ danwei);
	}
}
