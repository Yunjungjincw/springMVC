<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function getfile(filename){
		location.href="<c:url value='/download.do'/>?filename="+filename;
	}

</script>


<title>Insert title here</title>
</head>
<body>
	<div class="container">
 		<h2>업로드 완료되었습니다.</h2>
	  <div class="panel panel-default">
	    <div class="panel-heading">Panel Heading</div>
	    <div class="panel-body">
	    <table class="table table-boarderd table-hover">
			<tr>
				<td>아이디</td>
				<td>${map.id}</td>
			</tr>	    
			<tr>
				<td>이름</td>
				<td>${map.name}</td>
			</tr>	
			<c:forEach var="fName" items="${map.fileList}">
				<tr>
					<td>${fName}</td>
					<td><a href="javascript:getfile('${fName}')"><span class="glyphicon glyphicon-file"></span></a></td>
				</tr>
			</c:forEach>   
			<tr>
				<td colspan="2" align="center">
				<a href="<c:url value='/form.do'/>">다시 업로드 하기</a>
				</td>
			</tr> 
	    </table>
	    </div>
	    <div class="panel-footer">인프런 강의</div>
	  </div>
	</div>
</body>
</html>