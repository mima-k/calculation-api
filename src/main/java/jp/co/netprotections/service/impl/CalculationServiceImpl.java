package jp.co.netprotections.service.impl;

import org.springframework.stereotype.Service;

import jp.co.netprotections.dto.ValueRequestDto;
import jp.co.netprotections.dto.ValueResponseDto;
import jp.co.netprotections.service.CalculationService;

public class CalculationServiceImpl implements CalculationService {
	public ValueResponseDto calculate(ValueRequestDto request) {
		ValueResponseDto response = new ValueResponseDto();
		int square = request.getValue() * request.getValue();
		response.setValue(square);
		return response;
	}
}
