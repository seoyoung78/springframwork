<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="/WEB-INF/views/common/header.jsp" %>

<div>
	<%-- 메뉴 내용 부분 --%>
	method01form.jsp
	<hr/>
	<form method="get" action="method1">
		<div class="form-group">
			<lable for="name">이름</lable>
			<input id="name" type="text" class="form-control" name="name"/>
		</div>
		<input class="btn btn-success btn-sm" type="submit" value="전송">
	</form>
</div>

<%@ include file="/WEB-INF/views/common/footer.jsp" %>