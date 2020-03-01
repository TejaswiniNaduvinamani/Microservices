package com.demo.microservice.dto;

public class LimitConfigurationDTO {
	
	private Long maximum;
	
	private Long minimum;
	
	public LimitConfigurationDTO(Long maximum, Long minimum){
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public Long getMaximaum() {
		return maximum;
	}

	public void setMaximaum(Long maximaum) {
		this.maximum = maximaum;
	}

	public Long getMinimum() {
		return minimum;
	}

	public void setMinimum(Long minimum) {
		this.minimum = minimum;
	}
	
	
	

}
