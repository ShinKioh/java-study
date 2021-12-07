package booklist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Booklist 
{
	Connection con; // 1.멤버변수
	Statement stmt;
	ResultSet rs;
	
	//1.변수
//	int bookid;
//	String bookname;
//	String publisher;
//	int price;
	
	//2.배열
//	int bookidArr[];
//	String booknameArr[] = new String[10];
//	String publisherArr[] = new String[10];
//	int priceArr[] = new int[10];
	
	//3.객체
//	Book bookObj;
	
	//4.객체 배열
	private Book bookArr[];
	
	
	//2.생성자
	Booklist()
	{
		//2.배열
//		bookidArr = new int[10]; //배열의 초기화는 생성자에서 한다(변수 마찬가지)
//		booknameArr = new String[10];
//		publisherArr = new String[10];
//		priceArr = new int[10];
		
//		bookObj = new Book();//여기 아님!
		
		//4.객체 배열 초기화
		bookArr = new Book[10];
	}

	//3.메소드
	void getConnection() {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "c##madang"; // c##추가
		String pwd = "c##madang"; // c##추가

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("데이터베이스 연결 준비 .....");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void getBook() { // 생성자
		String query = "SELECT bookid, bookname, publisher, price FROM book";
		try {
			stmt = con.createStatement(); // 2
			rs = stmt.executeQuery(query); // 3
			System.out.println("BOOK ID \tBOOK NAME \t\tPUBLISHER \t\t\tPRICE");
			
			int i = 0;	
			while (rs.next()) {
//				System.out.print("\t" + rs.getInt(1));
//				System.out.print("\t" + rs.getString(2));
//				System.out.print("\t\t\t" + rs.getString(3));
//				System.out.println("\t\t\t\t" + rs.getInt(4));
				
				//1.변수
//				bookid    = rs.getInt(1);
//				bookname  = rs.getString(2);
//				publisher = rs.getString(3);
//				price     = rs.getInt(4);
//				
//				printBook(bookid, bookname, publisher, price);
				
				//2.배열							
//				bookidArr[i]    = rs.getInt(1);
//				booknameArr[i]  = rs.getString(2);
//				publisherArr[i] = rs.getString(3);
//				priceArr[i]     = rs.getInt(4);
//				i++;
				
				//3.객체
//				bookObj = new Book(rs.getInt(1),
//								   rs.getString(2),
//								   rs.getString(3),
//								   rs.getInt(4));
//				printObj(bookObj);
				
				//4.객체 배열
				bookArr[i] = new Book(rs.getInt(1),
								      rs.getString(2),
								      rs.getString(3),
								      rs.getInt(4));
				i++;
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Book[] getBookArr() {
		return bookArr;
	}

//	public void setBookArr(Book[] bookArr) {
//		this.bookArr = bookArr;
//	}
	
	//1.변수용
//	void printBook(int bookid, String bookname, String publisher, int price)
//	{
//		System.out.print("\t" + bookid 
//						+"\t" + bookname 
//						+"\t" + publisher 
//						+"\t" + price
//						+"\n");
//	}
//	
//	//2.배열 출력용
//	void printBookArr()
//	{
//		for(int i=0; i<bookidArr.length; ++i)
//			System.out.println("\t" + bookidArr[i]  
//							  +"\t" + booknameArr[i] 
//							  +"\t" + publisherArr[i] 
//							  +"\t" + priceArr[i]
//							  );
//	}
	
//	//3.객체 출력용
//	void printObj(Book book)
//	{
//		System.out.print("\t" + book.bookid 
//						+"\t" + book.bookname 
//						+"\t" + book.publisher 
//						+"\t" + book.price
//						+"\n");
//	}
	
	//4.객체배열 출력용 -> 임마를 Book 클래스 독립시켜줌
//	void printObjArr()
//	{
//		for(int i=0; i<bookArr.length; ++i)
//		{
//			//private으로 바꾸면 이거는 안됨!
////			System.out.print("\t" + bookArr[i].bookid 
////							+"\t" + bookArr[i].bookname 
////							+"\t" + bookArr[i].publisher 
////							+"\t" + bookArr[i].price
////							+"\n");
//			System.out.print("\t" + bookArr[i].getBookid() 
//							+"\t" + bookArr[i].getBookname()
//							+"\t" + bookArr[i].getPublisher()
//							+"\t" + bookArr[i].getPrice()
//							+"\n");
//		}
//	}
	
	

//	public static void main(String args[]) { // 메소드이면서 프로그램실행에 관여함
//		BookList so = new BookList();
//		so.sqlRun();
//	}
}