<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="/WEB-INF/views/common/header.jsp" %>

<script>
	$(function() {
		getList(1);
	});
	
	const getList = (pageNo) => {
		const args = {url:"list", method:"get"}
		if (pageNo) {
			args.data = {pageNo};
		} 
		$.ajax(args). then(data => {
			$("#board").html(data)
		});
		
		/* if (pageNo) {
			$.ajax({
				url: "list",
				data: {pageNo}, // 속성명과 속성값이 동일할 경우 생략 가능
				method: "get" // 기본적으로는 get 방식
			}).then(data => {
				$("#board").html(data); // html 조각을 넣겠다
			});
		} else {
			$.ajax({
				url: "list",
				data: {pageNo}, // 속성명과 속성값이 동일할 경우 생략 가능
				method: "get" // 기본적으로는 get 방식
			}).then(data => {
				$("#board").html(data); // html 조각을 넣겠다
			});
		} */
	};
	
	const read = (bno) => {
		$.ajax({
			url: "read",
			data: {bno:bno}, // 속성명과 속성값이 동일할 경우 생략 가능
			method: "get" // 기본적으로는 get 방식
		}).then(data => {
			$("#board").html(data); // html 조각을 넣겠다
		});
	};
	
	const updateForm = (bno) => {
		$.ajax({
			url: "updateForm",
			data: {bno}, // 속성명과 속성값이 동일할 경우 생략 가능
			method: "get" // 기본적으로는 get 방식
		}).then(data => {
			$("#board").html(data); // html 조각을 넣겠다
		});
	};
	
	const update = (bno) => {
		event.preventDefault(); // form 태그의 기본 submit 기능 끄기
		const btitle = $("#btitle").val();
		const bcontent = $("#bcontent").val();
		$.ajax({
			url: "update",
			data: {bno, btitle, bcontent}, 
			method: "post" 
		}).then(data => {
			if(data.result == "success") {
				getList(1);	
			}
		});
	};
	
	const deleteBoard = (bno) => {
		$.ajax({
			url: "delete",
			data: {bno}, // 속성명과 속성값이 동일할 경우 생략 가능
			method: "get" // 기본적으로는 get 방식
		}).then(data => {
			if(data.result == "success") {
				getList(1);	
			}
		});
	};
	
	const createForm = () => {
		$.ajax({
			url: "createForm",
			method: "get" 
		}).then(data => {
			$("#board").html(data);
		});
	}; 
	
	const create = () => {
		event.preventDefault();
		const btitle = $("#btitle").val();
		const bcontent = $("#bcontent").val();
		const battach = $("#battach")[0].files[0] // 엘리먼트 객체에 대한 여러개 파일 중 0인덱스에 있는 파일
		
		const formData = new FormData(); // multipart/form-data로 데이터 형식을 생성
		formData.append("btitle", btitle);
		formData.append("bcontent", bcontent);		
		if (battach) {
			formData.append("battach", battach);
		} 
		
		$.ajax({
			url: "create",
			data: formData,
			method: "post",
			cache: false,
			processData: false,
			contentType: false
		}).then(data => {
			if(data.result == "success") {
				getList(1);	
			}
		});	
	}; 
</script>

<div>
	<div class="alert alert-primary">
		AJAX를 이용한 게시판
	</div>
	
	<div id="board">
	</div>
</div>
							
<%@ include file="/WEB-INF/views/common/footer.jsp" %>