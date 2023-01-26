package Ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class C05SELECT {
	public static void main(String[] args) {
		String id ="root";
		String pw ="1234";
		String url ="jdbc:mysql://localhost/testdb444";	//연결 URL (DBMS 마다 상이함 )
		
		//DB연결 객체 관련 참조변수
		Connection conn = null;				//DB연결 객체용 참조변수
		PreparedStatement pstmt = null;		//SQL쿼리 전송 객체용 참조변수
		ResultSet rs = null;
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		// 1. 드라이브 메모리 적재
			System.out.println("Driver load...");
			
			conn = DriverManager.getConnection(url,id,pw);	// 2. DB 연결
			System.out.println("DB Connected...");
			
			// 3. SQL 쿼리 객체 받아오기
			pstmt = conn.prepareStatement("SELECT * FROM table_student");
			
			System.out.println("정보 전체를 조회합니다.");
			
			
			// 4. SQL 쿼리 전송(추가, 수정, 삭제 -> excuteUpdate )
			rs = pstmt.executeQuery();
			
			if ( rs != null ) {
				while(rs.next()) {
					System.out.printf("%d %s %s %s\n", rs.getInt("id"), rs.getString("name"), rs.getString("addr"), rs.getString("phone"));
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
