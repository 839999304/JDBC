package com.summer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.summer.bean.MemberBean;

public class DBTest {

	static Connection conn = null;
	static PreparedStatement pstat = null;
	static ResultSet rs = null;

	/*public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ConnUtil cu = new ConnUtil();
		conn = cu.getConn();
		pstat = conn.prepareStatement("select * from pw_members");
		
		rs = pstat.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getNString("username"));
		}
		System.out.println(rs);
		cu.closeall(conn,pstat,rs);
	}
*/
	
	public static void main(String[] args) {
		MemberBean member = new MemberBean();
		member.setEmail("''''fdafd@1212.com");
		member.setUsername("zhangshan123'");
		member.setUserstatus(1);
		System.out.println(new MemberExecute().insert(member));
		
		
		//System.out.println(new MemberExecute().deleteById(1));
		
		
	}
}
