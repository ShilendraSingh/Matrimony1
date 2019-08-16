package com.hcl.matrimonyapplication.api.repository;
/***
 * @author Anuradha
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.matrimonyapplication.api.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, String> {

	public User findByUserId(String userId);
}
