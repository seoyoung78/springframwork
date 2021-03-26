<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="/WEB-INF/views/common/header.jsp" %>

<div>
	
	<div class="alert alert-success">
		게시물 입력
	</div>

	<form method="post"
				action="createWithAttach?${_csrf.parameterName}=${_csrf.token}" 
				enctype="multipart/form-data">
		<%-- <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>	 --%> <!-- multipartform data로 넘기면 사용할 수 없음 -->
	  <div class="form-group">
	    <label for="btitle">제목</label>
	    <input type="text" class="form-control" id="btitle" name="btitle">
	  </div>
	  <div class="form-group">
	    <label for="bcontent">내용</label>
	    <input type="text" class="form-control" id="bcontent" name="bcontent">
	  </div>
	  <div class="form-group">
		  <label for="battach">첨부</label>
		  <input type="file" class="form-control-file" id="battach" name="battach" multiple="multiple">
		</div>
	  <button type="submit" class="btn btn-primary">저장</button>
	</form>
	
</div>
							
<%@ include file="/WEB-INF/views/common/footer.jsp" %>