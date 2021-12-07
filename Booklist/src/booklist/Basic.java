package booklist;

public class Basic 
{
	public static void main(String args[])// 메소드이면서 프로그램실행에 관여함 
	{ 
		Booklist bookList = new Booklist();
		bookList.getConnection();
		bookList.getBook();
//		b.printBookArr();//2.배열 출력 
//		b.printObjArr();//4.객체배열 출력 - 이메소드가 BookList안에 있을경우!
		
		
//		for(int i=0; i<b.bookArr.length;++i) //private로 하면 이거 동작 안함!
//			b.bookArr[i].printBook();
		
		for(int i=0; i<bookList.getBookArr().length;++i)
			bookList.getBookArr()[i].printBook();
	}
}