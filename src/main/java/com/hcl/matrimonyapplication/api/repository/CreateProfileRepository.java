package com.hcl.matrimonyapplication.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.matrimonyapplication.api.entity.CreateProfile;

@Repository
public interface CreateProfileRepository extends JpaRepository<CreateProfile, Long>{

	@Query("Select cp from CreateProfile cp where cp.age=:age or cp.caste=:caste or cp.motherTongue=:motherTongue ")
	public List<CreateProfile> searchProfileByAgeOrCasteOrMotherTongue(@Param(value = "age") int age,@Param(value="caste") String caste,@Param(value="motherTongue") String motherTongue);
}
