<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>View Sample Page</title>
</head>
<body>
<h2>Hello! World!</h2>
    <c:forEach var="item" items="${list}" varStatus="totCnt">
        ${totCnt}, Hello! ${item.data01}
        <br />
    </c:forEach>
</body>
</html>
