package com.itwillbs.domain;

import lombok.Data;

@Data
public class ctOngoingProjectDTO {
	
	// (클라이언트) 프로젝트 진행 중 
	private int proj_no;
	private String proj_title;
	private String manager_nm;
	private String proj_status;
	
}