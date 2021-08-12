package jp.co.netprotections.dto;

import java.util.List;
import lombok.Setter;
import java.util.ArrayList;

public class ValueListResponseDto {
	@Setter
	private List<ValueResponseDto> valueListResponse = new ArrayList<ValueResponseDto>();
	
	public ValueListResponseDto() {
		valueListResponse = new ArrayList<ValueResponseDto>();
	}
}
