package booklist;

public class Book 
{
	private int bookid;
	private String bookname;
	private String publisher;
	private int price;
	
	public Book(int bookid, String bookname, String publisher, int price) 
	{
		this.bookid = bookid;
		this.bookname = bookname;
		this.publisher = publisher;
		this.price = price;
	}

	public int getBookid() {
		return bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getPrice() {
		return price;
	}
	
	void printBook()
	{
		System.out.print("\t" + bookid 
						+"\t" + bookname 
						+"\t" + publisher 
						+"\t" + price
						+"\n");
	}

//	public void setBookid(int bookid) {
//		this.bookid = bookid;
//	}
//
//	public void setBookname(String bookname) {
//		this.bookname = bookname;
//	}
//
//	public void setPublisher(String publisher) {
//		this.publisher = publisher;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
}
