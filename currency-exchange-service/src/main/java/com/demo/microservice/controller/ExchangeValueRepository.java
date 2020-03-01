package com.demo.microservice.controller;

import org.springframework.stereotype.Repository;

import com.demo.microservice.dto.ExchangeValue;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{
	
	
	public ExchangeValue findByFromAndTo(String from, String to);

}
