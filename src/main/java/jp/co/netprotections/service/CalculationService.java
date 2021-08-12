package jp.co.netprotections.service;

import org.springframework.stereotype.Service;

import jp.co.netprotections.dto.ValueRequestDto;
import jp.co.netprotections.dto.ValueListRequestDto;
import jp.co.netprotections.dto.ValueListResponseDto;
import jp.co.netprotections.service.CalculationService;

@Service
public interface CalculationService {
	public int calculate(ValueRequestDto request);
	public ValueListResponseDto createResponse(ValueListRequestDto requestList);
}
