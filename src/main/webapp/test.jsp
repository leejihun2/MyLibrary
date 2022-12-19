<%@page import="java.util.List"%>
<%@page import="book.BookDTO"%>
<%@page import="book.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test</title>
</head>
<body>
	<h2>커넥션 풀 테스트</h2>
	
	<%
	
	BookDAO dao = new BookDAO();
	List<BookDTO> dto = dao.celectList();
	for(BookDTO d : dto) {
		System.out.printf("%-20s\t %s\n",d.getBook_title(), d.getBook_author());
	}
	
	dao.close();
	%>
	
	
	
	
</body>
</html>