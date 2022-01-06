package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TalkMgr {
	
	private DBConnectionMgr pool;
	
	public TalkMgr() {
		pool = DBConnectionMgr.getInstance();
	}
	
	// 로그인 메소드 : 로그인 성공 : true, 로그인 실패 : false
	public boolean loginChk(String id, String pwd) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection(); 
			sql = "select id from tblMember2 where id=? and pwd=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			flag = rs.next(); // 결과가 있으면 true, 없으면 false
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	public static void main(String[] args) {
		TalkMgr mgr = new TalkMgr();
		System.out.println(mgr.loginChk("aaa", "1234"));
		System.out.println(mgr.loginChk("bbb", "1111"));
	}
}
