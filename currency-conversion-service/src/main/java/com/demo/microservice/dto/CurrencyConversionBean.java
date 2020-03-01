package com.demo.microservice.dto;

import java.math.BigDecimal;

public class CurrencyConversionBean {
	
	private Long id;
	
	
	private String from;
	
	private String to;

	private BigDecimal conversionMultiple;
	
	private Integer port;
	
	private Integer quantity;
	
	private BigDecimal covertedValue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getCovertedValue() {
		return covertedValue;
	}

	public void setCovertedValue(BigDecimal covertedValue) {
		this.covertedValue = covertedValue;
	}

}
