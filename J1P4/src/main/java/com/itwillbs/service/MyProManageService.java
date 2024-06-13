package com.itwillbs.service;

import java.util.List;

import com.itwillbs.domain.FreelancerVO;
import com.itwillbs.domain.ProjectVO;
import com.itwillbs.domain.freeInfoDTO;
import com.itwillbs.domain.ApplyMgmtVO;
import com.itwillbs.domain.EvaluateProjectDTO;

public interface MyProManageService {

	// DB 시간정보 조회
	public String getDBTime();
	
	// 관심 프로젝트 목록
	public List<ProjectVO> interestProjectList();
	
	// 프로젝트 - 지원하기
	public void applyProject(ApplyMgmtVO avo);
	
	// 제안받은 프로젝트 목록
	public List<ProjectVO> proposedProjectList();
	
	// 지원 중 프로젝트 목록
	public List<ProjectVO> applyingProjectList();
	
	// 지원 중 프로젝트 - 지원취소
	public int deleteApply(ApplyMgmtVO avo);	
	
	// 지원 종료 프로젝트 목록
	public List<ProjectVO> endApplyProjectList();
	
	// 계약 진행 중 프로젝트 목록
	public List<ProjectVO> contractProjectList();
	
	// 프로젝트 진행 중 목록
	public List<ProjectVO> ongoingProjectList();
	
	// 평가 대기중 프로젝트 목록
	public List<ProjectVO> waitEvaluationProjectList();
	
	// 완료한 프로젝트 목록
	//public List<ProjectVO> completedProjectList();
	
	// 관심 프리랜서 목록
	//public List<FreelancerVO> interestFreelancerList();
	
	// 제안한 프리랜서 목록
	public List<FreelancerVO> proposeFreelancerList();
	
	// 검수중 프로젝트 목록
	public List<ProjectVO> underReviewProjectList();
	
	// 임시저장 프로젝트 목록
	public List<ProjectVO> temSaveProjectList();
	
	// 등록실패 프로젝트 목록
	public List<ProjectVO> regFailedProjectList();
	
	// 지원자 모집중 프로젝트 목록
	public List<ProjectVO> recruitingProjectList();
	
	// 계약 진행중 프로젝트 목록
	public List<ProjectVO> ctContractProjectList();
	
	// 프로젝트 진행중 목록 
	public List<ProjectVO> ctOngoingProjectList();
	
	// 평가 대기중 프리랜서 목록
	public List<FreelancerVO> waitEvaluationFreelancerList();
	
	// 완료한 프로젝트의 평가완료 프리랜서 목록
	public List<FreelancerVO> completedFreelancerList();
	
	
	
	
	
	
	// DTO 변경 적용 중
	// 평가 대기중 프로젝트 리스트
	public List<EvaluateProjectDTO> evaluateProjectList();
	
	// 평가 대기중 프로젝트 - 평가하기
	public void evaluateProject(EvaluateProjectDTO edto);	
	
	// 프로젝트 평가 여부 체크
	public int checkEvaluate(EvaluateProjectDTO edto);
	
	// 완료한 프로젝트 목록
	public List<EvaluateProjectDTO> completedProjectList();
	
	// 관심 프리랜서 목록
	public List<freeInfoDTO> interestFreelancerList();
	
	
	
	
}
