package com.abus.tx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abus.tx.entity.PassengerInfo;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {
}
