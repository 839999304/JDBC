package com.summer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnUtil {

	private Connection conn = null;

	/**
	 * 获取连接
	 * 
	 * @return
	 */
	public Connection getConn() {
		try {
			Class.forName(PropertiesData.driver);
			// System.out.println(PropertiesData.url+","+PropertiesData.name+","+PropertiesData.password+",");
			conn = DriverManager.getConnection(PropertiesData.url, PropertiesData.name, PropertiesData.password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;

	}

	public void closeall(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		System.out.println(rs + "," + pstmt + "," + conn);
		if (null != rs) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (null != pstmt) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (null != conn) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
