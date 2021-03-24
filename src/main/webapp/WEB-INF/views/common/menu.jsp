<%@ page contentType="text/html; charset=UTF-8"%>

<ul class="nav flex-column">
  <li class="nav-item">
    <h6 class="text-white">Controller</h6>
    <a class="nav-link text-warning" href="<%=application.getContextPath() %>">
    	홈페이지</a>
    <a class="nav-link text-warning" href="${pageContext.request.contextPath}/exam01/boardlist">
    	Controller에서 JSP로 데이터 전달</a>  
    <a class="nav-link text-warning" href="${pageContext.request.contextPath}/exam02/method1form">
    	한글 복원을 위한 문자열 인코딩</a>
    <a class="nav-link text-warning" href="${pageContext.request.contextPath}/exam02/method2">
    	리다이렉트(요청 재 지정)</a>
   	<a class="nav-link text-warning" href="${pageContext.request.contextPath}/exam02/method3">
   	요청 방식별 Controller의 메소드 실행</a>
   	<a class="nav-link text-warning" href="${pageContext.request.contextPath}/exam03/content">
   	요청 파라미터 받기</a>
   	<a class="nav-link text-warning" href="${pageContext.request.contextPath}/exam04/content">
   	DB 연동</a>
   	<a class="nav-link text-warning" href="${pageContext.request.contextPath}/exam05/content">
   	AJAX 연동</a>
  </li>
</ul>