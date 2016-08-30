import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class MysqlDemo {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		String sql;
		String url = "jdbc:mysql://localhost:3306/king?"
				+ "user=king&password=rootroot&useUnicode=true&characterEncoding=UTF8";

		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url);
		conn.setAutoCommit(false);
		Statement stmt = conn.createStatement();
		sql = "select * from student s where s.id=1 for update";
		stmt.executeQuery(sql);
		Thread.sleep(20000);
		sql = "update student set name=5 where id=1";
		stmt.executeUpdate(sql);
		conn.commit();
		System.out.print("执行完毕");
	}
}