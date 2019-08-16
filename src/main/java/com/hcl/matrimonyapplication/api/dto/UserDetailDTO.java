package com.hcl.matrimonyapplication.api.dto;

import lombok.Data;

/***
 * @author Anuradha
 */
@Data
public class UserDetailDTO {
	private static final long serialVersionUID = -1855263580038277712L;
	private Long profileId;
	public Long getProfileId() {
		return profileId;
	}
	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}	
}
