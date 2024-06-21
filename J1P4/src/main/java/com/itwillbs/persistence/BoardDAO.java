package com.itwillbs.persistence;

import java.util.List;

import com.itwillbs.domain.Criteria;
import com.itwillbs.domain.FreelancerVO;
import com.itwillbs.domain.ProjectVO;

public interface BoardDAO {
	
	// 프로젝트 목록
//	public List<ProjectVO> projList();
	
	// 프로젝트 갯수 세기
	public int pNum();
	
	// 목록 페이징
	public List<ProjectVO> pListPaging(Criteria cri);
	
	// 프로젝트 정렬하기
	public List<ProjectVO> proLSort(Criteria cri);
	
	// 프로젝트 필터
	public List<ProjectVO> proFi(Criteria cri);
	// 필터된 갯수
	public int fiNum(ProjectVO vo);
	
	// 프로젝트 상세페이지 이동
	public ProjectVO dePro(int proj_no);
	public ProjectVO dePro(ProjectVO vo);
	
	// 북마크 등록
	
	// 북마크 삭제
	
	// 프리랜서 페이징
	public List<FreelancerVO> fListPaging(Criteria cri);
	// 프리랜서 수
	public int fNum();
	// 프리랜서 정렬
	
	// 프리랜서 필터
	
	// 프리랜서 상세페이지

}
