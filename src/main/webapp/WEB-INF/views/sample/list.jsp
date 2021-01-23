<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>View Sample Page</title>
  <script src="/js/sample_list.js"></script>
</head>
<body>
<h2>Hello! World!</h2>
  <c:forEach var="item" items="${list}" varStatus="totCnt">
    ${totCnt}, Hello! ${item.data01}
    <br/>
  </c:forEach>
<div>
  <section>
      <div>
        <h2>검색조건</h2>
        <div>컬럼1</div><div><input type="text" name="s_con"></div>
        <div><input type="button" id="search" value="검색"></div>
      </div>
      <div><input type="text" name="result_cnt"></div>
      <table>

      </table>
  </section>
</div>
</body>
</html>
