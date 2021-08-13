package jp.co.netprotections.dto;

import java.util.List;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValueListResponseDto {
	private List<ValueResponseDto> valueListResponse = new ArrayList<ValueResponseDto>();
	
	public ValueListResponseDto() {
		valueListResponse = new ArrayList<ValueResponseDto>();
	}
}
