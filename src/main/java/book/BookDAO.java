package book;

import java.util.List;
import java.util.Vector;

import common.DBConnPool;

public class BookDAO extends DBConnPool{
	
	public BookDAO() {
		super();
	}
	public List<BookDTO> celectList() {
		List<BookDTO> board = new Vector<BookDTO>();
		
		String query = " SELECT book_title, book_author FROM book ";
		
		try {
			psmt = con.prepareStatement(query);
			
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				BookDTO dto = new BookDTO();
				
				dto.setBook_title(rs.getString(1));
				dto.setBook_author(rs.getString(2));
				
				board.add(dto);
			}
		} 
		catch (Exception e) {
			System.out.println("쿼리 실행 중 예외 발생");
			e.printStackTrace();
		}
		return board;
	}
	
	
}
