<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@ include file="../include/freeHeader.jsp"%>

<div class="container light-style flex-grow-1 container-p-y" style="width:1100px; ">
	<div class="card overflow-hidden card-2" >
		<div class="row no-gutters row-bordered row-border-light">

		    <!-- 사이드 메뉴 시작 -->
			<div class="col-md-3 pt-0">
				<div class="list-group list-group-flush account-settings-links" style="width:274px;">
					<h4 class="font-weight-bold py-1 mx-4 my-3">내 프로젝트 관리</h4>
					<a class="list-group-item list-group-item-action" 
					href="${pageContext.request.contextPath}/myProManage/interestProject">관심프로젝트</a>
					<a class="list-group-item list-group-item-action" 
					href="${pageContext.request.contextPath}/myProManage/proposedProject">제안받은 프로젝트</a>
					<a class="list-group-item list-group-item-action" 
					href="${pageContext.request.contextPath}/myProManage/applyingProject">지원중</a>
					<a class="list-group-item list-group-item-action" 
					href="${pageContext.request.contextPath}/myProManage/endApplyProject">지원종료</a>
					<a class="list-group-item list-group-item-action" 
					href="${pageContext.request.contextPath}/myProManage/contractProject">계약 진행중</a>
					<a class="list-group-item list-group-item-action" 
					href="${pageContext.request.contextPath}/myProManage/ongoingProject">프로젝트 진행중</a>
					<a class="list-group-item list-group-item-action"
					href="${pageContext.request.contextPath}/myProManage/waitEvaluationProject">평가대기중</a>
					<a class="list-group-item list-group-item-action" 
					href="${pageContext.request.contextPath}/myProManage/completedProject">완료한 프로젝트</a>
				</div>
			</div>
			<!-- 사이드 메뉴 끝 -->

	<div class="col-md-9">
		<div class="tab-content">
			<div class="tab-pane fade active show" >
			
				<!-- card body 시작 -->
				<div class="card-body border-start" >
					<div class="border-bottom" style="position: relative; right:16px; width:1000px; padding-bottom: 10px;" >
						<h4 class="font-weight-bold mx-4 my-3">관심 프로젝트</h4>
						관심 프로젝트로 추가한 프로젝트를 확인할 수 있습니다.
					</div><br>	
					
						1. 관심 프로젝트로 추가한 프로젝트 목록입니다. <br> 
						2. [프로젝트 지원하기]버튼을 클릭하여 해당 프로젝트에 지원할 수 있습니다. <br>
					<br>
					<c:forEach var="projDTO" items="${interestProjectList}">
						<div>
							<c:choose>
								<c:when test="${projDTO.proj_status == '모집중'}">
									<span class="badge text-bg-warning">모집중</span>
								</c:when>
								<c:otherwise>
									<span class="badge text-bg-warning">모집종료</span>
								</c:otherwise>
							</c:choose>
						
							<h4>${projDTO.proj_title }</h4>
							예상 금액 ${projDTO.proj_cost } 만원 | 예상 기간 ${projDTO.work_period } 개월<br> 
							${projDTO.work_field } | ${projDTO.region } ${projDTO.district } |
		
							<!-- 스킬 버튼 -->
							<c:set var="skillList" value="${projDTO.skill_nm }" />
							<c:forEach items="${fn:split(skillList, ',')}" var="skill">
								<span class="badge text-bg-info">
									<c:out value="${skill}" />
								</span>
							</c:forEach>	
								<br> <!-- 프로젝트 지원하기  -->
								<form action="/projectDetail/applyProj" method="post">
									<input type="hidden" name="free_no" value="${projDTO.free_no }"> 
									<input type="hidden" name="proj_no" value="${projDTO.proj_no }"> 
								<input type="submit" value="지원하기">
							</form>
								등록일자 <fmt:formatDate value="${projDTO.reg_date }" pattern="yyyy-mm-dd" />
							</div>
							<hr>
						</c:forEach>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
