package jp.co.netprotections.dto;

import java.util.List;
import java.util.ArrayList;

public class ValueListResponseDto {
	private List<ValueResponseDto> valueListResponse;
	
	public ValueListResponseDto() {
		valueListResponse = new ArrayList<ValueResponseDto>();
	}
	
	public void addSquareValue(ValueResponseDto Response) {
		valueListResponse.add(Response);
		System.out.println(valueListResponse);
	}
}
