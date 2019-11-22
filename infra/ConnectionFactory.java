package infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	
private DataSource dataSource;
	
	
	public ConnectionPool() {
		
		MysqlDataSource mysqlDataSource = new MysqlDataSource();
		
		String url = "jdbc:mysql://localhost/locadora?useSSL=false";
		
		mysqlDataSource.setURL(url);
		mysqlDataSource.setUser("root");
		mysqlDataSource.setPassword("230912mon");
		
		this.dataSource = mysqlDataSource;
		
	}
	
	
	public Connection getConexao() throws SQLException {
		System.out.println("Tentando conectar ...");
		
		Connection conexao = dataSource.getConnection();
		
		System.out.println("Conectado com sucesso ...");
		
		return conexao;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public Connection getConnectionMySQL() {
//		try {
//			return DriveManager.getConnection("jdbc:mysql://localhost/locadora?useSSL=false" , "root","230912mon");
//		
//		} catch (SQLException e) {
//			throw new RunTimeExcepetion(e);
//		}
//
//	}
}
	
	
	
	


