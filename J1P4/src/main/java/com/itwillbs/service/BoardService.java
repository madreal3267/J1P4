package com.itwillbs.service;

import java.util.List;

import com.itwillbs.domain.BMarkVO;
import com.itwillbs.domain.Criteria;
import com.itwillbs.domain.FreelancerVO;
import com.itwillbs.domain.ProjectVO;

public interface BoardService {
	
	// 프로젝트 목록
//	public List<ProjectVO> projList();
	
	// 프로젝트 갯수 출력
	public int pNum();
	
	// 목록 페이징
	public List<ProjectVO> pListPaging(Criteria cri);
	
	// 프로젝트 정렬
	public List<ProjectVO> proLSort(Criteria cri);
	public List<ProjectVO> proLSortD(Criteria cri);
	
	//프로젝트 필터
	public List<ProjectVO> proFi(Criteria cri);
	public int fiNum(ProjectVO vo);
	
	// 프로젝트 상세페이지
	public ProjectVO dePro(int proj_no);
	
	
	// 프리랜서 페이징
	public List<FreelancerVO> fListPaging(Criteria cri);
	
	// 프리랜서 수
	public int fNum();

	// 북마크 등록
	public void doBMark(BMarkVO vo);
	
	// 북마크 삭제
	public void deleteBMark(BMarkVO vo);
	
	// 모달 필터
	public List<ProjectVO> moFiPro(Criteria cri);
	public List<ProjectVO> moFiProNs(Criteria cri);
	public List<ProjectVO> moFiProD(Criteria cri);
	public List<ProjectVO> moFiProDNs(Criteria cri);
	// 모달 필터된 프로젝트 수
	public int mofiNum(ProjectVO vo);
	public int mofiNumNs(ProjectVO vo);
	
	// 프리랜서 정렬
	
	// 프리랜서 필터
	
	// 프리랜서 상세페이지
	
	

}