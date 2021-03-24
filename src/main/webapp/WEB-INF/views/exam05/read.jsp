<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<div>
	
	<div class="alert alert-success">
		게시물 내용
	</div>

	<div class="form-group">
    <label>번호</label>
    <input type="text" class="form-control" value="${board.bno}" readonly="readonly">
  </div>

  <div class="form-group">
    <label>제목</label>
    <input type="text" class="form-control" value="${board.btitle}" readonly="readonly">
  </div>
  
  <div class="form-group">
    <label>내용</label>
    <input type="text" class="form-control" value="${board.bcontent}" readonly="readonly">
  </div>	
	
	<div class="form-group">
    <label>글쓴이</label>
    <input type="text" class="form-control" value="${board.bwriter}" readonly="readonly">
  </div>
  	
	<div class="form-group">
    <label>날짜</label>
    <input type="text" class="form-control" value='<fmt:formatDate value="${board.bdate}" pattern="yyyy-MM-dd"/>' readonly="readonly">
  </div>	
	
	<div class="form-group">
    <label>조회수</label>
    <input type="text" class="form-control" value="${board.bhitcount}" readonly="readonly">
  </div>	
	
	<div class="mb-3">
		<div class="mb-1">첨부</div><br/>
		<c:if test="${board.battachoname != null}">
			<a href="downloadAttach?bno=${board.bno}">
				<img src="downloadAttach?bno=${board.bno}" width="200"/>
			</a>
			
		</c:if>		
	</div>
	
	<div>
		<button class="btn btn-primary btn-sm" onclick="getList(1)">목록</button>
		<button class="btn btn-danger btn-sm" onclick="updateForm(${board.bno})">수정</button>
		<button class="btn btn-danger btn-sm" onclick="deleteBoard(${board.bno})">삭제</button>
	</div>
	
</div>							