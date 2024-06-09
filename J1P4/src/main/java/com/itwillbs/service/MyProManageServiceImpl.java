package com.itwillbs.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.itwillbs.domain.FreelancerVO;
import com.itwillbs.domain.ProjectVO;
import com.itwillbs.persistence.MyProManageDAO;

@Service
public class MyProManageServiceImpl implements MyProManageService {

	private static final Logger logger = LoggerFactory.getLogger(MyProManageServiceImpl.class);
	
	@Inject
	private MyProManageDAO mpmdao;

	@Override
	public String getDBTime() {
		
		return mpmdao.getTime();
	}

	@Override
	public List<ProjectVO> interestProjectList() {
		logger.debug("interestProjectList() 실행");

		return mpmdao.interestProjectList();
	}

	@Override
	public List<ProjectVO> proposedProjectList() {
		logger.debug("proposedProjectList() 실행");
		
		return mpmdao.proposedProjectList();
	}
	
	@Override
	public List<ProjectVO> applyingProjectList() {
		logger.debug("applyingProjectList() 실행");
		
		return mpmdao.applyingProjectList();
	}

	@Override
	public List<ProjectVO> endApplyProjectList() {
		logger.debug("endApplyProjectList() 실행");
		
		return mpmdao.endApplyProjectList();
	}

	@Override
	public List<ProjectVO> contractProjectList() {
		logger.debug("contractProjectList() 실행");
		
		return mpmdao.contractProjectList();
	}

	@Override
	public List<ProjectVO> ongoingProjectList() {
		logger.debug("ongoingProjectList() 실행");
		
		return mpmdao.ongoingProjectList();
	}

	@Override
	public List<ProjectVO> waitEvaluationProjectList() {
		logger.debug("waitEvaluationProjectList() 실행");
		
		return mpmdao.waitEvaluationProjectList();
	}

	@Override
	public List<ProjectVO> completedProjectList() {
		logger.debug("completedProjectList() 실행");
		
		return mpmdao.completedProjectList();
	}

	@Override
	public List<FreelancerVO> interestFreelancerList() {
		logger.debug("interestFreelancerList() 실행");
		
		return mpmdao.interestFreelancerList();
	}

	@Override
	public List<FreelancerVO> proposeFreelancerList() {
		logger.debug("proposeFreelancerList() 실행");
		
		return mpmdao.proposeFreelancerList();
	}

	@Override
	public List<ProjectVO> underReviewProjectList() {
		logger.debug("underReviewProjectList() 실행");
		
		return mpmdao.underReviewProjectList();
	}

	@Override
	public List<ProjectVO> temSaveProjectList() {
		logger.debug("temSaveProjectList() 실행");
		
		return mpmdao.temSaveProjectList();
	}

	@Override
	public List<ProjectVO> regFailedProjectList() {
		logger.debug("regFailedProjectList() 실행");
		
		return mpmdao.regFailedProjectList();
	}

	@Override
	public List<ProjectVO> recruitingProjectList() {
		logger.debug("recruitingProjectList() 실행");
		
		return mpmdao.recruitingProjectList();
	}

	@Override
	public List<ProjectVO> ctContractProjectList() {
		logger.debug("ctContractProjectList() 실행");
		
		return mpmdao.ctContractProjectList();
	}

	@Override
	public List<ProjectVO> ctOngoingProjectList() {
		logger.debug("ctOngoingProjectList() 실행");
		
		return mpmdao.ctOngoingProjectList();
	}

	@Override
	public List<FreelancerVO> waitEvaluationFreelancerList() {
		logger.debug("waitEvaluationFreelancerList() 실행");
		
		return mpmdao.waitEvaluationFreelancerList();
	}

	@Override
	public List<FreelancerVO> completedFreelancerList() {
		logger.debug("completedFreelancerList() 실행");
		
		return mpmdao.completedFreelancerList();
	}
	
	
}
