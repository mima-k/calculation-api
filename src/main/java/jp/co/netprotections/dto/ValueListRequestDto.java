package jp.co.netprotections.dto;

import java.util.ArrayList;
import java.util.List;

public class ValueListRequestDto {
	private List<ValueRequestDto> valueListRequest;
	
	public List<ValueRequestDto> getValueListRequest() {
		return valueListRequest;
	}
	
	public ValueRequestDto getValueData(int index) {
		return valueListRequest.get(index);
	}
	
//	public void addSquareValue(ValueRequestDto request) {
//		valueListRequest.add(request);
//	}
}
