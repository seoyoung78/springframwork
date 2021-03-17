<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Spring</title>
		<link rel="stylesheet" href="/webapp/resources/bootstrap-4.6.0/css/bootstrap.min.css">
		<script src="/webapp/resources/js/jquery-3.5.1.min.js"></script>
		<script	src="/webapp/resources/bootstrap-4.6.0/js/bootstrap.bundle.min.js"></script>
		<script src="/webapp/resources/bootstrap-4.6.0/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="d-flex flex-column vh-100">
			<%@ include file="/WEB-INF/views/common/header.jsp"%>
			<div class="flex-grow-1 container-fluid">
				<div class="row h-100">
					<div class="col-md-4 p-3 bg-dark">
						<div class="h-100 d-flex flex-column">
							<div class="flex-grow-1"
								style="height: 0px; overflow-y: auto; overflow-x: hidden;">
								<%@ include file="/WEB-INF/views/common/menu.jsp"%>
							</div>
						</div>
					</div>
	
					<div class="col-md-8 p-3">
						<div class=" h-100 d-flex flex-column">
							<div class="flex-grow-1 overflow-auto pr-3" style="height: 0px">
								<div>
									<%-- 메뉴 내용 부분 --%>
									method01form.jsp
									<hr/>
									<form method="post" action="method1">
										<div class="form-group">
											<lable for="name">이름</lable>
											<input id="name" type="text" class="form-control" name="name"/>
										</div>
										<input class="btn btn-success btn-sm" type="submit" value="전송">
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>
