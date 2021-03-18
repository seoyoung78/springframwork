<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="/WEB-INF/views/common/header.jsp" %>

<div>
	<h6>링크를 이용해서 파라미터 전달</h6>
	<a class="btn btn-info btn-sm" href="method1?kind=freeboard&pageNo=5">GET 방식 파라미터 전송</a>
	<hr/>
	
	<h6>폼을 이용해서 파라미터 전달</h6>
	<form method="post" action="method2">
	  <div class="form-group">
	    <label for="uemail">Email address</label>
	    <input type="email" class="form-control" id="uemail" name="uemail" aria-describedby="emailHelp">
	    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
	  </div>
	  <div class="form-group">
	    <label for="upassword">Password</label>
	    <input type="password" class="form-control" id="upassword" name="upassword">
	  </div>
	  <div class="form-group form-check">
	    <input type="checkbox" class="form-check-input" id="upublic" name="upublic">
	    <label class="form-check-label" for="upublic">공개</label>
	  </div>
	  <button type="submit" class="btn btn-primary">로그인</button>
	</form>
	
</div>
							
<%@ include file="/WEB-INF/views/common/footer.jsp" %>