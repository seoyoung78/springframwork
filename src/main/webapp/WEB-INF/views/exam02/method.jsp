<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="/WEB-INF/views/common/header.jsp" %>

<div>
	<%-- 메뉴 내용 부분 --%>
	method.jsp
	<hr/>
	<div class="alert alert-primary">
		현재 요청 방식: <span id="method">${method}</span>
	</div>
	
	<h5>&lt;form&gt; 이용</h5>
	<form method="get" action="method3" class="mb-2 d-inline-block">
		<input class="btn btn-success btn-sm" type="submit" value="GET 전송">
	</form>
	<form method="post" action="method3" class="mb-2 d-inline-block">
		<input class="btn btn-success btn-sm" type="submit" value="POST 전송">
	</form>
	<form method="put" action="method3" class="mb-2 d-inline-block">
		<input class="btn btn-success btn-sm" type="submit" value="PUT 전송">
	</form>
	<form method="delete" action="method3" class="mb-2 d-inline-block">
		<input class="btn btn-success btn-sm" type="submit" value="DELETE 전송">
	</form>
	 <hr/>
	 
	 <h5>AJAX 이용</h5>
	 <button class="btn btn-info btn-sm" onclick="sendGet()">AJAX GET 방식 요청</button>
	 <script>
	 	const sendGet = () => {
	 		$.ajax({url:"ajaxmethod3", method: "get"})
	 				.then(data => {
	 					$("#method").html(data.method)
	 				});
	 	};
	 </script>
	 <button class="btn btn-info btn-sm"  onclick="sendPost()">AJAX POST 방식 요청</button>
	 <script>
	 	const sendPost = () => {
	 		$.ajax({url:"ajaxmethod3", method: "post"})
	 				.then(data => {
	 					$("#method").html(data.method)
	 				});
	 	};
	 </script>	 
	 <button class="btn btn-info btn-sm" onclick="sendPut()">AJAX PUT 방식 요청</button>
	 <script>
	 	const sendPut = () => {
	 		$.ajax({url:"ajaxmethod3", method: "put"})
	 				.then(data => {
	 					$("#method").html(data.method)
	 				});
	 	};
	 </script>	 
	 <button class="btn btn-info btn-sm" onclick="sendDelete()">AJAX DELETE 방식 요청</button>
	 <script>
	 	const sendDelete = () => {
	 		$.ajax({url:"ajaxmethod3", method: "detele"})
	 				.then(data => {
	 					$("#method").html(data.method)
	 				});
	 	};
	 </script>
	 
</div>

<%@ include file="/WEB-INF/views/common/footer.jsp" %>