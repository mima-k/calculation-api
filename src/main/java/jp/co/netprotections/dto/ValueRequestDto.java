package jp.co.netprotections.dto;

import org.springframework.stereotype.Component;

@Component
public class ValueRequestDto {
	private	int value;
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
