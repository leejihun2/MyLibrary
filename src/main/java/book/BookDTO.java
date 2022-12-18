package book;

public class BookDTO {
	
	private String book_code;
	private String book_title;
	private String book_author; 
	private String book_genre;
	private String book_status;
	private String publisher;
	private java.sql.Date publish_date; 
	private String regi_user; 
	private java.sql.Date regi_date; 
	private String updt_user; 
	private java.sql.Date updt_date;

	
	public String getBook_code() {
		return book_code;
	}
	public void setBook_code(String book_code) {
		this.book_code = book_code;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public String getBook_genre() {
		return book_genre;
	}
	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}
	public String getBook_status() {
		return book_status;
	}
	public void setBook_status(String book_status) {
		this.book_status = book_status;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public java.sql.Date getPublish_date() {
		return publish_date;
	}
	public void setPublish_date(java.sql.Date publish_date) {
		this.publish_date = publish_date;
	}
	public String getRegi_user() {
		return regi_user;
	}
	public void setRegi_user(String regi_user) {
		this.regi_user = regi_user;
	}
	public java.sql.Date getRegi_date() {
		return regi_date;
	}
	public void setRegi_date(java.sql.Date regi_date) {
		this.regi_date = regi_date;
	}
	public String getUpdt_user() {
		return updt_user;
	}
	public void setUpdt_user(String updt_user) {
		this.updt_user = updt_user;
	}
	public java.sql.Date getUpdt_date() {
		return updt_date;
	}
	public void setUpdt_date(java.sql.Date updt_date) {
		this.updt_date = updt_date;
	} 
	 

}
