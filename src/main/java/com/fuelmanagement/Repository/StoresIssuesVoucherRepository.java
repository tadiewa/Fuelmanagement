package com.fuelmanagement.Repository;

import com.fuelmanagement.domain.StoresIssuesVoucher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoresIssuesVoucherRepository extends JpaRepository<StoresIssuesVoucher , Long> {
}
