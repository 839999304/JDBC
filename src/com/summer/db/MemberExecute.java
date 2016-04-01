package com.summer.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.summer.bean.MemberBean;

public class MemberExecute {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private ConnUtil connutil = new ConnUtil();

	
	public int insert(MemberBean member) { //新加成员
		conn = connutil.getConn();
		int i = 0;
		String sql = "insert into members (username,email,userstatus) values(?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getUsername());
			pstmt.setString(2, member.getEmail());
			pstmt.setInt(3, member.getUserstatus());
			System.out.println(member.getUsername() + "," + member.getEmail() + "," + member.getUserstatus());
			i = pstmt.executeUpdate();
			connutil.closeall(conn, pstmt, rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	public int updateById(MemberBean member, int id) {  //根据用户ID修改成员邮箱
		conn = connutil.getConn();
		int i = 0;
		String sql = "update members set email=? where id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getEmail());
			pstmt.setInt(2, id);
			i = pstmt.executeUpdate();
			connutil.closeall(conn, pstmt, rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

	public int deleteById(int id) {  //根据用户ID删除用户
		int i = 0;
		conn = connutil.getConn();
		String sql = "delete from members where id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			i = pstmt.executeUpdate();
			connutil.closeall(conn, pstmt, rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

}
