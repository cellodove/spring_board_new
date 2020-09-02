<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 조회</title>
</head>
<body>
<div>
	<%@ include file="../include/nav.jsp" %>
</div>

<form action="post">
<label>제목</label>
<input type="text" name="title"  value="${view.title}" readonly="readonly"/><br />

<label>작성자</label>
<input type="text" name="writer" value="${view.writer}" readonly="readonly"/><br />

<label>내용</label>
<textarea cols="50" rows="5" name="content" readonly="readonly">${view.content}</textarea><br />

<div>
<a href="/board/modify?bno=${view.bno}">수정</a>, <a href="/board/delete?bno=${view.bno}">삭제</a>
</div>

</form>
</body>
</html>