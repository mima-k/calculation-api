package jp.co.netprotections.service.impl;

import org.springframework.stereotype.Service;

import jp.co.netprotections.dto.ValueRequestDto;
import jp.co.netprotections.dto.ValueResponseDto;
import jp.co.netprotections.dto.ValueListRequestDto;
import jp.co.netprotections.dto.ValueListResponseDto;
import jp.co.netprotections.service.CalculationService;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalculationServiceImpl implements CalculationService {
	@Override
	public int calculate(ValueRequestDto request) {
		int square = request.getValue() * request.getValue();
		return square;
	}
	
	@Override
	public ValueListResponseDto createResponse(ValueListRequestDto requestList) {
		List<ValueResponseDto> calculatedList = new ArrayList<ValueResponseDto>();
		ValueListResponseDto responseList = new ValueListResponseDto();
		for(int i = 0; i < requestList.getValueListRequest().size(); i++) {
			ValueResponseDto response = new ValueResponseDto();
			ValueRequestDto request = requestList.getValueData(i);
			response.setValue(calculate(request));
			calculatedList.add(response);
		}
		responseList.setValueListResponse(calculatedList);
		return responseList;
	}
}
