<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="../include/headerCt.jsp" %>

	<h1>/myProManageCt/ctOngoingProject.jsp</h1> <br>
	
<section>
	<div class="col-md-12">
		<div class="box box-default">
			<div class="box-header with-border">
				<h1>프로젝트 진행 중</h1>
				진행 중 프로젝트를 확인할 수 있습니다..
			</div>
		</div>
	</div>
</section>	
<div class="col-md-12">
	<div class="box box-default">
		<div class="box-header with-border">
			<section>
				<table class="table table-bordered bg-light table-striped">
					<tr class="text-center">
						<td>프로젝트 번호</td>
						<td>프로젝트 이름</td>
						<td>담당 매니저</td>
						<td>진행 상태</td>
					</tr>
					<c:forEach var="copDTO" items="${ctOngoingProjectList}">
						<tr>
							<td>${copDTO.proj_no }</td>
							<td>${copDTO.proj_title }</td>
							<td>${copDTO.manager_nm }</td>
							<td>
		                        <c:choose>
		                            <c:when test="${copDTO.proj_status == '계약'}">
		                                <button>결제하기</button>
		                            </c:when>
		                            <c:otherwise>
		                               <button>완료하기</button>
		                            </c:otherwise>
		                        </c:choose>
							</td>
						</tr>
					</c:forEach>
				</table>
			</section>
		</div>
	</div>
</div>


<!-- 외형만 복사. 작동원리 탐구 필요. -->
<div class="dataTables_paginate paging_simple_numbers" id="example2_paginate">
	<ul class="pagination">
		<li class="paginate_button previous disabled" id="example2_previous"><a href="#" aria-controls="example2" data-dt-idx="0" tabindex="0">Previous</a></li>
		<li class="paginate_button active"><a href="#" aria-controls="example2" data-dt-idx="1" tabindex="0">1</a></li>
		<li class="paginate_button "><a href="#" aria-controls="example2" data-dt-idx="2" tabindex="0">2</a></li>
		<li class="paginate_button "><a href="#" aria-controls="example2" data-dt-idx="3" tabindex="0">3</a></li>
		<li class="paginate_button "><a href="#" aria-controls="example2" data-dt-idx="4" tabindex="0">4</a></li>
		<li class="paginate_button "><a href="#" aria-controls="example2" data-dt-idx="5" tabindex="0">5</a></li>
		<li class="paginate_button "><a href="#" aria-controls="example2" data-dt-idx="6" tabindex="0">6</a></li>
		<li class="paginate_button next" id="example2_next"><a href="#" aria-controls="example2" data-dt-idx="7" tabindex="0">Next</a></li>
	</ul>
</div>

<%@ include file="../include/footer.jsp" %>
	