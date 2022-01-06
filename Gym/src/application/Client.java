package application;

public class Client {
	// 고객 아이디
	private String id;
	// 고객 비밀번호
	private String password;
	// 회원 번호
	private int client_id; 
	private static int count;
	
	public Client(String id, String password) {
		this.id = id;
		this.password = password;
		count++;
		client_id = count;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "회원 [회원번호 = " + client_id + " 아이디= " + id + " 비밀번호 = " + password + "]";
	}
	
	public static int getCount(){
		return count;
	}
}
