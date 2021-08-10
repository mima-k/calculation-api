package jp.co.netprotections.dto;

import java.util.List;

public class ValueListResponseDto {
	private List<ValueResponseDto> valueListResponse;
	
	public void addSquareValue(ValueResponseDto Response) {
		valueListResponse.add(Response);
	}
}
