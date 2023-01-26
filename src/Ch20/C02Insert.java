package Ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class C02Insert {
	public static void main(String[] args) {
		String id ="root";
		String pw ="1234";
		String url ="jdbc:mysql://localhost/testdb444";	//연결 URL (DBMS 마다 상이함 )
		
		//DB연결 객체 관련 참조변수
		Connection conn = null;				//DB연결 객체용 참조변수
		PreparedStatement pstmt = null;		//SQL쿼리 전송 객체용 참조변수
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		// 1. 드라이브 메모리 적재
			System.out.println("Driver load...");
			
			conn = DriverManager.getConnection(url,id,pw);	// 2. DB 연결
			System.out.println("DB Connected...");
			
			// 3. SQL 쿼리 객체 받아오기
			pstmt = conn.prepareStatement("INSERT INTO table_student (id, name, addr, phone) VALUES (?, ?, ?, ?)");
			
			System.out.println("id, 이름, 주소, 핸드폰 번호를 입력하시오.");
			int id2 = sc.nextInt();
			String name = sc.next();
			String addr = sc.next();
			String phone = sc.next();
			
			pstmt.setInt(1, id2);
			pstmt.setString(2, name);
			pstmt.setString(3, addr);
			pstmt.setString(4, phone);
			
			// 4. SQL 쿼리 전송(추가, 수정, 삭제 -> excuteUpdate )
			int result = pstmt.executeUpdate();
			
			if(result > 0 ) {
				System.out.println("INSERT 성공...");
			} else {
				System.out.println("INSERT 될 내용이 없습니다.");
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
