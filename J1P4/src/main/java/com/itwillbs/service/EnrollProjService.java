package com.itwillbs.service;

import com.itwillbs.domain.ProjectVO;
import com.itwillbs.domain.RegionVO;
import com.itwillbs.domain.SkillVO;

public interface EnrollProjService {
	
	// 프로젝트 등록
	public void insertProj(ProjectVO vo);
	
	// 프로젝트 임시저장
	public boolean saveProj(ProjectVO vo);
	
	// 스킬 등록
	public void insertSkill(SkillVO vo);
	
	// 지역 등록
	public void insertReg(RegionVO vo);
	
	// 프로젝트 임시저장 여러번
	public void multiSaveProj(ProjectVO vo);
	
}
