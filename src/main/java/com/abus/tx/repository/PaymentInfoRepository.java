package com.abus.tx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abus.tx.entity.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,String> {
}
