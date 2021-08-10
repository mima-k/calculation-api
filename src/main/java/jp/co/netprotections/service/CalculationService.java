package jp.co.netprotections.service;

import org.springframework.stereotype.Service;

import jp.co.netprotections.dto.ValueRequestDto;
import jp.co.netprotections.dto.ValueResponseDto;

@Service
public interface CalculationService {
	public ValueResponseDto calculate(ValueRequestDto request);
}
