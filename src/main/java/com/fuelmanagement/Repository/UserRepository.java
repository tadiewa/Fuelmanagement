package com.fuelmanagement.Repository;

import com.fuelmanagement.domain.UserAccounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserAccounts,Long> {

      UserAccounts findByuserName (String userName);
}
